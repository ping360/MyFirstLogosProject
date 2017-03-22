package ua.com.forkShop.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import ua.com.forkShop.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>, JpaSpecificationExecutor<Item> {

	@Query("SELECT i FROM Item i LEFT JOIN FETCH i.category LEFT JOIN FETCH i.brand")
	List<Item> findAll();

	@Query(value = "SELECT i FROM Item i LEFT JOIN FETCH i.category LEFT JOIN FETCH i.brand", 
			countQuery = "SELECT count(i.id) FROM Item i")
	Page<Item> findAll(Pageable pageable);

	@Query("SELECT i FROM Item i WHERE i.category.id = ?1")
	List<Item> findByCategoryId(int id);
}
