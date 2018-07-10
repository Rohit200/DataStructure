package DataStruct;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io. BufferedReader;
import java.io.IOException;
public class NodeUtility
{
 LinkedList l1=new LinkedList();
	String[] stringArray;
    int[] intArray;

	//Reading string from file
	public Node readFile(Node start)
	{
		try
		{
			FileInputStream fis = new FileInputStream("integer.txt");
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
			inputArray=l1.mergeSort(inputArray);

			for(int i =0; i < wordsArray.length-1 ; i++)
			{
				start=l1.add(inputArray[i]);
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		return start;
	}

	//read integer file
	public int[] integerFileReader()
	{
		try
		{
			String intFile = new String();
			FileReader fr = new FileReader("integer.txt");
			BufferedReader br = new BufferedReader(fr);
		    String s;

		    while((s = br.readLine()) != null) 
			{
		        intFile += s;
		    }

		    intFile = intFile.replaceAll("\\n",",");
		    intFile = intFile.trim();
		    stringArray = intFile.split(","); 
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

}
