package com.example.tests;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import org.springframework.util.comparator.Comparators;

public class Student {
	   String name; 
	   int age; 
	   int id; 
	   public String getName() {
	      return name; 
	   } 
	   public int getAge() { 
	      return age; 
	   } 
	   public int getId() { 
	      return id; 
	   } 
	   Student(String n, int a, int i){ 
	      name = n; 
	      age = a; 
	      id = i; 
	   } 
	   @Override public String toString() {    
	      return ("Student[ "+"Name:"+this.getName()+             
	              " Age: "+ this.getAge() +                     
	              " Id: "+ this.getId()+"]"); 
	   }
	   
	   
	   public static void main(String[] args) {
		   
		   ok12 ok = new ok12();
		   ok.getCall();
		   
		   List<Student> studentlist = new ArrayList<Student>();
		      studentlist.add(new Student("Jon", 22, 1001)); 
		      studentlist.add(new Student("Steve", 19, 1003)); 
		      studentlist.add(new Student("Kevin", 23, 1005)); 
		      studentlist.add(new Student("Ron", 20, 1010)); 
		      studentlist.add(new Student("Lucy", 18, 1111));
		      System.out.println("Before Sorting the student data:"); 
		      
		      studentlist.forEach((s)->System.out.println(s));
		      
		      //studentlist.sort((Student s1, Student s2)->s1.getAge()-s2.getAge()); 
		      studentlist.sort(Comparator.comparing(Student::getAge).reversed());
		      
		      System.out.println("After Sorting the student data by Age:"); 
		      
		      
		      studentlist.forEach((s)->System.out.println(s));
		      
		      
		      System.out.println("After Sorting the student data by Name:"); 

		      //studentlist.sort((Student s1, Student s2)->s1.getName().compareTo(s2.getName()));
		      studentlist.sort(Comparator.comparing(Student::getName).reversed());
		      studentlist.forEach((s)->System.out.println(s));
		      

		      
	   }
	   
	}

class ok12{
	
	void getCall(){
		System.out.println("ok12 called");
	}
	
}