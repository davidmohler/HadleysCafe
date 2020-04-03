package cafe.controller;

import java.math.BigDecimal;

import org.springframework.context.annotation.Bean;

import cafe.beans.Beverage;

public class BeanConfiguration {
	@Bean
	public Beverage beverage() {
		Beverage bean = new Beverage();
			bean.setBrand("Coca Cola");
			bean.setFlavor("Coca Cola Original");
			bean.setPurchaseCount(12);
			bean.setPurchaseCost(new BigDecimal(3.27));
		return bean;
	}
}
