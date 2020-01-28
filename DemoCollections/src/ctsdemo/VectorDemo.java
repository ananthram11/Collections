package ctsdemo;
import java.util.*;
public class VectorDemo {
	public static void main(String[] ar) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(new Integer(11));
		v.add(new Integer(22));
		v.add(new Integer(33));
		v.add(44);
		v.add(55);
		v.add(1,99);
		System.out.println("List: "+v);
		v.remove(new Integer(22));
		v.remove(1);
		System.out.println("list using for loop:");
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i)+" ");
		}
			ListIterator lit=v.listIterator();
			System.out.print("\nforward Direction:");
			while(lit.hasNext()) {
				System.out.print(lit.next()+" ");
			}
			System.out.print("\nbackward Direction:");
			while(lit.hasPrevious()) {
				System.out.print(lit.previous()+" ");
			}
		}
	}

