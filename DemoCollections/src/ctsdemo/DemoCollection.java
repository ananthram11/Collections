package ctsdemo;
import java.util.*;
public class DemoCollection {
public static void main(String[] ar) {
	ArrayList<String> list1=new ArrayList<>();
	list1.add("Ganesh");
	list1.add("Naveen");
	list1.add("pavan");
	list1.add("murali");
	list1.add("mahendra");
	ArrayList<String> list2=new ArrayList<>();	
	list2.add("Harish");
	list1.addAll(list2);
	System.out.println(list1);
	list1.remove("Naveen");
	list1.remove("mahendra");
	System.out.println(list1);
}
}
