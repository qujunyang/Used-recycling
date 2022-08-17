package com.qfedu.mtl.service;

import com.qfedu.mtl.beans.Brand;

import java.util.List;

public interface BrandService {
    public List<Brand> listBrandByCategoryId(Integer categoryId);
}
