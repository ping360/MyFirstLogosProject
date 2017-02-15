package ua.com.forkShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.forkShop.entity.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
