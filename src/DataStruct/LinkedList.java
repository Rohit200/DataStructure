package DataStruct;
import java.util.Scanner;
import java.io.*;
public class LinkedList
{
 public Node head;
 String fname;
 int c;

 public LinkedList()
 {
     this.head = null;
     getFileName();
 	readFileContents();

 }
public  void add(int data)
{
	Node node=new Node(data);
		if(head==null)
	{
		head=node;
	}
	else
	{
		Node n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=node;
	}
}
public  void add1(String data1)
{
	Node node=new Node(data1);
		if(head==null)
	{
		head=node;
	}
	else
	{
		Node n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=node;
	}
}
public void deleteAt(int index)
{
	if(index==0)
	{
		head=head.next;
	}
	else
	{
		Node n=head;
		Node n1=null;
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
		}
		n1=n.next;
		n.next=n1.next;
	}
}
	public  void addNotFound(int s)
	{
			add(s);
	}
			public boolean search(int s)
	{
		Node n=head;
		while(n.next!=null)
		{
			if(n.data==s)
			{
				break;
			}
		}
		if(n.next==null)
		return true;
		else
			return false;
	}
	public boolean removeSpecific(int thing)
	{
		 Node previous = null; 
		 Node current = head;
	         while (current != null)
	         {
	            if(current.data==thing)
	            {
	              current = current.next;
		      if (previous == null)
		    	  
		    	  previous = current;
	              else
	            previous.next = current;
	              return true;
	            } 
	            else
	            {
	              previous = current;
	              current = current.next;
		    }
	         } //end while
	         return false;
	}
	public boolean removeString(String thing)
	{
		 Node previous = null; 
		 Node current = head;
	         while (current != null)
	         {
	            if(thing.compareTo((current.next).data1)==0)
	            {
	              current = current.next;
		      if (previous == null)
		    	  
		    	  previous = current;
	              else
	            previous.next = current;
	              return true;
	            } 
	            else
	            {
	              previous = current;
	              current = current.next;
		    }
	         } //end while
	         return false;
	}
	public void display()
	{
		Node n=head;
		while(n.next!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
		
	}
	
    public  int size()
    {
    	
    	Node n=head;
		while(n.next!=null)
		{
			n=n.next;
			c++;
		}
		c++;
		return c;
    }
    public boolean isEmpty()
    {
    	return c==0;
    }
   
  public Node sortedMerge(Node a, Node b) 
    {
        Node result = null;
        /* Base cases */
        if (a == null)
            return b;
        if (b == null)
            return a;
 
        /* Pick either a or b, and recur */
        if (a.data <= b.data) 
        {
            result = a;
            result.next = sortedMerge(a.next, b);
        } 
        else
        {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
 
    }
 
   public Node mergeSort(Node h) 
    {
        // Base case : if head is null
        if (h == null || h.next == null)
        {
            return h;
        }
 
        // get the middle of the list
        Node middle = getMiddle(h);
        Node nextofmiddle = middle.next;
 
        // set the next of middle node to null
        middle.next = null;
 
        // Apply mergeSort on left lis	this.next=null;t
        Node left = mergeSort(h);
 
        // Apply mergeSort on right list
        Node right = mergeSort(nextofmiddle);
 
        // Merge the left and right lists
        Node sortedlist = sortedMerge(left, right);
        return sortedlist;
    }
 
    // Utility function to get the middle of the linked list
    public Node getMiddle(Node h) 
    {
        //Base case
        if (h == null)
            return h;
        Node fastptr = h.next;
        Node slowptr = h;
         
        // Move fastptr by two and slow ptr by one
        // Finally slowptr will point to middle node
        while (fastptr != null)
        {
            fastptr = fastptr.next;
            if(fastptr!=null)
            {
                slowptr = slowptr.next;
                fastptr=fastptr.next;
            }
        }
        return slowptr;
    }
   
    public int get(int index)
    {
    	Node n=head;
    	int r=0;
    	for(int i=0;i<index;i++)
    	{
    		if(i==index-1)
    		{
    		  r = n.data;
    		}
    		n=n.next;
    	}
    	return r;
    }
    public void readFileContents()
    {
    	boolean looping;
    	DataInputStream in;
    	String line;
    	int j, len;
    	char ch;
    	
    	/* Read input from file and process. */
        try {
            in = new DataInputStream(new FileInputStream(fname));
            
            looping = true;
            while(looping) {
                /* Get a line of input from the file. */
                if (null == (line = in.readLine())) {
                    looping = false;
                    /* Close and free up system resource. */
                    in.close();
                }
                else {
                	//System.out.println("line = "+line);
                	j = 0;
                	len = line.length();
                	String s=" ";
                	for(j=0;j<len;j++){
                		System.out.println(line.charAt(j));
                	}
                }
            } /* End while. */
                	
        } /* End try. */
        
        catch(IOException e) {
            System.out.println("Error " + e);
        } /* End catch. */
    }

    public void getFileName()
    {
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("Enter file name please.");
    	fname = in.nextLine();
    	System.out.println("You entered "+fname);
    }
    }

