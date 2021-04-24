package ru.simankin.aboutmoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.simankin.aboutmoney.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);
}
