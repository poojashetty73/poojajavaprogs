package com.exam;

import java.util.Scanner;

public class Employee1 {

	private String name;
	private int id;
	private double salary;
	private double hra;
	private double sa;
	private double ta;
	private double tax =2500;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
	
	public double getHra()
	{
		return hra;
	}
	
	public double getSa()
	{
		return sa;
	}
	
	public void setTa(double ta)
	{
		this.ta=ta;
	}
	public double getTa()
	{
		return ta;
	}
	public void setTax(double tax)
	{
		this.tax=tax;
	}
	public double getTax()
	{
		return tax;
	}
	
	
	
	public double calNetSalary() {
		if(salary<=10000) {
			hra=2*salary;
			sa=.8*salary;
		}
		else if(salary>10000 && salary<=20000) {
			hra =.25*salary;
			sa=.9*salary;
		}
		else if(salary<=20000) {
			hra =.3*salary;
			sa=.95*salary;
		}
		return getSalary()+hra+sa+getTa()-getTax();
	}



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee1 e1 = new Employee1();
		System.out.println("enter employee id");
		e1.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("enter employee name");
		e1.setName(sc.nextLine());
		System.out.println("enter salary");
		e1.setSalary(sc.nextFloat());
		e1.setTa(.2*e1.getSalary());
		System.out.println("net salary:"+e1.calNetSalary());
		
		
		
}

}
