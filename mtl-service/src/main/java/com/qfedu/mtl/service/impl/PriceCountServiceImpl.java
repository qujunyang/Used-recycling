package com.qfedu.mtl.service.impl;

import com.qfedu.mtl.beans.Goods;
import com.qfedu.mtl.dao.GoodsDAO;
import com.qfedu.mtl.dao.InfoDetailDAO;
import com.qfedu.mtl.service.PriceCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PriceCountServiceImpl implements PriceCountService {

    @Autowired
    private GoodsDAO goodsDAO;
    @Autowired
    private InfoDetailDAO infoDetailDAO;
    @Override
    public int countPrice(int goodsId, String ids) {

        Goods goods = goodsDAO.selectGoodsById(goodsId);
        int price1 = infoDetailDAO.countPriceInfoDetails(goodsId, ids);
        int price2 = goods.getGoodsCost()-price1;
        int price = price2<goods.getGoodsMinPrice()?goods.getGoodsMinPrice():price2;
        price = price>goods.getGoodsCost()?goods.getGoodsCost():price;
        return price;
    }
}
