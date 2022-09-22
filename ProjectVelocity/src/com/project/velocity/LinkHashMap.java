package com.project.velocity;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("101", "pune");
		map.put("102", "amravati");
		map.put("103", "nagpur");
	
		Set<String> set = map.keySet();
		
		for (String str :set) {
			System.out.println(str);
			System.out.println(map.get(str));
		}
	}

}
