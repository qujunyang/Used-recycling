package com.qfedu.mtl.dao;

import com.qfedu.mtl.beans.Brand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface BrandDAO {

    public List<Brand> selectBrandByCategoryId(Integer categoryId);

}
