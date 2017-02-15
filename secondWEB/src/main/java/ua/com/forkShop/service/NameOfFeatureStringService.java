package ua.com.forkShop.service;

import java.util.List;

import ua.com.forkShop.entity.NameOfFeatureString;

public interface NameOfFeatureStringService {

	List<NameOfFeatureString> findAll();
	
	void delete(int id);
}
