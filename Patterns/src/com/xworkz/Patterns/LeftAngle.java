package com.xworkz.Patterns;

public class LeftAngle {

	public static void main(String[] args) {
		int num=4;
		for(int i=0;i<=num;i++) {
			for(int j=0;j<=num;j++)
			{
				if(i+j>=num) 
					System.out.println("*");
					else
						System.out.println("");
				}
				System.out.println();
			}
		}

	
}
