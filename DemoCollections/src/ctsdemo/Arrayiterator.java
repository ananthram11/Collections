package ctsdemo;
import java.util.*;
public class Arrayiterator {

	public static void main(String[] args)
	    {
	        ArrayList<String> a = new ArrayList<>(Arrays.asList("Ananth","naveen","Ganesh","pavan","mahendra","narsimha","harish"));
	       ListIterator<String> iterator = a.listIterator();
	       while(iterator.hasNext())
	       {
	            System.out.println(iterator.next());
	       }
	         
	        while(iterator.hasPrevious())
	        {
	            System.out.println(iterator.previous());
	        }
	    }
	}
