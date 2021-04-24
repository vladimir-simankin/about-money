package ru.simankin.aboutmoney.service.impl;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.simankin.aboutmoney.model.Category;
import ru.simankin.aboutmoney.repository.CategoryRepository;
import ru.simankin.aboutmoney.service.CategoryService;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    @Transactional
    public Category createCategory(Category category) {
        return categoryRepository.saveAndFlush(category);
    }

    @Override
    @Transactional
    public Category updateCategory(Category category) {
        return categoryRepository.saveAndFlush(category);
    }

    @Override
    @Transactional
    public void deleteCategory(Category category) {
        categoryRepository.delete(category);
    }

    @Override
    @Transactional
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    @Transactional
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    @Transactional
    public Category getCategoryByName(String name) {
        return categoryRepository.findByName(name);
    }
}
