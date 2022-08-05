package fixing_bugs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class BinSearch{
	public static boolean binSearchFunc(ArrayList<Integer> nums, int l, int r, int key) {
		if(l>r)
			return false;
		int mid = (l+r)/2;
		if(key == nums.get(mid))
			return true;
		else if(key < nums.get(mid))
			return binSearchFunc(nums, 0, mid-1, key);
		else
		    return binSearchFunc(nums, mid+1, r, key);
		
	}
}

class MergeSort{
	void merge(int a[], int beg, int mid, int end)    
	{    
	    int i, j, k;  
	    int n1 = mid - beg + 1;    
	    int n2 = end - mid;    
	      
	   /* temporary Arrays */  
	        int LeftArray[] = new int[n1];  
	        int RightArray[] = new int[n2];  
	      
	    /* copy data to temp arrays */  
	    for (i = 0; i < n1; i++)    
	    LeftArray[i] = a[beg + i];    
	    for (j = 0; j < n2; j++)    
	    RightArray[j] = a[mid + 1 + j];    
	      
	    i = 0; 
	    j = 0;   
	    k = beg; 
	      
	    while (i < n1 && j < n2)    
	    {    
	        if(LeftArray[i] <= RightArray[j])    
	        {    
	            a[k] = LeftArray[i];    
	            i++;    
	        }    
	        else    
	        {    
	            a[k] = RightArray[j];    
	            j++;    
	        }    
	        k++;    
	    }    
	    while (i<n1)    
	    {    
	        a[k] = LeftArray[i];    
	        i++;    
	        k++;    
	    }    
	      
	    while (j<n2)    
	    {    
	        a[k] = RightArray[j];    
	        j++;    
	        k++;    
	    }    
	}    
	  
	void mergeSort(int a[], int beg, int end)  
	{  
	    if (beg < end)   
	    {  
	        int mid = (beg + end) / 2;  
	        mergeSort(a, beg, mid);
	        mergeSort(a, mid + 1, end);
	        merge(a, beg, mid, end);  
	    }  
	}

	public void printArray(int[] array) {
		for(int x: array)
			System.out.print(x+" ");
		System.out.print("\n");
	} 
}

public class Main {

	public static void main(String[] args) {
	        /System.out.println("Hello World!");/
	        System.out.println("\n**************\n");
	        System.out.println("\tWelcome to TheDesk \n");
	        System.out.println("**************");
	        optionsSelection();

	    }
	    private static void optionsSelection() {
	        String[] arr = {"1. I wish to review my expenditure",
	                "2. I wish to add my expenditure",
	                "3. I wish to delete my expenditure",
	                "4. I wish to sort the expenditures",
	                "5. I wish to search for a particular expenditure",
	                "6. Close the application"
	        };
	        int[] arr1 = {1,2,3,4,5,6};
	        int  slen = arr1.length;
	        for(int i=0; i<slen;i++){
	            System.out.println(arr[i]);
	            // display the all the Strings mentioned in the String array
	        }
	        ArrayList<Integer> arrlist = new ArrayList<Integer>();
	        ArrayList<Integer> expenses = new ArrayList<Integer>();
	        expenses.add(1000);
	        expenses.add(2300);
	        expenses.add(45000);
	        expenses.add(32000);
	        expenses.add(110);
	        expenses.addAll(arrlist);
	        System.out.println("\nEnter your choice:\t");
	        Scanner sc = new Scanner(System.in);
	        int  options =  sc.nextInt();
	        for(int j=1;j<=slen;j++){
	            if(options==j){
	                switch (options){
	                    case 1:
	                        System.out.println("Your saved expenses are listed below: \n");
	                        System.out.println(expenses+"\n");
	                        optionsSelection();
	                        break;
	                    case 2:
	                        System.out.println("Enter the value to add your Expense: \n");
	                        int value = sc.nextInt();
	                        expenses.add(value);
	                        System.out.println("Your value is updated\n");
	                        expenses.addAll(arrlist);
	                        System.out.println(expenses+"\n");
	                        optionsSelection();

	                        break;
	                    case 3:
	                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
	                        int con_choice = sc.nextInt();
	                        if(con_choice==options){
	                               expenses.clear();
	                            System.out.println(expenses+"\n");
	                            System.out.println("All your expenses are erased!\n");
	                        } else {
	                            System.out.println("Oops... try again!");
	                        }
	                        optionsSelection();
	                        break;
	                    case 4:
	                        sortExpenses(expenses);
	                        optionsSelection();
	                        break;
	                    case 5:
	                        searchExpenses(expenses);
	                        optionsSelection();
	                        break;
	                    case 6:
	                        closeApp();
	                        break;
	                    default:
	                        System.out.println("You have made an invalid choice!");
	                        break;
	                }
	            }
	        }

	    }
	    private static void closeApp() {
	        System.out.println("Closing your application... \nThank you!");
	            }
	    private static void searchExpenses(ArrayList<Integer> arrayList) {
	        int leng = arrayList.size();
	        System.out.println("Enter the expense you need to search:\t");
	        
	        //My code
	        Scanner sc = new Scanner(System.in);
	        int key = sc.nextInt();
	        
	        //sorting the array for using it in binary search
	        Collections.sort(arrayList);
	        
	        boolean result = BinSearch.binSearchFunc(arrayList, 0, leng, key);
	        
	        if(result)
	        	System.out.println("\nThe expense is found\n");
	        else 
	        	System.out.println("\nThe expense is not found\n");
	    }
	    private static void sortExpenses(ArrayList<Integer> arrayList) {
	        MergeSort ms = new MergeSort();
	        int[] array = new int[arrayList.size()];
	        for (int i=0; i < array.length; i++){
	        	array[i] = arrayList.get(i).intValue();
	        }
	        ms.mergeSort(array, 0, array.length-1);
	        System.out.println("-----------Sorted Expenses------------");
	        ms.printArray(array);
	        System.out.println("---------------------------------------");
	    }

	}
