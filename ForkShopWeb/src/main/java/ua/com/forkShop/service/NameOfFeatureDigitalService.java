package ua.com.forkShop.service;

import java.util.List;

import ua.com.forkShop.entity.NameOfFeatureDigital;

public interface NameOfFeatureDigitalService {

	List<NameOfFeatureDigital> findAll();
	
	void delete(int id);
}
