import java.util.*; // included the whole of util because i needed Collections to sort

public class arraylist{
	public static void main(String[] args){
		ArrayList<String> arrlist=new ArrayList<String>();
		arrlist.add("mango"); //adding stuff
		arrlist.add("apple");
		arrlist.add("banana");
		arrlist.add("grapes");

		//printing
		System.out.println(arrlist);
	
		//using get to access index-wise
		System.out.println(arrlist.get(1));//returns apple because indexing starts from 0

		//using set to change elements(use add to add new elements, otherwise IndexOutOfBounds exception error )
		arrlist.set(2,"dates"); //changes banana to dates
		System.out.println(arrlist);

		//sorting the list
		Collections.sort(arrlist);
		System.out.println(arrlist);


		//using an iterator to loop through it because heck, why not
		Iterator itr=arrlist.iterator();// gets the iterator

		while(itr.hasNext())//checking if iterator ha elements
		{
			System.out.println(itr.next());
		}
	}
}