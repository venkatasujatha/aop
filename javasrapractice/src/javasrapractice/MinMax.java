package javasrapractice;

import java.util.ArrayList;
import java.util.List;

public class MinMax {
public static void main(String[] args) {
	List<Integer>list = new ArrayList();
	list.add(10);
	list.add(4000);
	list.add(100);
	int min =list.get(0);
	int max=list.get(list.size()-1);
	
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i)<min)
		{
			min=list.get(i);
		}
		if(list.get(i)>max)
		{
			max= list.get(i);
			
	}
	
}
	
	}
}
