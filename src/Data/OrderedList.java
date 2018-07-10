package Data;

import DataStruct.*;

public class OrderedList
{
	  Node1 start;
	    ListUtilityInt nu=new ListUtilityInt();
	    void getDataFromFile()
	    {
	        int[] retArry =nu.integerFileReader();
	        int[] sortArray =nu.sort(retArry);
	        int size =retArry.length;
	        System.out.println("Array Size is "+size);
	        for(int i=0;i<size;i++)
	        {

	            addItem(retArry[i]);
	        }
	    }

	    // Function for Lsit
	    public void List()
	    {
	        if(start ==null)
	        {
	            System.out.println("List is Empty ");
	        }
	    }

	    // add item Function
	    public void addItem(int data)
	    {
	        Node1 head =start;
	        Node1 temp =new Node1(data);
	        temp.data =data;
	        temp.nextNode =null;
	        if(start == null)
	        {
	            start = temp;
	        }
	        else
	        {
	            while(head.nextNode != null)
	            {
	                head=head.nextNode;
	            }
	            head.nextNode=temp;
	        }
	    }

	   // Display Function
	   public  void display()
	   {
	        Node1 temp =start;
	        while( temp != null)
	        {
	            System.out.print(temp.data+"---->");
	            temp=temp.nextNode;
	        }
	        System.out.println(" ");
	    }

	   // Size of Function
	   public  int size()
	   {
	        int count=0;
	        Node1 temp =start;
	        while( temp.nextNode != null)
	        {
	            temp=temp.nextNode;
	            count++;
	        }
	        System.out.println("sizze of Linked List"+count);
	        return count;
	   }

	   // Serching of a Word Function
	   public void searchData()
	   {
	        Node1 temp = start;
	        int count=0;
	        System.out.println("Enter a number to Search");
	        int s =nu.inputInteger();
	        int flag=0;
	        while(temp.nextNode != null)
	        {
	            
	            if( temp.data==s)
	            {
	                System.out.println(" number is found At "+count);
	                flag++;
	                break;
	                
	            }
	            temp=temp.nextNode;
	            count++;
	        }

	        if(flag == 1)
	        {
	            removeData(count);
	        }
	        else
	        {
	            addItem(s);
	            System.out.println("After Adding a LIst ");
	            display();
	        }
	    }

	    // removeWord From a Linked lIst
	    void removeData(int count)
	    {
	        Node1 temp = start;
	        if(count==0)
	        {
	            start =start.nextNode;
	            System.out.println("After Deleting LIst is ");
	            display();
	        }
	        if(count ==count)
	        {
	        	Node1 previous =null;
	        	while(temp.nextNode!=null)
	        	{
	        		previous =temp;
	        		temp=temp.nextNode;
	        	}
	        	previous.nextNode=null;
	        }
	        else
	        {
				for(int i=0;i<count-1;i++)
				{
				 	temp=temp.nextNode;
				}
	        temp.nextNode =temp.nextNode.nextNode;
	        System.out.println("After Deleting LIst is ");
	        display();
	        }
	    }

	    public static void main(String[] args)
	    {
	        OrderedList obj = new OrderedList();
	        obj.getDataFromFile();
	        obj.display();
	        obj.size();
	       	obj.searchData();
	    }



		

}
