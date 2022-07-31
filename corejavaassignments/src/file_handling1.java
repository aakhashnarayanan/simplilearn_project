package file_handling;
import java.io.*;
import java.util.Scanner;
public class file_handling1 {
public static void main(String[] args) {
		
		try
		{
	    	System.out.println("Enter file location");
		    Scanner sc=new Scanner(System.in);
		    String s=sc.nextLine();
		    File fle=new File(s);
		    if(fle.createNewFile())
			{
				System.out.println("New file is creatd");
				file(s);
			}
			else
			{
				System.out.println("File already exists");
	        	file(s);
			}
		}
		catch(Exception e)
		{
			e.getMessage();
		}

	}

	private static void file(String s) {
		
		try
		{
			Scanner sc=new Scanner(System.in);
			int i;
			do
			{
			System.out.println("Enter content to the file (put '/' at the end)");
		    DataInputStream dist=new DataInputStream(System.in);
		    FileOutputStream fost=new FileOutputStream(s,true);
        	BufferedOutputStream bost=new BufferedOutputStream(fost,1024);
	        char ch;
    	    while((ch=(char) dist.read()) !='/')
	        {
		        bost.write(ch);
	        }
          	bost.close();
          	System.out.println("File content: ");
        	FileInputStream fist=new FileInputStream(s);
	        int a;
	        while((a=fist.read())!=-1)
	        {
	         	System.out.print((char) a);
	        }
	        fist.close();
	        System.out.println("\nWant to add more content?, press 1 (or) 2 to close the file");
	        i=sc.nextInt();
			}while(i==1);
			sc.close();
			System.out.println("File closed");
	    	}
	     	catch(Exception e)
		    {
		    	e.getMessage();
		    }
	}


}
