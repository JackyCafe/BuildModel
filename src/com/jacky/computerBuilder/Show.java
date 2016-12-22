package com.jacky.computerBuilder;

public class Show {

	public static void main(String[] args) {
		Builder builder = new MacBookBuilder();
		Director director = new Director(builder);
		director.construct("Intel", "Retina");
		System.out.println(builder.create().toString());
	}

}
