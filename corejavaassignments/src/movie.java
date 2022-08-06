package movie_ticket_booking; 
import java.util.*;
class Seats {
	int i;
	static int count=0;
	Scanner sc=new Scanner(System.in);
	LinkedList<String> AvailSeats=new LinkedList<>();
	ArrayList<String> arr=new ArrayList<>();
	static ArrayList<String> A=new ArrayList<>();
	static ArrayList<String> B=new ArrayList<>();
	static ArrayList<String> C=new ArrayList<>();
	static ArrayList<String> D=new ArrayList<>();
	static ArrayList<String> E=new ArrayList<>();
	Seats(){
    	for(i=0;i<10;i++)
    	{
	    	A.add("1");
	    	B.add("1");
	    	C.add("1");
	    	D.add("1");
	    	E.add("1");
	    }
    	A.set(2,"0");A.set(6,"0");
    	for(i=0;i<6;i++)
     	{
	    	B.set(i,"0");
     	}
	    for(i=0;i<10;i++)
      	{
		   if(i%2!=0)C.set(i,"0");
	    }
    	for(i=0;i<10;i++)
    	{
	    	if(i%2==0)E.set(i,"0");
    	}
    	for(i=0;i<10;i++)
    	{
    		if(A.get(i)=="0")
    		{
    			AvailSeats.add("A" + (i+1));
    			System.out.print("A" + (i+1) + " ");
    			++count;
    		}
    	}
    	for(i=0;i<10;i++)
    	{
    		if(B.get(i)=="0")
    		{
    			AvailSeats.add("B" + (i+1));
    			System.out.print("B" + (i+1) + " ");
    			++count;
    		}
    	}
    	for(i=0;i<10;i++)
    	{
    		if(C.get(i)=="0")
    		{
    			AvailSeats.add("C" + (i+1));
    			System.out.print("C" + (i+1) + " ");
    			++count;
    		}
    	}
    	for(i=0;i<10;i++)
    	{
    		if(D.get(i)=="0")
    		{
    			AvailSeats.add("D" + (i+1));
    			System.out.print("D" + (i+1) + " ");
    			++count;
    		}
    	}
    	for(i=0;i<10;i++)
    	{
    		if(E.get(i)=="0")
    		{
    			AvailSeats.add("E" + (i+1));
    			System.out.print("E" + (i+1) + " ");
    			++count;
    		}
    	}
    	System.out.println("\n\nThe number of Seats Available are : " + count);
	}
	void SelectSeats(int x)
	{
		System.out.println("Select the seats");
		for(i=0;i<x;i++)
		{
			arr.add(sc.next());
			while(!(AvailSeats.contains(arr.get(i))))
			{
				System.out.println("!! Select the Appropriate Seat !!");
				arr.remove(i);
				arr.add(sc.next());
			}
			if((arr.get(i).charAt(0)=='A'))
			{
				A.remove(((int)(arr.get(i).charAt(1))-49));
				A.add(((int)(arr.get(i).charAt(1))-49),"1");
			}
			if((arr.get(i).charAt(0)=='B'))
			{
				B.remove(((int)(arr.get(i).charAt(1))-49));
				B.add(((int)(arr.get(i).charAt(1))-49),"1");
			}
			if((arr.get(i).charAt(0)=='C'))
			{
				C.remove(((int)(arr.get(i).charAt(1))-49));
				C.add(((int)(arr.get(i).charAt(1))-49),"1");
			}
			if((arr.get(i).charAt(0)=='D'))
			{
				D.remove(((int)(arr.get(i).charAt(1))-49));
				D.add(((int)(arr.get(i).charAt(1))-49),"1");
			}
			if((arr.get(i).charAt(0)=='E'))
			{
				E.remove(((int)(arr.get(i).charAt(1))-49));
				E.add(((int)(arr.get(i).charAt(1))-49),"1");
			}
		}
	}
}
class ShowTime {
	
	int a;
	Scanner sc=new Scanner(System.in);
	HashMap<Integer,String> TM=new HashMap<>();
	ShowTime(){
		
		System.out.println("1) 11:00 AM \n2) 03:00 PM \n3) 07:00 PM \n4) 11:00 PM");
		a=sc.nextInt();
		while(a!=1 && a!=2 && a!=3 && a!=4)
		{
			System.out.println("!! Choose the Correct Timing !!");
			System.out.println("1) 11:00 AM \n2) 03:00 PM \n3) 07:00 PM \n4) 11:00 PM");
			a=sc.nextInt();
		}
		TM.put(1,"11:00 AM");
		TM.put(2,"03:00 PM");
		TM.put(3,"07:00 PM");
		TM.put(4,"11:00 PM");
		
	}
	String selectedTime()
	{
		return (TM.get(a));
	}
}
class Payment {
	
	Scanner sc=new Scanner(System.in);
	String name,PhNo;
	int y,i;
	Payment(int x,String t,ArrayList<String> arr)
	{
		System.out.println("Total Fare Rs." + (x*200) + "/- Only....!!");
		System.out.println("Press '1' to Continue Booking \nPress '2' to Terminate Booking");
		y=sc.nextInt();
		sc.nextLine();
		if(y==1)
		{
			System.out.println("Enter Your Name");
			name=sc.nextLine();
			System.out.println("Enter Your Mobile Number");
			PhNo=sc.nextLine();
			System.out.println("Preview the Entered Details \nName              : " + name + "\nMobile Number     : " + PhNo);
			System.out.print("Movie Timing      : " + t + "\nTotal Seats       : " + x + "\nSelected Seats    : ");
			for(i=0;i<x;i++)
			{
				System.out.print(arr.get(i) + " ");
			}
			System.out.println("\nAmount to be Paid : " + (x*200) + "\nEnter the Amount to Confirm the Seats");
			i=sc.nextInt();
			while(i!=(x*200))
			{
				System.out.println("!! Invalid Amount !!\nEnter " + (x*200));
				i=sc.nextInt();
			}
			System.out.println("Tickets Booked Successully\n\nThank You.....!");
		}
		else
		{
			System.out.println("Booking Terminated\n\nThank You......!");
		}
	}
}

public class movie {

	public static void main(String[] args) {
		
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Are you Admin or User? \nIf Admin press 'A' if User press 'U'");
		char ch=sc.next().charAt(0);
		while(ch!='A' && ch!='U')
		{
			System.out.println("!! You Selected Incorrect Option, Choose Correct Option !!");
			System.out.println("Are you Admin or User? \nIf Admin press 'A' if User press 'U'");
			ch=sc.next().charAt(0);
		}
		String s,s1;
		switch (ch)
		{
		case 'A':
		{
			System.out.println("Do you want to update your password? \nIf yes press 'Y', if no press 'N'");
			ch=sc.next().charAt(0);
			while(ch!='Y' && ch!='N')
			{
				System.out.println("!! You Selected Incorrect Option, Choose Correct Option !!");
				System.out.println("Do you want to update your password? \nIf yes press 'Y', if no press 'N'");
				ch=sc.next().charAt(0);
			}
			if(ch=='Y')
			{
				System.out.println("Enter Old Password");
				sc.nextLine();
				s=sc.nextLine();
				System.out.println("Enter New Password");
				s=sc.nextLine();
				System.out.println("ReEnter New Password");
				s1=sc.nextLine();
				while(!(s.equals(s1)))
				{
					System.out.println("!! Password Not Matching !!");
					System.out.println("ReEnter Old Password");
					s=sc.nextLine();
					System.out.println("Enter New Password");
					s=sc.nextLine();
					System.out.println("ReEnter New Password");
					s1=sc.nextLine();
				}
				System.out.println("Password Updated Successfully");
			}
			else
			{
				System.out.println("Exited successfully");
			}
			break;
			
		}
		case 'U':
		{
			System.out.println("Select the Show time: ");
			ShowTime time=new ShowTime();
			System.out.println("Available Seats:");
			Seats seat=new Seats();
			System.out.println("\nHow Many Seats Do You Want to Book?");
			x=sc.nextInt();
			seat.SelectSeats(x);
			new Payment(x,time.selectedTime(),seat.arr);
			break;
		}
		}
        sc.close();
	}
}