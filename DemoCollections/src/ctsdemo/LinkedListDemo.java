package ctsdemo;

import java.util.*;

public class LinkedListDemo {
		public static void main(String[] ar) {
	LinkedList<String> list1=new LinkedList<>();
	list1.add("Ganesh");
	list1.add("Naveen");
	list1.add("pavan");
	list1.add("murali");
	list1.add("mahendra");
	list1.add("mahendra");
	LinkedList<String> list2=new LinkedList<>();	
	list2.add("Harish");
	list1.addAll(list2);
	System.out.println(list1);
	list1.remove("Naveen");
	list1.remove("mahendra");
	System.out.println(list1);
 }
}
