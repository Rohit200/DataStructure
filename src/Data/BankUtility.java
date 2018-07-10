package Data;
import java.util.Scanner;
import  DataStruct.*;
public class BankUtility 
{
public static void main(String[] args)
{
		BankingQueue q= new BankingQueue();
		BankAccount ba= new BankAccount();
		while(q.isEmpty()||!q.isFull())
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the option");
			int n=sc.nextInt();
			switch(n)
			{
			case 1:System.out.println("Enter the amount");
			        double amt=sc.nextDouble();
			        ba.deposit(amt);
			        q.exit();
			        break;
			case 2:System.out.println("Enter the amount");
	               double amt1=sc.nextDouble();
	               ba.withdrawal(amt1);
	               q.exit();
	               break;
			case 3: ba.check();
			        q.exit();
			        break;
			default: System.out.println("You have selected wrong option");        
			}
		}

	}

}
