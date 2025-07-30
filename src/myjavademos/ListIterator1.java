package myjavademos;

import java.util.ArrayList;
import java.util.ListIterator;

/*
| Feature                   | `Iterator`                        | `ListIterator`                                                                     |
| ------------------------- | --------------------------------- | ---------------------------------------------------------------------------------- |
| 💼 Interface in           | `java.util` package               | `java.util` package                                                                |
| 🧭 Traversal Direction    | Only **forward**                  | Both **forward and backward**                                                      |
| 🔁 Methods Available      | `hasNext()`, `next()`, `remove()` | `hasNext()`, `next()`, `remove()`, `hasPrevious()`, `previous()`, `add()`, `set()` |
| ↩ Can move backward       | ❌ No                              | ✅ Yes (`previous()`)                                                               |
| ➕ Can add elements        | ❌ No                              | ✅ Yes (`add(E e)`)                                                                 |
| ✏️ Can replace elements   | ❌ No                              | ✅ Yes (`set(E e)`)                                                                 |
| 🔍 Applicable collections | Works with all **collections**    | Only works with **List implementations** (e.g., `ArrayList`, `LinkedList`)         |
| 🚀 Position-based access  | ❌ No                              | ✅ Yes (`nextIndex()`, `previousIndex()`)                                           |
*/
public class ListIterator1 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();  
		names.add("Devi"); //0 
		names.add("Abi");  //1
		names.add("Thananya");//2  
		names.add("Daya");  //3
		names.add("Raja");  //4
		System.out.println("Names: "+names);   

		System.out.println("ListIterator Starting with 2:::");
		ListIterator<String> iterator = names.listIterator(2); //starting position  to iterate!
		while (iterator.hasNext()) //forward direction 
		{  
		String i = iterator.next();  
		System.out.println(i);  
		}  

		System.out.println("Backward Iterator:::");
		while(iterator.hasPrevious()) //backward/reverse direction
		{
		    System.out.print(iterator.previous() + ",");
		}

		  for (String it : names) 
		    {
	            iterator.next();
	            // if we reached to required element break the
	            // loop
	            if (it == "Daya")
	            {
	                break;
	            }
	        }
	        iterator.remove();//CRUD(CREATE,READ,UPDATE,DELETE) OPERATION
	        System.out.println("\n\nList After remove():- "+ names);



	}

}
/*
Names: [Devi, Abi, Thananya, Daya, Raja]
ListIterator Starting with 2:::
Thananya
Daya
Raja
Backward Iterator:::
Raja,Daya,Thananya,Abi,Devi,

List After remove():- [Devi, Abi, Thananya, Raja]
*/