package com.exam;

import java.util.Scanner;

public class FlowerDemo {
	
	static void displayFlower()
	{
		System.out.println("The country name is india,The national flower is lotus");
		System.out.println("the country name is pakistan,The national flower is jasmine");
		System.out.println("the country name is nepal,The national flower is lali gurans");
		
	}
	static void displayFlower2()
	{
		System.out.println("The country name is germany,The national flower is corn flower");
		System.out.println("the country name is france,The national flower is lily");
		System.out.println("the country name is greece,The national flower is acanthus mollis");
		
	}
	static void displayFlower3() 
	{
		
	System.out.println("The country name is Egypt,The national flower is blue lotus");
	System.out.println("the country name is nigeria,The national flower is yellow trumpet");
	System.out.println("the country name is Kenya,The national flower is orchid");
	}


	public static void main(String[] args) {
		
		FlowerDemo d1 = new FlowerDemo();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the continent name");
		String s = sc.nextLine();
		
		
		if(s.equals("asia")) 
		{
			d1.displayFlower();
		}
		else if(s.equals("europe")) 
		{
			d1.displayFlower2();
		}
		else if(s.equals("africa"))
		{
		d1.displayFlower3();
		}
		else
		{
			System.out.println("invalid");
		}
	}
}
	


