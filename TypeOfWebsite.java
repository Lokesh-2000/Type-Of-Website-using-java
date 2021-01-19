//Grade Marks
package quiz;
import java.util.*;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter url Below");
		url=sc.nextLine();
		int i=url.indexOf(":");
		String str=url.substring(0,i);
		System.out.println(str);
		
		
		if(str.equals("https"))
		{
			System.out.println("Hyper Text Transfer Portocol");
		}
		else if(str.equals("ftp"))
		{
			System.out.println("File Transfer Portocol");
		}
		String ext=url.substring(url.lastIndexOf(".")+1);
		if(ext.equals("com"))
		{
			System.out.println("commercial");
		}
		else if(ext.equals("org"))
		{
			System.out.println("organization");
		}
		else if(ext.equals("net"))
		{
			System.out.println("Network");
		}
	}

}
