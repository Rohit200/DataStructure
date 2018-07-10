package DataStruct;
public class BankAccount
{
 double minBalance=1000;
 double balance = minBalance;
 BankingQueue q= new BankingQueue();
 public void deposit(double amt)
 {
	 balance=balance+amt;
	 System.out.println("Deposit amount is "+ amt);
	 System.out.println("Total amount in your account is "+ balance);
	 System.out.println("Size of the queue is "+q.size());
 }
 public void withdrawal(double amt)
 {
	 if((balance-amt)>minBalance)
	 {
		 balance=balance-amt;
		 System.out.println("Withdrawal amount is "+ amt);
		 System.out.println("Total amount in your account is "+ balance);
	 }
	 else
		 System.out.println("Insufficient balance "+ balance);
		 System.out.println("size of queue is "+q.size());
		  }
 public void check()
 {
	 System.out.println("Total balance in your account is "+balance);
	 System.out.println("size of queue is "+q.size());
 }
 }

