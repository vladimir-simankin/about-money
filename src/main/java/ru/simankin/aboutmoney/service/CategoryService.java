package ru.simankin.aboutmoney.service;

import java.util.List;
import ru.simankin.aboutmoney.model.Category;

public interface CategoryService {

    Category createCategory(Category category);

    Category updateCategory(Category category);

    void deleteCategory(Category category);

    List<Category> getAll();

    Category getCategoryById(Long id);

    Category getCategoryByName(String name);
}
