package com.qfedu.mtl.dao;

import com.qfedu.mtl.beans.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface CategoryDAO {
    public List<Category> selectCategories();
}
