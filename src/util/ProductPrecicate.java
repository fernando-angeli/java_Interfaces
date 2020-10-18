package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPrecicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}

}
