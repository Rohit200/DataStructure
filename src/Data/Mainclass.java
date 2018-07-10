package Data;
import  DataStruct.*;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Mainclass
{
public static void main(String[] args)throws FileNotFoundException
{
   LinkedList l1=new LinkedList();
   //l1.add1();
   l1.display();
   boolean rs=l1.removeSpecific(5);
   l1.display();
	
}
}
