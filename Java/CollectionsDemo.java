package src;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsDemo {

	enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5));  
//		Iterator itr = al.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			al.add(6);
//		}
		

//		CopyOnWriteArrayList<Integer> cwa = new CopyOnWriteArrayList<Integer>(Arrays.asList(1,2,3,4,5));
//		Iterator itr = cwa.iterator();
//		while(itr.hasNext()) {
//			int i = (int) itr.next();
//			System.out.println(i);
//			cwa.add(i*2);
//		}
//		System.out.println(cwa);

		// HashMap allows one null key and any number of null values.
//		 Map<String, Integer> hashMap = new HashMap<>();
//		 hashMap.put(null,null);

		// Hashtable does not allow null keys or values
//		 Map<String, Integer> hashtable = new Hashtable<>();
//		 hashtable.put(null,null); //exception

		// enumset
//		EnumSet<Day> daySet = EnumSet.allOf(Day.class);
//		for (Day day : daySet) {
//			System.out.println(day);
//		}

		// enummap
//		EnumMap<Day, String> dayMap = new EnumMap<>(Day.class);
//		dayMap.put(Day.MONDAY, "Gym");
//		dayMap.put(Day.TUESDAY, "Swimming");
//		dayMap.put(Day.WEDNESDAY, "Running");
//		for (Day day : Day.values()) {
//			System.out.println(dayMap.getOrDefault(day, "No Activity"));
//		}

		// comparable
		List<Student> students = Arrays.asList(new Student(21, "Raj"), new Student(22, "Ram"), new Student(20, "Karn"));
		students.forEach(System.out::println);
		Collections.sort(students);
		students.forEach(System.out::println);
		
		List<Student1> students1 = Arrays.asList(new Student1(21, "Raj"), new Student1(22, "Ram"), new Student1(20, "Karn"));
		students1.forEach(System.out::println);
		Collections.sort(students1, new NameComparator());
		students1.forEach(System.out::println);
	}

}

class Student implements Comparable<Student> {
	private int age;
	private String name;

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return Integer.compare(this.age, s.age);
	}

	@Override
	public String toString() {
		return String.format("name : %s , age : %d ", name, age);
	}
}

class Student1  {
	private int age;
	private String name;

	public Student1(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return String.format("name : %s , age : %d ", name, age);
	}
}

class NameComparator implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}
