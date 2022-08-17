package com.qfedu.mtl.service;

import com.qfedu.mtl.beans.Category;
import org.springframework.stereotype.Service;

import java.util.List;
public interface CategoryService {
    public List<Category> listCategories();
}
