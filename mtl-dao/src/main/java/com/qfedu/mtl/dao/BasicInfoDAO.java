package com.qfedu.mtl.dao;

import com.qfedu.mtl.beans.BasicInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BasicInfoDAO {

    public List<BasicInfo> selectBasicInfoByGoodsId(@Param("goodsId")int goodsId,
                                                    @Param("step") int step);


    public List<BasicInfo> selectInfoDetailsByIds(String ids);

}
