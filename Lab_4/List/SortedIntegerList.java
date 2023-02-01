package Lab_4.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class SortedIntegerList{

	public LinkedList <Integer> sortList;
	boolean flag;	

	public SortedIntegerList (boolean flag){

		this.flag = flag;
		sortList = new LinkedList <Integer> ();

	}

	public void add (int element){

		ListIterator <Integer> iterator = sortList.listIterator();
		
		if(!iterator.hasNext()){
			sortList.add(element);
			return;
		}
		
		int elem = 0;

		while(iterator.hasNext()){
			elem = iterator.next();
			if(element <= elem){
				if(flag == false){
					if(element == elem){break;}
				}	
				
				iterator.previous();
				iterator.add(element);
				break;
			}
		}
		
		if(element > elem){sortList.addLast(element);}
	}
		
	public void remove (int element){

		ListIterator <Integer> iterator = sortList.listIterator();

		while(iterator.hasNext()){
			int el = iterator.next();
			if(element == el){
				iterator.previous();
				iterator.remove();
				break;
			}
		}
	}

	public boolean equals (SortedIntegerList l){

		ListIterator <Integer> it1 = this.sortList.listIterator();
		ListIterator <Integer> it2 = l.sortList.listIterator();

		if(this.sortList.size() != l.sortList.size()){return false;}

		while(it1.hasNext()){
			if(it1.next() != it2.next()){return false;}
		}
		
		return true;
	}

	public String toString(){

		StringBuilder sb = new StringBuilder();
		ListIterator<Integer> iterator = sortList.listIterator();

		while(iterator.hasNext()){
			sb.append(iterator.next() + " ");
		}

		String text = sb.toString();

		return text;
	}
	
}
