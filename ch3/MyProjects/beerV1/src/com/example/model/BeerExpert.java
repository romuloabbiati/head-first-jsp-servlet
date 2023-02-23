package com.example.model;
import java.util.*;

public class BeerExpert {

	public List<String> getBrands(String colour) {
		List<String> brands = new ArrayList<>();
		if(colour.equals("amber")) {
			brands.add("Jack Amber");
			brands.add("Red Moose");
		} else {
			brands.add("Jail Pale Ale");
			brands.add("Gout Stout");
		}
		return (brands);
	}

}
