package day16;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo4 {
public static void main(String[] args)		//maintain natural sorting order and no duplicates
{

	Set<Student> fyStudentsAttendance=new TreeSet();
	
	fyStudentsAttendance.add(new Student(18,"Virat",78.5));
	fyStudentsAttendance.add(new Student(87,"Rohit",88.5));
	fyStudentsAttendance.add(new Student(16,"Rishab",65.5));
	fyStudentsAttendance.add(new Student(63,"Surya",98.5));	
	System.out.println("Attendance");
	System.out.println(fyStudentsAttendance);
	
	
	Set<Student> fyStudentsMarkList=new TreeSet();
	
	fyStudentsMarkList.add(new Student(18,"Virat",78.5));
	fyStudentsMarkList.add(new Student(87,"Rohit",88.5));
	fyStudentsMarkList.add(new Student(16,"Rishab",65.5));
	fyStudentsMarkList.add(new Student(63,"Surya",98.5));	
	System.out.println("Marklist");
	System.out.println(fyStudentsMarkList);
	
	Set<Student> fyStudentsExamSeating=new TreeSet();
	
	fyStudentsExamSeating.add(new Student(18,"Virat",78.5));
	fyStudentsExamSeating.add(new Student(87,"Rohit",88.5));
	fyStudentsExamSeating.add(new Student(16,"Rishab",65.5));
	fyStudentsExamSeating.add(new Student(63,"Surya",98.5));	
	System.out.println("Exam Seating");
	System.out.println(fyStudentsExamSeating);
}
}
