package ru.simankin.aboutmoney.api.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.simankin.aboutmoney.model.Category;
import ru.simankin.aboutmoney.service.CategoryService;
import ru.simankin.aspect.logging.annotation.Logging;

@RestController
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @Logging
    @GetMapping("category/all")
    public List<Category> getAllCategories() {
        return categoryService.getAll();
    }

    @Logging
    @GetMapping("category/category-by-name")
    public @ResponseBody
    Category getCategoryByName(
            @RequestParam("name") String name
    ) {
        return categoryService.getCategoryByName(name);
    }

    @Logging
    @GetMapping("category/category-by-id")
    public @ResponseBody
    Category getCategoryById(
            @RequestParam("id") Long id
    ) {
        return categoryService.getCategoryById(id);
    }

    @Logging
    @PostMapping("category/create")
    public Category createCategory(
            @RequestBody Category category
    ) {
        return categoryService.createCategory(category);
    }

    @Logging
    @PutMapping("category/update")
    public Category updateCategory(
            @RequestBody Category category
    ) {
        return categoryService.updateCategory(category);
    }

    @Logging
    @DeleteMapping("category/delete")
    public void deleteCategory(
            @RequestBody Category category
    ) {
        categoryService.deleteCategory(category);
    }
}
