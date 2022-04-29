package com.example.Apr28;

import java.util.Scanner;

public class Prac2 {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		//System.out.println(scan.next());
		
		//String str ="00001214598002191001";
		
		String str=scan.next();
		
		System.out.println(str);		
		System.out.println(seperate(str,'0'));
	}
	
	
	
	
	static String seperate(String sample,char key){
		String result = new String();
		
		for(int i=0;i<sample.length();i++){
			//System.out.println(sample.charAt(i));
			if(sample.charAt(i)!=key){
				result = result+sample.charAt(i);
			}
		}
		
		if(result.length()<sample.length()){
			int lm = sample.length() - result.length();
			for(int i=0;i<lm;i++){
				result = result+key;
			}
		}
		
		return result;
	}
	
	// result = "12145982191100000000";
	
	
	
}
