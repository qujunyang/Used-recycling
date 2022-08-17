package com.qfedu.mtl.service.impl;

import com.qfedu.mtl.beans.Brand;
import com.qfedu.mtl.dao.BrandDAO;
import com.qfedu.mtl.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandDAO brandDAO;

    @Override
    public List<Brand> listBrandByCategoryId(Integer categoryId) {
        List<Brand> brands = brandDAO.selectBrandByCategoryId(categoryId);
        return brands;
    }
}
