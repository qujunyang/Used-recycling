package com.qfedu.mtl.filters;

import com.qfedu.mtl.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@Component
@WebFilter("/")
public class LoginFilter implements Filter {
private String[] excludePath={"/","/index.html","/brand/list","/goods/listByBrand","/basicInfo/list","/price/count","/login.html","/user/login"};
private String[] excludeExts={".jpg",".css",".js",".png",".ico",".gif"};
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        HttpServletResponse response=(HttpServletResponse) servletResponse;
        //1.获取请求路径
        String uri=request.getRequestURI();
//        System.out.println("uri:"+uri);
        //2.如果此请求的路径是非受限资源，则直接放行
        boolean b = judge(uri);
        if(b){
            //非受限资源正常访问
            filterChain.doFilter(servletRequest, servletResponse);//放行
        }else{
            //表示受限资源，需要验证是否登入
            HttpSession session = request.getSession();
            if(session.getAttribute("user")==null){
                //未登入
                request.setAttribute("tips","请先登录!");
                request.getRequestDispatcher("/login.html").forward(request,response);
            }else {
                //登入了
                filterChain.doFilter(servletRequest, servletResponse);//放行
            }
        }
    }
    private boolean judge(String path){
        boolean flag=false;
        for (String s: excludePath) {
            if (s.equals(path)){
                flag=true;
                break;
            }
        }
        for (String ext: excludeExts) {
            if (path.endsWith(ext)){
                flag=true;
                break;
            }
        }
        return flag;
    }
}
