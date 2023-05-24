package Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StremApiExp {

	public static void main(String[] args) {
		
		List<Student> list1 = new ArrayList<>();
		list1.add(new Student(1,"Pankaj"));
		list1.add(new Student(2,"Suraj"));
		list1.add(new Student(0,"amit"));
		
		System.out.println(list1);
		//System.out.println(list1.stream());
		//Predicate<Student> predicate = l -> l.getName().equals("Pankaj");
		
		List<Student> filterList = list1.stream().filter(e -> e.getName().equals("Pankaj")).collect(Collectors.toList());
		
		List<Student> sortedList = list1.stream().sorted(Comparator.comparingInt(Student :: getId)).collect(Collectors.toList());
		
		System.out.println(filterList);
		
		System.out.println("Stream API : "+Stream.of(list1).collect(Collectors.toList()));
		
		System.out.println(sortedList);
	}

}
