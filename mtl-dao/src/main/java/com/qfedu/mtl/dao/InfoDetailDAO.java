package com.qfedu.mtl.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * select sum(good_discount)
 * from tb_good_detail
 * where fk_good_id=1 and fk_info_detail_id in (1,2,58)
 * 之所以用 String ids 不用 List<Goods> list来装id 是为了通过String类型和 $(mappers里拼接) 来拼接id为（1,2,58）
 */

public interface InfoDetailDAO {
    public int countPriceInfoDetails(@Param("goodsId") int goodsId,
                                     @Param("ids") String ids);
}
