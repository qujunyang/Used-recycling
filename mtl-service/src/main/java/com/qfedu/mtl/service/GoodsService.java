package com.qfedu.mtl.service;

import com.qfedu.mtl.beans.Goods;
import com.qfedu.mtl.utils.PageInfo;

public interface GoodsService {

    public PageInfo<Goods> listGoodsByBrandId(int brandId,int pageNum);

    public Goods getGoodsById(int goodsId);


}
