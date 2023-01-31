package com.game.presentationlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
        
		 Scanner sc = new Scanner(System.in);
		 
		 List<List<String>> matrix = new ArrayList<>();
		 
		 for(int i=0;i<5;i++) {
			 
			 List<String> l = new ArrayList<>();
			 l.add("L");
			 l.add("U");
			 l.add("D");
			 l.add("L");
			 
			 matrix.add(l);
		 }
		 
		 
		 String s = "abcd";
		 s.split(" ");
		 
		 System.out.println(s.charAt(0));
//			System.out.println("Enter tc");
//			int tc = sc.nextInt();
//			sc.nextLine();
//			
//			for(int k=0;k<tc;k++){
//				
//				System.out.println("Enter r");
//			    int r = sc.nextInt();
//			    
//			    System.out.println("Enter c");
//			    int c = sc.nextInt();
//			    
//			    sc.nextLine();
//			    String[][] matrix = new String[r][c];
//			
//	    		for(int i=0;i<r;i++) {
//	    			for(int j=0;j<c;j++) {
//	    		        System.out.println("enter string in "+i+" "+j);
//	    				matrix[i][j] = sc.next();
//	    			}
//	    		}
//	    		
//	    		for(int i=0;i<r;i++) {
//	    			for(int j=0;j<c;j++) {
//	    				System.out.print(matrix[i][j]+" ");
//	    			}
//	    			
//	    			System.out.println();
//	    		}
//	    		
//			}
	}

}
