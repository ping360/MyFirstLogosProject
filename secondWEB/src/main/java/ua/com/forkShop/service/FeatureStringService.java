package ua.com.forkShop.service;

import java.util.List;

import ua.com.forkShop.entity.FeatureString;

public interface FeatureStringService {

	List<FeatureString> findAll();
	
	void delete(int id);
}
