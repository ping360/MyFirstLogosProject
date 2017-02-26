package ua.com.forkShop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.forkShop.entity.NameOfFeatureDigital;
import ua.com.forkShop.repository.BrandRepository;
import ua.com.forkShop.repository.NameOfFeatureDigitalRepository;
import ua.com.forkShop.service.NameOfFeatureDigitalService;

@Service
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

	@Override
	public void save(NameOfFeatureDigital nameOfFeatureDigital) {
		nameOfFeatureDigitalRepository.save(nameOfFeatureDigital);
		
	}

	@Override
	public NameOfFeatureDigital findOne(int id) {
		return nameOfFeatureDigitalRepository.findOne(id);
	}
}
