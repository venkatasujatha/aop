package javasrapractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
public static void main(String[] args) {
	List<String>list= new ArrayList<String>();
	
	list.add("sanjay");
	list.add("kumar");
	list.add("arun");
	list.add("sanjay");
	
	 List<String> newList = list.stream()
             .distinct()
             .collect(Collectors.toList());
	 
	 System.out.println(newList);
	 list.ge
	
}
}
