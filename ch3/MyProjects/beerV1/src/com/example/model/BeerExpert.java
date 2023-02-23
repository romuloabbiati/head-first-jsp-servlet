package com.example.model;
import java.util.*;

public class BeerExpert {

	public List getBrands(String colour) {
		List brands = new ArrayList();
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
