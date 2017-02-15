package ua.com.forkShop.service;

import java.util.List;

import ua.com.forkShop.entity.DigitalUnit;

public interface DigitalUnitService {

	List<DigitalUnit> findAll();
	
	void delete(int id);
}
