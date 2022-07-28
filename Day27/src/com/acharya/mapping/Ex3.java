package com.acharya.mapping;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {

	public static void main(String[] args) {
		Map<String,String> b = new HashMap<>();
		b.put("Vishwa", "Rama");
		b.put("vikas","abd");
		b.put("ravi", "vk");
		System.out.println(b);
		System.out.println(b.get("ravi"));
		System.out.println(b.get("v"));

	}

}
