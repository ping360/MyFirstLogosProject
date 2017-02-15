package ua.com.forkShop.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "feature_digital")
public class FeatureDigital {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="_value")
	private BigDecimal value;
	
	@ManyToMany(mappedBy="featureDigitals")
	private List<Item> items = new ArrayList<>();
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_name_of_feature_digital")
	private NameOfFeatureDigital nameOfFeatureDigital;
	
	@ManyToMany
	@JoinTable(name = "digital_unit_feature_digital",
	joinColumns=@JoinColumn(name="id_feature_digital"),
	inverseJoinColumns=@JoinColumn(name="id_digital_units"))
	private List<DigitalUnit> digitalUnits = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public NameOfFeatureDigital getNameOfFeatureDigital() {
		return nameOfFeatureDigital;
	}

	public void setNameOfFeatureDigital(NameOfFeatureDigital nameOfFeatureDigital) {
		this.nameOfFeatureDigital = nameOfFeatureDigital;
	}

	public List<DigitalUnit> getDigitalUnits() {
		return digitalUnits;
	}

	public void setDigitalUnits(List<DigitalUnit> digitalUnits) {
		this.digitalUnits = digitalUnits;
	}

	
}
