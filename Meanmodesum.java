package com.pooja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Meanmodesum {
	
	public static void Calc(ArrayList<Integer> obj) {
		double sum=0;
		for(int i=0;i<obj.size();i++) {
			sum=sum+i;
		}
		System.out.println("sum ="+sum);
		double Mean =sum/obj.size();
		System.out.println("mean ="+Mean);
	}
	
	public static double Median(ArrayList<Integer> obj) {
		Collections.sort(obj);
		if(obj.size() % 2 == 1)
			return obj.get((obj.size()+ 1)/2-1);
		else {
			double low =obj.get(obj.size() / 2-1);
			double high =obj.get(obj.size() /2);
			return(low+high)/2.0;
		}
	}
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(25);
		list.add(50);
		list.add(75);
		list.add(100);
		list.add(85);
		System.out.println(list);
		Calc(list);
		System.out.println("median :"+Median(list));
		
		
			
			
			
		}

	

	
	}
		
			




