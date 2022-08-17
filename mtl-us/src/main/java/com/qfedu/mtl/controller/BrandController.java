package com.qfedu.mtl.controller;

import com.qfedu.mtl.beans.Brand;
import com.qfedu.mtl.service.BrandService;
import com.qfedu.mtl.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;
    //Todo 包装类作用
    /**
    控制器方法参数如果是简单类型，请使用对应的包装类
    以int为例,如果传的参是正常数字还好，如果传一个空参数就会报错，但是使用Integer就不会有这种问题,但是如果传的空参数他会
    显示传来的参数为null但是还是会报错，毕竟是无效值，
    但是你可以设置默认的参数为0来防止报错（@RequestParam(@RequestParam(defaultValue = "0")）
     */
    //针对处理异步请求的方法，返回的数据需要封装状态码和数据
    @ResponseBody
    @RequestMapping("/list")
    public ResultVO list(@RequestParam(defaultValue = "0") Integer categoryId){
        List<Brand> brandList = brandService.listBrandByCategoryId(categoryId);
        ResultVO resultVO = new ResultVO(0,"success",brandList);
        return resultVO;
    }
}
