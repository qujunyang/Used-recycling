package com.qfedu.mtl.controller;

import com.qfedu.mtl.beans.BasicInfo;
import com.qfedu.mtl.beans.Goods;
import com.qfedu.mtl.beans.Order;
import com.qfedu.mtl.beans.User;
import com.qfedu.mtl.service.BasicInfoService;
import com.qfedu.mtl.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private BasicInfoService basicInfoService;
    @Autowired
    private OrderService orderService;
    @RequestMapping("/create")
    public String createOrder(Goods goods, Integer price, String ids, Model model){
        List<BasicInfo> basicInfoList = basicInfoService.listIndoDetailByIds(ids);
        model.addAttribute("goods",goods);
        model.addAttribute("ids",ids);
        model.addAttribute("price",price);
        model.addAttribute("basicInfoList",basicInfoList);
        return "trade";
    }
    @RequestMapping("/save")
    public String saveOrder(Order order,Integer goodsId,String ids ,HttpServletRequest request){
        // 获取当前登录的用户ID,存放到order
        User user =(User) request.getSession().getAttribute("user");
        order.setUserId(user.getUserId());
        String orderId = orderService.addOrder(order,goodsId,ids);
        if(orderId!=null){
            request.setAttribute("orderId",orderId);
            request.setAttribute("tips","订单添加成功!");
        }else {
            request.setAttribute("tips","订单添加失败!");
        }
        return "order-tips";

    }


}