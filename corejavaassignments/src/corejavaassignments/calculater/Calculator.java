package corejavaassignments.calculater;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		    double a,b;
		    int x,y=1;
		    Scanner sc=new Scanner(System.in);
		    while(y==1)
		    {
		    	System.out.println("Select the operation to perform \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
		        x=sc.nextInt();
		        if(x<1 || x>5)
		        {
		        	System.out.println("Enter any of the numbers 1  2  3  4");
		        	x=sc.nextInt();
		        }
		        switch(x)
		        {
		        case 1:
		        {
		        	System.out.println("Enter two numbers to Add");
		        	a=sc.nextDouble();
		        	b=sc.nextDouble();
		        	System.out.println("Ans = " + (a+b));
		        	break;
		        }
		        case 2:
		        {
		        	System.out.println("Enter two numbers to Subtract");
		        	a=sc.nextDouble();
		        	b=sc.nextDouble();
		        	System.out.println("Ans = " + (a-b));
		        	break;
		        }
		        case 3:
		        {
		        	System.out.println("Enter two numbers to Multiply");
		        	a=sc.nextDouble();
		        	b=sc.nextDouble();
		        	System.out.println("Ans = " + (a*b));
		        	break;
		        }
		        case 4:
		        {
		        	System.out.println("Enter two numbers to Divide");
		        	a=sc.nextDouble();
		        	b=sc.nextDouble();
		        	System.out.println("Ans = " + (a/b));
		        	break;
		        }
		        }
		        System.out.println("Press 1 to perform operations (or) Press 0 to close the calculator");
		        y=sc.nextInt();
		    }
		    sc.close();
		    if(y==0)
		    {
		    	System.out.println("Calculator closed");
		    }

		}
	}

	


