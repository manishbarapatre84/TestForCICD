package com.example.Apr28;

public class Prac3 {
	
	public static void main(String[] args) {
		
		int il = 0;
		String str = new String();
		
		for(int i=0;i<10;i++){
			
			str =  new String(Math.random()+"");
			//System.out.println(str);
			//System.out.println(str.substring(str.length()-3, str.length()));
			il = Integer.parseInt(str.substring(str.length()-3, str.length()));
			//System.out.println("------" +il);
			
			if(il>=100 && il<=200){
				System.out.println(il);
			}
			
		}
	}
	
	
	
	static void random(){
		//write a program to generate a unique  random number between 100 to 200
		
	}

}
