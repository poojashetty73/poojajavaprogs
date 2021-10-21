import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
			
			int choice;
			 int num = 9;
			
			Scanner sc = new Scanner(System.in);
			
			do{
				System.out.println("\n\n-------Syntax Generator for-------");
				System.out.println(" 1.Add two numbers");
				System.out.println(" 2.Find average of two numbers");
				System.out.println(" 3.check even or odd");
				System.out.println(" 4.check positive or negative number");
				System.out.println(" 5.check prime or not");
				System.out.println(" 6. exit");
				
				System.out.println("Choose any one:");
				choice = sc.nextInt();
				System.out.println("");
				
				switch(choice) {
				
				case 1: int a=10,b=20;
				        int sum=a+b;
				        System.out.println("The sum of 2 numbers:"+sum);
				        break;
				        
				case 2: int x=10,y=20;
		                int avg=x+y/2;
		                System.out.println("The average of 2 numbers:"+avg);
		                break;
		                
				case 3:
					     if(num%2==0)
					    	 System.out.println("Number is even");
					     else
					    	 System.out.println("Number is odd");
					     break;
					     
				case 4:  int z = 10;
				         if(z>0)
				        	 System.out.println("Number is positive");
				         else
				        	 System.out.println("Number is negetive");
				         break;
				         
				case 5:int temp;
				       boolean isPrime=true;
				       Scanner scan= new Scanner(System.in);
				       System.out.println("Enter any number:");
				
				       int num1=scan.nextInt();
			           scan.close();
			           for(int i=2;i<=num1/2;i++)
			           {
			        	   temp=num1%i;
			        	   if(temp==0)
			        	   {
			        		   isPrime=false;
			        		   break;
			        		   }
			        	   }
			           if(isPrime)
			        	   System.out.println(num1 + " is a Prime Number");
			           else
			        	   System.out.println(num1 + " is not a Prime Number");
			           break;
				case 6:
					    System.exit(1);			    				   
			   }
			}while(choice!=6);
				}
				
				
			}
		


