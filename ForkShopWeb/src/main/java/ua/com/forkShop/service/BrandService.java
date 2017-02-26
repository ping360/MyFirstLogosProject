package ua.com.forkShop.service;

import java.util.List;

import ua.com.forkShop.entity.Brand;

public interface BrandService {

	List<Brand> findAll();
	
	void delete(int id);
	
	void save(Brand brand);
	
	Brand findOne(int id);
}
