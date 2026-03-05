package day16;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args)		//maintain natural sorting order and no duplicates
{

	Set<String> names=new TreeSet();
	names.add("Alice");
	names.add("Tom");
	names.add("Frank");
	names.add("David");
	//names.add(null);
	
	System.out.println(names);

	
	
}
}
