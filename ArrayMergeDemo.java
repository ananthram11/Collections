package CtsDemo;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayMergeDemo {
	
	    public static void main(String[] args) throws Exception 
	    {
	        ArrayList<String> listOne = new ArrayList<>(); 
	        listOne.add("A"); 
	        listOne.add("B"); 
	        listOne.add("C"); 
	        listOne.add("D"); 
	        listOne.add("E");
	        ArrayList<String> listTwo = new ArrayList<>(); 
	        listTwo.add("X"); 
	        listTwo.add("Y"); 
	        listTwo.add("Z"); 
	        listTwo.add("U"); 
	        listTwo.add("V");
	        listOne.addAll(listTwo);   
	        //Merge both lists
	        System.out.println("Merge both lists" +listOne);
	    }
}
