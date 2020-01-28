package CtsDemo;
import java.awt.List;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList <String> ListName1 = new ArrayList<>();
 			 ListName1.add("staya");
 			ListName1.add("Kalyan");
 			ListName1.add("bala");
 			ArrayList <String> ListName2 = new ArrayList<>();
 			ListName2.add("haritha");
 			ListName1.addAll(ListName2);
 			System.out.println(ListName2);
 			System.out.println(ListName1);
	}

}
