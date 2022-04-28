package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prac1 {
	
	static int arr1[] = new int[]{1, 5, 9, 10, 15, 20};
    static int arr2[] = new int[]{2, 3, 8};
	
	public static void main(String[] args) {
		//method2();
		method4();
		
		
	}
	
	public static void method4(){
    	int lstA[] = {1,3,5,7};
		int lstB[] = {2,4,6,8};
		
		int iA=lstA.length-2,iB=lstB.length-1,last=0;
		
		last = lstA[lstA.length-1];
		
		System.out.println(Arrays.toString(lstA));
		System.out.println(Arrays.toString(lstB));
		
		
		for(;iB>=0;iB--){
			//System.out.println("iB : "+iB);
			last = lstA[lstA.length-1];
			System.out.print("iA : "+lstA[lstA.length-2]);
			System.out.print(" iB : "+lstB[iB]);
			System.out.println(" LAST  : "+last +" :: "+lstB[iB]);
			for(iA=lstA.length-2;iA>=0 && lstA[iA]>lstB[iB];iA--){
				System.out.println("IF : "+lstA[iA]+" : "+lstB[iB]);
					lstA[iA+1]=lstA[iA];
					
				System.out.print("---> Itr : ");
				System.out.print(Arrays.toString(lstA));
				System.out.println(Arrays.toString(lstB));
			}
			if(last>lstB[iB]){
				System.out.println("Tu Chala ::: "+ last+" : "+lstB[iB]+" : "+(iA+1));
				lstA[iA+1]= lstB[iB];
				 lstB[iB]=last;
				//lstB[lstB.length-1]=last;
			}
			System.out.print("---> Result : ");
			System.out.print(Arrays.toString(lstA));
			System.out.println(Arrays.toString(lstB));
		}
		System.out.print("---> Final : ");
		System.out.print(Arrays.toString(lstA));
		System.out.println(Arrays.toString(lstB));
		
    }
	
	
	public static void method3(){
		System.out.print("Before Merging nFirst Array: ");
        System.out.println(Arrays.toString(arr1));
        System.out.print("Second Array:  ");
        System.out.println(Arrays.toString(arr2));
        
		
		merge(arr1.length,arr2.length);
		 System.out.print("After Merging nFirst Array: ");
	        System.out.println(Arrays.toString(arr1));
	        System.out.print("Second Array:  ");
	        System.out.println(Arrays.toString(arr2));
    }
     
    static void merge(int m, int n)
    {
        // Iterate through all elements of ar2[] starting from
        // the last element
        for (int i=n-1; i>=0; i--)
        {
            /* Find the smallest element greater than ar2[i]. Move all
               elements one position ahead till the smallest greater
               element is not found */
            int j, last = arr1[m-1];
            
            for (j=m-2; j >= 0 && arr1[j] > arr2[i]; j--){
            	System.out.println(arr1[j] +" : "+arr2[i]+" : "+ (arr1[j] > arr2[i]));
                arr1[j+1] = arr1[j];
                System.out.println(Arrays.toString(arr1));
            }
      
            // If there was a greater element
            if (j != m-2 || last > arr2[i])
            {
                arr1[j+1] = arr2[i];
                arr2[i] = last;
            }
        }
    }
	
    
	public static void method2(){

		int lstA[] = {1,2,3,4};
		int lstB[] = {1,3,4,7};
		int fSize= lstA.length+lstB.length;
		int lstC[]=new int[fSize];
		
		int iA=0;
		int iB=0;
		int iC=0;
		
		
		System.out.println(lstA);
		System.out.println(lstB);
	     
        // Traverse both array
        while (iA<lstA.length && iB <lstB.length){
			//System.out.println("Value : "+lstA[iA]+" : "+lstB[iB]+" : "+(lstA[iA]<lstB[iB]));
			
			if(lstA[iA]<lstB[iB]){
				lstC[iC++]=lstA[iA++];
			}else{
				lstC[iC++]=lstB[iB++];
			}
			
			System.out.print("\t lstC : ");
			for(int i=0;i<lstC.length;i++){
	        	System.out.print(lstC[i]+" , ");
	        }
			System.out.println("");
			
		}
        
        System.out.println(iA +" : "+iB+" : "+iC);
        
        System.out.println(iA +" : "+(iA<lstA.length));
        
        while(iA<lstA.length){
        	System.out.println("remaining : "+lstA[iA]+" : "+lstC[iC]);
        	lstC[iC++]=lstA[iA++];
        	//System.out.println(" : "+lstC[iC]);
        }
        while(iB<lstB.length){
        	lstC[iC++]=lstB[iB++];
        }
        
        
        
        
        System.out.println("Result : ");
        for(int i=0;i<lstC.length;i++){
        	System.out.print(lstC[i]+" , ");
        }
		
	}
	

	public void method1(){
		List<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(3);
		list.add(1);

		System.out.println(list);

		int a;
		for(int k=0;k<list.size();k++){
			for(int i=0;i<list.size()-(k+1);i++){
				if( list.get(i)>list.get(i+1)){
					a = list.get(i+1);
					list.set(i+1,list.get(i)) ;
					list.set(i,a);
				}       
			}
		}

		System.out.println(list);
	}
}
