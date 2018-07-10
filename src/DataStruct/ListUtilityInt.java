package DataStruct;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NullPointerException;


public class ListUtilityInt
{
	BufferedReader br;
	String[] stringArray;
    int[] intArray;
    public ListUtilityInt(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	public Node1 readFile(Node1 start)
	{
		try
		{
			FileInputStream fis = new FileInputStream("/home/bridgeit/Desktop/Integer.txt");
			char ch;
			String word3="";

			while (fis.available() > 0)
			{
				ch = (char) fis.read();
				word3=word3+ch;
			}
			String[] wordsArray=word3.split(" ");
			int[] inputArray=new int[wordsArray.length-1];

			for(int i=0;i<wordsArray.length-1;i++)
			{
				inputArray[i]=Integer.parseInt(wordsArray[i]); 
			}
			inputArray=sort(inputArray);

			for(int i =0; i < wordsArray.length-1 ; i++)
			{
				start=addWordstoList(start,inputArray[i]);
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		return start;
	}

	public int[] integerFileReader()
	{
		try
		{
			String intFile = new String();
			FileReader fr = new FileReader("/home/bridgeit/Desktop/Integer.txt");
			BufferedReader br = new BufferedReader(fr);
		    String s;

		    while((s = br.readLine()) != null) 
			{
		        intFile += s;
		    }
		    

		    intFile = intFile.replaceAll("\\n",",");
		    intFile = intFile.trim();
		    System.out.println(intFile);
		    stringArray = intFile.split(",");  
		    System.out.println(stringArray[0]);

		    intArray = new int[stringArray.length];

		    for(int i=0; i <intArray.length;i++)
		    {
		        try
		        {
		            intArray[i]= Integer.parseInt(stringArray[i]);
		        }
		        catch(NumberFormatException e)
		        {
		            System.out.println(e);
		        }
		    }
		}
		catch(Exception obj)
		{
		    System.out.println("e");
		}
        	return intArray;
    }
	public Node1 addWordstoList(Node1 node1,int num)
	{
    	Node1 node2=node1;
    	Node1 newNode=new Node1(num);
    	newNode.data=num;
    	newNode.nextNode=null;

	    if(node1==null)
	    {
	      	return newNode;
	    }
	    else
		{
	      	while(node1.nextNode!=null)
	      	{
				node1=node1.nextNode;
	      	}
	      		node1.nextNode=newNode;
	    }
    	return node2;
	}
	
  	public int[] sort(int[] arr )
	{
    	int size=arr.length;
    	for(int i=size;i>0;i--)
		{
      		for(int j=1;j<size;j++)
			{
        		if(arr[j-1]>arr[j])
				{
          			int temp=arr[j-1];
          			arr[j-1]=arr[j];
          			arr[j]=temp;
        		}
      		}
      		size--;
    	}
    	return arr;
  	}
  	public Node1 search(Node1 tNode1, int num)
	{
    	Node1 tNode=tNode1;

    
    	if(tNode==null)
		{
      		Node1 newNode=new Node1(num);
			newNode.data=num;
			tNode=newNode;
			return tNode; 
    	}

    	
    	if(tNode.data==num)
		{
      		tNode=null;
      		return tNode1; //
    	}

    	
    	while(tNode!=null)
		{
      		if(tNode.nextNode==null)
			{
        		return tNode1;
      		}
      
      		if(tNode.nextNode.data==num)
			{
        		tNode.nextNode=tNode.nextNode.nextNode;
        		return tNode1;
      		}
     	 	tNode=tNode.nextNode;
    	}
    	return tNode1;
  	}

	  	public void writeFile(Node1 tNode)
	{
    	try
		{
			String tString="";
		    File file=new File("/home/bridgeit/Desktop/Integer.txt");
		    file.createNewFile();
		    FileWriter fw=new FileWriter(file);

		    while(tNode!=null)
			{
		      	tString+=String.valueOf(tNode.data);
		      	tString+=" ";
		      	tNode=tNode.nextNode;
		    }
		    //System.out.println("string "+tString );
		    fw.write(tString);
		    fw.close();
		}
		catch(IOException e)
		{
		System.out.println(e);
		}
	}
	  	public int inputInteger(){
			try{
				try{	
					return Integer.parseInt(br.readLine());
				}
				catch(NumberFormatException nfe){
					System.out.println(nfe.getMessage());	
				}
			}catch(IOException ioe){
				System.out.println(ioe.getMessage());
			}
			return 0;
		}
}

