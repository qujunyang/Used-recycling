package com.qfedu.mtl.service.impl;

import com.qfedu.mtl.beans.BasicInfo;
import com.qfedu.mtl.dao.BasicInfoDAO;
import com.qfedu.mtl.service.BasicInfoService;
import com.qfedu.mtl.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicInfoServiceImpl implements BasicInfoService {

    @Autowired
    private BasicInfoDAO basicInfoDAO;

    @Override
    public List<BasicInfo> listBasicInfoByGoodsId(int goodsId, int step) {
        List<BasicInfo> basicInfos = basicInfoDAO.selectBasicInfoByGoodsId(goodsId,step);
        return basicInfos;
    }

    @Override
    public List<BasicInfo> listIndoDetailByIds(String ids) {
        List<BasicInfo> basicInfos = basicInfoDAO.selectInfoDetailsByIds(ids);
        return basicInfos;
    }
}
