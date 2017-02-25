package ua.com.forkShop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="_name")
	private String name;
	
	@OneToMany(mappedBy="category")
	private List<Item> items = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name="category_name_of_feature_digital",
	joinColumns=@JoinColumn(name="id_category"),
	inverseJoinColumns=@JoinColumn(name="id_name_of_feature_digital"))
	private List<NameOfFeatureDigital> nameOfFeatureDigitals = new ArrayList<>();

	@ManyToMany
	@JoinTable(name="category_name_of_feature_string",
	joinColumns=@JoinColumn(name="id_category"),
	inverseJoinColumns=@JoinColumn(name="id_name_of_feature_string"))
	private List<NameOfFeatureString> nameOfFeatureStrings = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<NameOfFeatureDigital> getNameOfFeatureDigitals() {
		return nameOfFeatureDigitals;
	}

	public void setNameOfFeatureDigitals(List<NameOfFeatureDigital> nameOfFeatureDigitals) {
		this.nameOfFeatureDigitals = nameOfFeatureDigitals;
	}

	public List<NameOfFeatureString> getNameOfFeatureStrings() {
		return nameOfFeatureStrings;
	}

	public void setNameOfFeatureStrings(List<NameOfFeatureString> nameOfFeatureStrings) {
		this.nameOfFeatureStrings = nameOfFeatureStrings;
	}
	
	
}
