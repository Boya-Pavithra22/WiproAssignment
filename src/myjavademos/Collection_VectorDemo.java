package myjavademos;
/*
 * | Feature                           | `ArrayList`                            | `LinkedList`                           | `Vector`                     |
| --------------------------------- | -------------------------------------- | -------------------------------------- | ---------------------------- |
| 🏷️ Package                       | `java.util`                            | `java.util`                            | `java.util`                  |
| 📚 Underlying Data Structure      | **Dynamic array**                      | **Doubly linked list**                 | **Dynamic array**            |
| ⏱️ Access Time (get/index)        | **Fast (O(1))**                        | **Slow (O(n))**                        | Fast (O(1))                  |
| 🔁 Insertion/Deletion (middle)    | **Slow (O(n))**                        | **Fast (O(1) for add/remove)**         | Slow (O(n))                  |
| 🚦 Thread-safe                    | ❌ Not synchronized                     | ❌ Not synchronized                     | ✅ Synchronized               |
| 🧵 Performance in multi-threading | ❌ Use `Collections.synchronizedList()` | ❌ Use `Collections.synchronizedList()` | ✅ Built-in synchronized      |
| 🧠 When to Use                    | When frequent access is needed         | When frequent insert/delete is needed  | When thread safety is needed |
| 📅 Introduced in Java version     | Java 1.2                               | Java 1.2                               | Java 1.0 (Legacy class)      |
| 🔄 Iterator type                  | Fail-fast                              | Fail-fast                              | **Fail-safe**                |
| ❌ Allows `null` elements          | ✅ Yes                                  | ✅ Yes                                  | ✅ Yes                        |

 */
/*
 * The preferred way is to use ArrayList.

If you are concerned about thread safe, you can synchronize it like this:

List list = Collections.synchronizedList(new ArrayList(...));
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/*
 * Why Avoid Legacy Classes Today?
Slower performance due to synchronization (thread safety).

Lack modern features like Generics in their original form.

Not recommended for new development — replaced by more efficient classes in the Java Collections Framework.
*/
public class Collection_VectorDemo {

	public static void main(String[] args) {
		//Vector obj=new Vector();//valid
		List obj=new Vector();//allows duplicates
		obj.add("Java");//String
		obj.add(32);//Integer
		obj.add(32);//Integer
		obj.add(34.34f);//Float
		obj.add('A');//obj.add(new Character('A'))
		obj.add(new Integer(335));//OPTIONAL
		obj.add(new String("JSP"));
		System.out.println("Vector(ordered):: "+obj);//toString()


		List<String> listobj = new ArrayList<String>();  //unsynchronized by default
		  listobj.add("A");  
      listobj.add("B");  
      listobj.add("C");  
      listobj.add("D");  
      listobj.add("E");  

      //Create a synchronized list  
      //Collection is a INTERFACE
      //Collections is a built in class
      //synchronizedList is a static method

      List<String> synlist = Collections.synchronizedList(listobj);  
      System.out.println("Synchronized list is :"+synlist);  

	}

}
