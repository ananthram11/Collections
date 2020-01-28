package ctsdemo;
import java.util.*;
public class Arrayclone {
	
	public static void main(String args[])
	{
	ArrayList<String> list1=new ArrayList<>();
	list1.add("Ganesh");
	list1.add("Ananth");
	list1.add("naveen");
	list1.add("pavan");
	list1.add("mahendra");
	System.out.println(list1);
	ArrayList<String> arrayListClone =  (ArrayList<String>) list1.clone();
	System.out.println(arrayListClone);
	}

	}

