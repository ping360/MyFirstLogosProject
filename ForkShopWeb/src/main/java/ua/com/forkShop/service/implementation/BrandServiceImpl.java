package ua.com.forkShop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.forkShop.entity.Brand;
import ua.com.forkShop.repository.BrandRepository;
import ua.com.forkShop.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService{

	@Autowired
	private BrandRepository brandRepository;
	
	@Override
	public List<Brand> findAll() {
		return brandRepository.findAll();
	}
	
	@Override
	public void delete(int id){
		brandRepository.delete(id);
	}
	
}
