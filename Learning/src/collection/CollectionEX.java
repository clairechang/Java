package collection;

import java.util.*;

class Person {
	protected String name;

	// contructor1
	Person(String name) { 
		this.name = name; 
	}
	// contructor2
	Person() { }

	public String toString(){ // Arrays 類別
		return name;
	}
}

class Student extends Person {
	
	// Contructor
	Student(String name) { 
		this.name = name; 
	}
	
}

public class CollectionEX {

	public static void main(String args[]) {

		// Declare Person 類別之 ArrayList 物件的 Collection 參考
		Collection<Person> colPer = new ArrayList<Person>();		
		
		Person Julian = new Person("Julian");

		System.out.println("將容器 colPer 加入元素 ....");

		colPer.add(new Person("Tom"));
		colPer.add(new Person("Bill"));
		colPer.add(Julian);
		colPer.add(new Person("Jeff"));

		// 將容器轉換為 Object .toArray()
		// 再透過 Arrays.toString 印出來
		System.out.println(Arrays.toString(colPer.toArray()));

		System.out.println("從 colPer 容器中移出 Julian 物件....");

		// 使用 remove 移除 Juloan 物件
		colPer.remove(Julian);

		// 將容器 colPer 轉型為 Person 類別的陣列
		// 呼叫時，必須傳入 Person 類別的陣列作為參數
		Person [] aryPer = colPer.toArray(new Person[1]);

		System.out.println(Arrays.toString(aryPer));

		// Declare Person 類別之 ArrayList 物件的 Collection 參考
		Collection<Person> colStu = new ArrayList<Person>();

		colStu.add(new Student("Mary"));
		colStu.add(new Student("Lisa"));		
		colStu.add(Julian);

		System.out.println("colStu 容器...");
		System.out.println(Arrays.toString(colStu.toArray()));

		System.out.println("將 colStu 容器的所有元素加到 colPer 容器中...");
		colPer.addAll(colStu);

		System.out.println(Arrays.toString(colPer.toArray()));

		System.out.println("將 colStu 容器的所有元素移除...");
		colPer.removeAll(colStu);

		System.out.println(Arrays.toString(colPer.toArray()));

		colPer.addAll(colStu);

		System.out.print("判斷 colPer 容器中是否包含 colStu 所有元素：");
		if(colPer.containsAll(colStu)) System.out.println("是的");

		System.out.println(Arrays.toString(colPer.toArray()));
		System.out.print("判斷 colPer 容器是否包含 Julian 物件：");
		
		if(colPer.contains(Julian)) System.out.println("是的");

		System.out.println("刪除 colPer 容器內不包含在 colStu 容器內的所有元素...");
		colPer.retainAll(colStu);
		System.out.println(Arrays.toString(colPer.toArray()));

		System.out.print("判斷 colPer 和 colStu 兩個容器內元素是否相同：");
		if(colPer.equals(colStu)) System.out.println("包含相同元素");		

		System.out.print("colPer 容器有幾個元素：");
		System.out.println(colPer.size() + "個");

		System.out.print("先清除元素，再判斷容器內是否含有元素：");
		colPer.clear();	
		if(colPer.isEmpty()) System.out.println("目前沒有");
	}
}