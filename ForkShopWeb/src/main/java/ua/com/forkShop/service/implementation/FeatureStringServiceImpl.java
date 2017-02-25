package ua.com.forkShop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ua.com.forkShop.entity.FeatureString;
import ua.com.forkShop.repository.FeatureStringRepository;
import ua.com.forkShop.service.FeatureStringService;

public class FeatureStringServiceImpl implements FeatureStringService {

	@Autowired
	private FeatureStringRepository featureStringRepository;
	
	@Override
	public List<FeatureString> findAll(){
		return featureStringRepository.findAll();
	}
	
	@Override
	public void delete(int id){
		featureStringRepository.delete(id);
	}
}
