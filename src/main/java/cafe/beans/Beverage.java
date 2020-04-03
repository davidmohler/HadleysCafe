package cafe.beans;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Beverage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	     private long id;
	     private String brand;
	     private String flavor;
	     private int purchaseCount;
	     private BigDecimal purchaseCost;
		
	     public Beverage() {
			super();
		}

		public Beverage(long id, String brand, String flavor, int purchaseCount, BigDecimal purchaseCost) {
			super();
			this.id = id;
			this.brand = brand;
			this.flavor = flavor;
			this.purchaseCount = purchaseCount;
			this.purchaseCost = purchaseCost;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getFlavor() {
			return flavor;
		}

		public void setFlavor(String flavor) {
			this.flavor = flavor;
		}

		public int getPurchaseCount() {
			return purchaseCount;
		}

		public void setPurchaseCount(int purchaseCount) {
			this.purchaseCount = purchaseCount;
		}

		public BigDecimal getPurchaseCost() {
			return purchaseCost;
		}

		public void setPurchaseCost(BigDecimal purchaseCost) {
			this.purchaseCost = purchaseCost;
		}	
		
		
}
