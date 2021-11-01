package com.exam;

import java.util.Scanner;

public class FlowerDemo3 {
	public static  void displayFlowers(int operator) 
     { 
       System.out.println("****Displaying Flowers****"); 
     
       
       switch (operator) {
       case '1':
       	 System.out.println("Continent Name : asia");
       	 
       	 System.out.println("_____________");
    		 System.out.println("   Country Name.  "+ "      National Flower");
    		 System.out.println("_____________");
    		 System.out.println("   india  "+ "               lotus");
    		 System.out.println("   pakistan.  "+ "           jasmine");
    		 System.out.println("   nepal.  "+ "              lali gaurs");
    		 System.out.println("_____________\n");
           break;

       case '2':
       	System.out.println("Continent Name : EUROPE");
      	 
       	 System.out.println("_____________");
   		 System.out.println("   Country Name.  "+ "      National Flower");
   		 System.out.println("_____________");
   		 System.out.println("   germany "+ "               corn flower");
   		 System.out.println("   france.  "+ "               lily");
   		 System.out.println("   greece.  "+ "              acanthus mollis");
   		System.out.println("_____________\n");
           break;

       case '3':
       	
       	System.out.println("Continent Name : AFRICA");
      	 
       	 System.out.println("_____________");
   		 System.out.println("   Country Name.  "+ "      National Flower");
   		 System.out.println("_____________");
   		 System.out.println("   egypt  "+ "               blue lotus");
   		 System.out.println("   nigeria.  "+ "           Yellow trumpet");
   		 System.out.println("   kenya.  "+ "              orchid");
   		 System.out.println("_____________\n");
           break;


       case '4':
           System.out.println("Quit  \n");
           System.exit(0);
           break;

       default:
           System.out.println("Choose an continentName To be Displayed!");
           break;
   }
   } 
public static void main(String[] args) 
{ 
	char operator;
	Scanner input = new Scanner(System.in);
	boolean loopAgain = true;
	do {
    System.out.println("Choose an continentName To be Displayed: \n 1.) Asia  \n 2.) Europe \n 3.) Africa \n 4.) or Quit-Using\n");
    System.out.println("(enter number between 1-4 to view the data)  \n");
    operator = input.next().charAt(0);
	 FlowerDemo3 fd = new FlowerDemo3(); 
     FlowerDemo3.displayFlowers(operator); 
   

	} while (loopAgain);
	
	
   } 
 }

