package ua.com.forkShop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ua.com.forkShop.entity.NameOfFeatureDigital;
import ua.com.forkShop.repository.NameOfFeatureDigitalRepository;
import ua.com.forkShop.service.NameOfFeatureDigitalService;

public class NameOfFeatureDigitalServiceImpl implements NameOfFeatureDigitalService {

	@Autowired
	private NameOfFeatureDigitalRepository nameOfFeatureDigitalRepository;
	
	@Override
	public List<NameOfFeatureDigital> findAll(){
		return nameOfFeatureDigitalRepository.findAll();
	}
	
	@Override
	public void delete(int id){
		nameOfFeatureDigitalRepository.delete(id);
	}
}
