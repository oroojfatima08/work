import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListDemo {
	
	ArrayList<String> arrList= new ArrayList<String>();
	
	public void display()
	{
		Iterator itr= arrList.iterator();
		while(itr.hasNext())
		{
			System.out.println("Values are : "+itr.next());
		}
	}

	public static void main(String[] args) {
	
		ArrayList<String> arrList= new ArrayList<String>();
		arrList.add("a");
		arrList.add("b");
		arrList.add("c");
		arrList.add("d");
		arrList.add("e");
		
		/*Iterator itr= arrList.iterator();
		while(itr.hasNext())
		{
			System.out.println("Values are : "+itr.next());
		}*/
		
		System.out.println("Orignal Array List : ");
		for(String str:arrList)
		{
			System.out.println(str);
		}
		System.out.println("Present size of list : "+arrList.size());
		
		System.out.println("Modified Array List : ");
		arrList.add(2, "x");
		arrList.add(4, "z");
		arrList.add(3, "o");
		arrList.add(1, "s");
		
		for(String str:arrList)
		{
			System.out.println(str);
		}
		System.out.println("Present size of list : "+arrList.size());
		
		System.out.println("Remove elements from Array List");
		
		arrList.remove(3);
		
		for(String str:arrList)
		{
			System.out.println(str);
		}
		System.out.println("Present size of list : "+arrList.size());
		Collections.reverse(arrList);
		System.out.println("Reverse the List");
		for(String str:arrList)
		{
			System.out.println(str);
		}
		System.out.println("Unsorted List ");
		for(String str:arrList)
		{
			System.out.println(str);
		}
		Collections.sort(arrList);
		System.out.println("Sorted List ");
		for(String str:arrList)
		{
			System.out.println(str);
		}
		Collections.sort(arrList,Collections.reverseOrder());
		
		System.out.println("Reverse Sorted List ");
		for(String str:arrList)
		{
			System.out.println(str);
		}
	ArrayList<String> al = new ArrayList<String>(arrList.subList(2, 6));
	System.out.println("Sublist of ArrayList"+al);
	} 

}
