package DataStruct;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NullPointerException;


public class ListUtility
{
	BufferedReader br;
	public Node1 readFile(Node1 start)
	{
		try{
	           	FileInputStream fis = new FileInputStream("/home/bridgeit/Desktop/Word.txt");
	           	char ch;
	           	String word3="";
	           	while (fis.available() > 0)
	           	{
					ch = (char) fis.read();
	             	word3=word3+ch;
	           	}
	           	String[] wordsArray=word3.split(" ");
				for(int i =0; i < wordsArray.length ; i++)
				{
	           		start=addWordstoList(start,wordsArray[i]);
				}
			}
	     	catch(NullPointerException ne)
	     	{
	     		System.out.println(ne);
	     	}
			catch(IOException e){
			}
			return start;
	 }//End of read method

	//Insert words...........
	public Node1 addWordstoList(Node1 node1,String str)
	{
	   Node1 node2=node1;
	   Node1 newNode=new Node1(str);
	   newNode.data1=str;
	   newNode.nextNode=null;
	   if(node1==null)
	   {
	     return newNode;
	   }
	   else{
	     while(node1.nextNode!=null)
	     {
	       node1=node1.nextNode;
	     }
	     node1.nextNode=newNode;
	   }
	   return node2;
	}//End of insert method

	//Search words
	public Node1 searchData(Node1 node,String word)
	{
	     Node1 temp=node;
	     while(node.nextNode!=null){
	       if(word.compareTo((node.nextNode).data1)==0)
	       {
	         node.nextNode=(node.nextNode).nextNode;
	         System.out.println("Word is Found");
	         System.out.println("the founded word is deleted from the file");
	         System.out.println("file saved");
	         return temp;
	       }
	       node=node.nextNode;
	     }
	     System.out.println("Word is not Found");
	     System.out.println("the not founded word is added to the file");
	     System.out.println("file saved");
	     temp=addWordstoList(temp,word);
	     return temp;
	}//End of Search word

	//writeToFile
	public void writeDataToFile(String nWord)
	{
		try{
			File fi=new File("/home/bridgeit/Desktop/Word.txt");
	      	fi.createNewFile();
	      	FileWriter fw=new FileWriter(fi);
	        fw.write(nWord);
	        fw.close();
		}
		catch(IOException e){
		}

	}
	public ListUtility()
	{
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	public String inputString(){
		try{
			return br.readLine();
		}
		catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		return "";
	}
}
