package ua.com.forkShop.service.specification;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import ua.com.forkShop.dto.filter.FeatureDigitalFilter;
import ua.com.forkShop.dto.filter.ItemFilter;
import ua.com.forkShop.entity.Item;

public class ItemSpecification implements Specification<Item> {

	private final ItemFilter filter;

	private final List<Predicate> predicates = new ArrayList<>();

	public ItemSpecification(ItemFilter filter) {
		this.filter = filter;
	}
	
	private void filterByFeatureDigital(Root<Item> root, CriteriaQuery<?> query, CriteriaBuilder cb){
		for(FeatureDigitalFilter digitalFilter : filter.getFeatureDigitalFilter()){
	// Write code here!!!		
		}
	}
	
	private void filterByBrand(Root<Item> root, CriteriaQuery<?> query, CriteriaBuilder cb){
		if(!filter.getBrandIds().isEmpty()){
			predicates.add(root.get("brand").in(filter.getBrandIds()));
		}
	}
}
