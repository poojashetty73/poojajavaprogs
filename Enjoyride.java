package com.exam;
import java.util.*;

import java.util.Scanner;

public class Enjoyride {
	public void alibaba(float hours,int ad,int ch) {
		int adult=50;
		int child=40;
		System.out.println("adult ride is:"+hours*adult*ad);
		System.out.println("child ride is:"+hours*child*ch);
		System.out.println("adult ride is:"+((hours*child*ch)+(hours*adult*ad)));
		
	}
	public void alphineslide(float hours,int ad,int ch) {
		int adult=60;
		int child=30;
		System.out.println("adult ride is:"+hours*adult*ad);
		System.out.println("child ride is:"+hours*child*ch);
		System.out.println("adult ride is:"+((hours*child*ch)+(hours*adult*ad)));
		
	}
	public void bumppercars(float hours,int ad,int ch) {
		int adult=45;
		int child=25;
		System.out.println("adult ride is:"+hours*adult*ad);
		System.out.println("child ride is:"+hours*child*ch);
		System.out.println("adult ride is:"+((hours*child*ch)+(hours*adult*ad)));
		
	}
	
		

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("no of adults");
		int adult=sc.nextInt();
		System.out.println("no of children");
		int child=sc.nextInt();
		System.out.println("no of hours");
		float hours=sc.nextFloat();
		sc.nextLine();
		System.out.println("enter ride");
		String ride=sc.nextLine();
		Enjoyride ad = new Enjoyride();
		switch(ride.toLowerCase()) {
		case "alibaba":ad.alibaba(hours, adult, child);
		break;
		case "alphineslide":ad.alphineslide(hours, adult, child);
		break;
		case "bumppercars":ad.bumppercars(hours, adult, child);
		break;
		default:System.out.println("invalid ride");
		}
		
		

	}

}
