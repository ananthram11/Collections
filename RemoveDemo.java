package CtsDemo;

import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.text.html.HTMLDocument.Iterator;

public class RemoveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList <String> ListName1 = new ArrayList<>();
			 ListName1.add("satya");
			ListName1.add("Kalyan");
			ListName1.add("bala");
			System.out.println(ListName1);
			ListName1.remove("satya");
			ListName1.set(0,"Mahi");
			System.out.println(" one name is removed "+ListName1); 
	    }
	}
