package lambda;

import java.util.ArrayList;

class Student{

	private String name;
	private int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge(){ return age; }
	public String getName(){ return name; }

	public String toString(){
		return ( name + ", " + age);
	}
}

interface Filter {
	boolean check(Student s);
}

class AgeCriteria implements Filter {

	public boolean check(Student s){
		return s.getAge() <= 10;
	}
}



public class LambdaSAMEX {

	public static void main(String[] args) {
		
		lambdaDemo1();
		lambdaDemo2();
		lambdaDemo3();
		
	}
	
	public static void lambdaDemo1() {
		ArrayList<Student> alRoster = new ArrayList<Student>();
		alRoster.add(new Student("Bill", 10));
		alRoster.add(new Student("Mary", 8));
		alRoster.add(new Student("Joe", 12));
		alRoster.add(new Student("John", 15));	
		
		for(Student elm : alRoster) System.out.println(elm);
		
		System.out.println();
		
		// 使用 Lambda
		filterStudent(alRoster, p->{return p.getAge() <= 10;});
	}
	
	public static void filterStudent(ArrayList<Student> roster, Filter criteria){
		
		for (Student p:roster) {
			if(criteria.check(p)){
				System.out.println(p);
			}
		}
	}
		
	public static void lambdaDemo2() {
		
		// 匿名類別
		Runnable runnbale = new Runnable() {
		    public void run() {
		    	System.out.println("run me!");
		    }
		};
		
		runnbale.run();
		
		// 使用 Lambda
		
		// 沒有名稱
		Runnable runnbale2 = () ->  System.out.println("run me!");
		
		runnbale2.run();
		
	}
	
	// About List Map
	public static void lambdaDemo3() {
		
		ArrayList<String> alStr = new ArrayList<String>();
		alStr.add("rock1");
		alStr.add("rock2");
		alStr.add("rock3");
		
		for(String elm : alStr) System.out.println(elm);
		
		// 改為 Lambda
		alStr.forEach(elm->System.out.println(elm));
		
	}

}
