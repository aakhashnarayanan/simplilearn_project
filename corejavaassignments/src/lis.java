package longest_increasing;
import java.util.Scanner;
public class lis {
	 static int lis1(int arr[], int n)
	    {
	        int temp[]=new int[n];
	        int i,j,x=0; 
	        for(i=0;i<n;i++)
	        {
	            temp[i]=1;
	        }
	        for(i=1;i<n;i++)
	        {
	            for(j=0;j<i;j++)
	            {
	                if (arr[i]>arr[j] && temp[i]<(temp[j]+1))
	                {
	                    temp[i]=temp[j]+1;
	                }
	            }
	        }   
	        for (i=0;i<n;i++)
	        {
	            if (x<temp[i])
	            {
	                x=temp[i];
	            }
	        }
	        return x;
	    }
	    public static void main(String args[])
	    {
	    	int n;
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the number of elements in the sequence");
	    	n=sc.nextInt();
	        int arr[] =new int[n];
	        System.out.println("Enter the elements");
	        for(int i=0;i<n;i++)
	        {
	        	arr[i]=sc.nextInt();
	        }
	        System.out.println("Length of lis is " + lis1(arr, n));
	        sc.close();
	    }
}
