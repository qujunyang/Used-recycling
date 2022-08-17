package com.qfedu.mtl.controller;

import com.qfedu.mtl.beans.Category;
import com.qfedu.mtl.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private CategoryService categoryService;


    @RequestMapping("/index.html")
    public String loadCategory1(Model model){
        List<Category> categoryList = categoryService.listCategories();
        model.addAttribute("categoryList",categoryList);
        return "index";
    }

    @RequestMapping("/")
    public String loadCategory2(Model model){
        List<Category> categoryList = categoryService.listCategories();
        model.addAttribute("categoryList",categoryList);
        return "index";
    }

}
