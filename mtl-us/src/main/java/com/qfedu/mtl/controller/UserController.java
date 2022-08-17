package com.qfedu.mtl.controller;

import com.qfedu.mtl.beans.Category;
import com.qfedu.mtl.beans.User;
import com.qfedu.mtl.service.CategoryService;
import com.qfedu.mtl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private CategoryService categoryService;
    @RequestMapping("/login")
    public String login(@RequestParam(value = "userName") String userName,@RequestParam(value = "userPassword") String userPwd, HttpServletRequest request){
        User user = userService.check(userName,userPwd);
        String pagePath="login";
        if (user==null){
            request.setAttribute("tips","账号或密码错误");
        }else {
            pagePath="index";
            HttpSession session = request.getSession();
            session.setAttribute("user",user);

            //因为跳转到index.html需要加载一级分类，因此在跳转之前需要传递一级分类集合
            List<Category> categoryList = categoryService.listCategories();
            request.setAttribute("categoryList",categoryList);

        }
        return pagePath;
    }
}
