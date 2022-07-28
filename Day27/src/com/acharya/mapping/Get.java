package com.acharya.mapping;
import java.util.Map;
import java.util.HashMap;

public class Get {

	public static void main(String[] args) {
		Map<String,String> b = new HashMap<>();
		b.put("Vishwa", "Rama");
		b.put("vikas","abd");
		b.put("ravi", "vk");
		System.out.println(b);
		System.out.println(b.get("ravi"));

	}

}
