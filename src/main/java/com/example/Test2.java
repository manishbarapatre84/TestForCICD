package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2 {
	
	public static void main(String[] args) {
		

		 List<String> list = Arrays.asList("geeks", "gfg", "g",
                 "e", "e", "k", "s");
		 
		 list.stream().map(String::toUpperCase).forEach(System.out::println);
		
		 List<Integer> num = Arrays.asList(1,2,3,4,5);
	        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
	        System.out.println(collect1); //[2, 4, 6, 8, 10]
		
		List<Element> lstElement = new ArrayList<Element>();
		
		lstElement.add(new Element("1", "Test"));
		lstElement.add(new Element("2", "Test2"));
		lstElement.add(new Element("3", "Test3"));
		
		
		
		Map<String, Element> kvs1 = lstElement.stream()
				.collect(Collectors.toMap(Element::getId,Function.identity()));
		
		System.out.println(kvs1);
		
		
		
		Map<String, Double> kvs =
			    Arrays.asList("a:1.0", "b:2.0", "c:3.0")
			        .stream()
			        .map(elem -> elem.split(":"))
			        .filter(elem -> elem.length==2)
			        .collect(Collectors.toMap(e -> e[0], e -> Double.parseDouble(e[1])));
	
		System.out.println(kvs);
	}

}

class Element{
	
	String id;
	String name;
	public Element(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
