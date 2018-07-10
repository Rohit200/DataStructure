package Data;
import java.util.Scanner;
import  DataStruct.*;
public class BalancedChecker {

	public static void main(String[] args) 
	{
		Balanced b=new Balanced();
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the String");
		String s1=sc.nextLine();
		boolean rs=b.check(s1);
		if(rs)
			System.out.println("Balanced");
		else
			System.out.println(" Not balanced");
	}

}
