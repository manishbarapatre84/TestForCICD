package com.example;

public class Test1 {
	
	public static void main(String[] args) {
		
		System.out.println("Called");
		
		Node left = new Node();
		left.setValue(2);
		
		Node right = new Node();
		right.setValue(3);
		
		
		Node mainNode = new Node();
		mainNode.setValue(1);
		mainNode.setLeft(left);
		mainNode.setRight(right);
		
		Node trv = new Node();
		trv = mainNode;
		
		while(trv!=null){
			System.out.println(trv.getValue());
			//System.out.println(trv.getRight().getValue());
			trv = trv.getRight();
		}
	}
}
//BFS , DFS
