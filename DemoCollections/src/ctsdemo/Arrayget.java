package ctsdemo;
import java.util.ArrayList;
public class Arrayget {
	public static void main(String args[])
	{
	ArrayList<String> list1=new ArrayList<>(5);
	list1.add("Ganesh");
	list1.add("Ananth");
	list1.add("naveen");
	list1.add("pavan");
	list1.add("mahendra");
	System.out.println(list1);
	System.out.println(list1.get(1));
	}

}
