package com.qfedu.mtl.controller;

import com.qfedu.mtl.beans.Goods;
import com.qfedu.mtl.service.impl.GoodsServiceImpl;
import com.qfedu.mtl.utils.PageInfo;
import com.qfedu.mtl.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品的业务请求处理
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsServiceImpl goodsService;
    @ResponseBody
    @RequestMapping("/listByBrand")
    public ResultVO list(Integer brandId,@RequestParam(defaultValue = "1") Integer pageNum){
        PageInfo<Goods> goodsPageInfo = goodsService.listGoodsByBrandId(brandId,pageNum);

        ResultVO success = new ResultVO(0, "success", goodsPageInfo);
        return success;
    }
}
