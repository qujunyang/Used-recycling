package com.qfedu.mtl.controller;

import com.qfedu.mtl.beans.BasicInfo;
import com.qfedu.mtl.beans.Goods;
import com.qfedu.mtl.service.BasicInfoService;
import com.qfedu.mtl.service.GoodsService;
import com.qfedu.mtl.service.impl.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/basicInfo")
public class BasicInfoController {
    @Autowired
    private GoodsService goodsService;

    @Autowired
    private BasicInfoService basicInfoService;

    @RequestMapping("/list")
    public String list(Integer goodsId,Model model){

        Goods goods = goodsService.getGoodsById(goodsId);
        List<BasicInfo> step1List = basicInfoService.listBasicInfoByGoodsId(goodsId, 1);
        List<BasicInfo> step2List = basicInfoService.listBasicInfoByGoodsId(goodsId, 2);
        List<BasicInfo> step3List = basicInfoService.listBasicInfoByGoodsId(goodsId, 3);

        model.addAttribute("goods",goods);
        model.addAttribute("step1List",step1List);
        model.addAttribute("step2List",step2List);
        model.addAttribute("step3List",step3List);
        return "info";

    }

}
