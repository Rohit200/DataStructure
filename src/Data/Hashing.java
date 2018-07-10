package Data;
import DataStruct.*;
public class Hashing {

  	OrderedList[] order=new OrderedList[11];
  	NodeUtility nu=new NodeUtility();

  	public  Hashing()
  	{
		int[] retArray = nu.integerFileReader();

		for(int i=0; i<retArray.length; i++)
		{
			System.out.println(retArray[i]);
			int rem = retArray[i]%11;
			if(order[rem]== null)
			{
				order[rem] = new OrderedList();
				order[rem].addItem(retArray[i]);
			}
			else
			{
				order[rem].addItem(retArray[i]);
            }
		}
		for(int i=0;i<11;i++)
		{
			System.out.println(i);
			if(order[i] !=null)
			{
				order[i].display();
			}
		}
	}

    public static void main(String[] args)
    {
      	Hashing hs=new Hashing();
    }


}
