package ua.com.forkShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.forkShop.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
