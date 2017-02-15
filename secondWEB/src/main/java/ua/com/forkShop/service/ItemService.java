package ua.com.forkShop.service;

import java.util.List;

import ua.com.forkShop.entity.Item;

public interface ItemService {

	List<Item> findAll();

	void delete(int id);
	
	List<Item> findByCategoryId(int id);
}
