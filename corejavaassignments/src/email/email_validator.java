package email;
import java.util.*;
public class email_validator {
	public static void main(String[] args) {
		boolean b=false;
		String[] Email={"ragul123@hotmail.com","kumaran@yahoo.com","aakhash01@gmail.com","dhayasri@yahoo.com","sriman@hotmail.com","kasi@protonmail.com"};
        System.out.println("Enter your Email ID");
        Scanner sc=new Scanner(System.in);
        String Mail=sc.nextLine();
        for(int i=0;i<Email.length;i++)
        {
        	if(Mail.equalsIgnoreCase(Email[i]))
        	{
        		b=true;
        	}
        }
        if(b==true)
        {
        	System.out.println("Entered Email ID is present");
        }
        else
        {
        	System.out.println("Entered Email ID is not present");
        }
        sc.close();
	
}
}
