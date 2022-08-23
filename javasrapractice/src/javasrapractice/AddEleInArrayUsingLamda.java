package javasrapractice;

import java.util.ArrayList;

interface AddArray
{
	public void sum();
}
public class AddEleInArrayUsingLamda {

	static int d;
	public static void main(String[] args) {
		ArrayList<Integer> all=new ArrayList<>();
		all.add(10);
		all.add(20);
		all.add(30);
		
		for (Integer a : all) {
			
		
		AddArray g=()->{
			//int a;
			 d = d+a;
			System.out.println(d);
		};
		g.sum();

	}
	}

}
