package corejavaassignments.calculater;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		    double a,b;
		    int x,c=1;
		    Scanner sc=new Scanner(System.in);
		    while(c==1)
		    {
		    	System.out.println("Select the operation to perform \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
		        x=sc.nextInt();
		        if(x<1 || x>5)
		        {
		        	System.out.println("Enter 1 (or) 2 (or) 3 (or) 4");
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
		        c=sc.nextInt();
		    }
		    sc.close();
		    if(c==0)
		    {
		    	System.out.println("Calculator closed");
		    }

		}
	}

	


