package ua.com.forkShop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ua.com.forkShop.entity.DigitalUnit;
import ua.com.forkShop.repository.DigitalUnitRepository;
import ua.com.forkShop.service.DigitalUnitService;

public class DigitalUnitServiceImpl implements DigitalUnitService{

	@Autowired
	private DigitalUnitRepository digitalUnitRepository;
	
	@Override
	public List<DigitalUnit> findAll(){
		return digitalUnitRepository.findAll();
	}
	
	@Override
	public void delete(int id){
		digitalUnitRepository.delete(id);
	}
}
