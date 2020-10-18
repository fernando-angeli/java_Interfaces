package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv",900.00));
		list.add(new Product("Mouse",50.00));
		list.add(new Product("Tablet",350.50));
		list.add(new Product("HD Case",80.90));

		/*
		 * Desta forma é possivel receber o valor de min que pode ser ajustado pelo usuario
		 */
		double min = 100.00;
		
		list.removeIf(p -> p.getPrice() >= min);
	
		for(Product p : list) {
			System.out.println(p);
		}	
	}
}
