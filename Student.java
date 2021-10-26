package com.association;

public class Student {
	
	private String name;
	private int rollno;
	private String city;

	public void setName(String name) {
		this.name=name;
	}
	public void setRollno(int rollno)  {
		this.rollno=rollno;
	}
	public void setCity(String city)  {
		this.city=city;
	}
    
	public void StudentDetails()
	{
		System.out.println("The name is "+name+" and the rollno is"+rollno+"and the city is"+city);
	}
}
	
	

	
	


