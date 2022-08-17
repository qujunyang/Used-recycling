package com.qfedu.mtl.dao;

import com.qfedu.mtl.beans.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsDAO {
    public List<Goods> selectGoodsByBrandIdWithPage(@Param("brandId") int brandId,
                                                    @Param("start") int start,
                                                    @Param("limit") int limit);
    public int selectCountByBrandId(int brandId);

    public Goods selectGoodsById(int goodsId);

}
