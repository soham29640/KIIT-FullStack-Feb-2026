package day16;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
public static void main(String[] args)		//maintain natural sorting order and no duplicates
{

	Set<Student> fyStudents=new TreeSet();
	
	fyStudents.add(new Student(18,"Virat",78.5));
	fyStudents.add(new Student(87,"Rohit",88.5));
	fyStudents.add(new Student(16,"Rishab",65.5));
	fyStudents.add(new Student(63,"Surya",98.5));	
	
	System.out.println(fyStudents);
}
}
