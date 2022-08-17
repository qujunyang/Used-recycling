package com.qfedu.mtl.service.impl;

import com.qfedu.mtl.beans.Category;
import com.qfedu.mtl.dao.CategoryDAO;
import com.qfedu.mtl.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDAO categoryDAO;
    @Override
    public List<Category> listCategories() {
        List<Category> categories = categoryDAO.selectCategories();
        return categories;
    }
}
