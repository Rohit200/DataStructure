package Data;
import DataStruct.*;

public class UnorderedList
{
	static Node1 start;
	ListUtility lu=new ListUtility();

	public UnorderedList()
	{
		try
		{
			start=lu.readFile(start);
			System.out.print("Enter the word to search :");
			String word1=lu.inputString();
			//Search the word
			start=lu.searchData(start,word1);
			String word2=" ";

			while(start!=null)
			{
				word2=word2+start.data1;
				word2=word2+" ";
				start=start.nextNode;
			}
			//  u1.writeToFile(start);
			lu.writeDataToFile(word2);
		}
		catch(NullPointerException n)
		{
			System.out.println(n);
		}
	}  		//End of method

public static void main(String[] args)
{
	UnorderedList ul=new UnorderedList();

	}
}
