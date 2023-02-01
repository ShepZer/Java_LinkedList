package Lab_4;
import Lab_4.List.SortedIntegerList;
import java.util.Scanner;
//ДОП: 

public class Main { 
	public static void main (String[] args){

		SortedIntegerList m1 = new SortedIntegerList(true);
		SortedIntegerList m2 = new SortedIntegerList(true);

		m1.add(1);
		m1.add(2);
		m1.add(4);
		m1.add(4);
		
		m2.add(1);		
		m2.add(2);
		m2.add(3);
		m2.add(4);

		System.out.println(m1);
		System.out.println(m2);

		System.out.println(m2.equals(m1));

		m2.remove(3);

		System.out.println(m1);
		System.out.println(m2);

		System.out.println(m2.equals(m1));
	}
}