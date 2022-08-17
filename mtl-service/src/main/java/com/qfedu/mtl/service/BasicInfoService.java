package com.qfedu.mtl.service;

import com.qfedu.mtl.beans.BasicInfo;

import java.util.List;

public interface BasicInfoService {
    public List<BasicInfo> listBasicInfoByGoodsId(int goodsId, int step);

    /**
     * 根据已经选中的选项ID查询选项详情 以及选项对应的评估项
     * @return
     */

    public List<BasicInfo> listIndoDetailByIds(String ids);
}
