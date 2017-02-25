package ua.com.forkShop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ua.com.forkShop.entity.NameOfFeatureString;
import ua.com.forkShop.repository.NameOfFeatureStringRepository;
import ua.com.forkShop.service.NameOfFeatureStringService;

public class NameOfFeatureStringServiceImpl implements NameOfFeatureStringService {

	@Autowired
	private NameOfFeatureStringRepository nameOfFeatureStringRepository;
	
	@Override
	public List<NameOfFeatureString> findAll(){
		return nameOfFeatureStringRepository.findAll();
	}
	
	public void delete(int id){
		nameOfFeatureStringRepository.delete(id);
	}
}
