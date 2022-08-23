package javasrapractice;
import java.lang.StringBuffer;

public class StringBuffer123 {

	public static void main(String[] args) 
	{
		StringBuffer buffer=new StringBuffer("sujatha");
		
		//append string
		buffer.append("hello");
		System.out.println(buffer);
		
		//append string with starting index and ending index
		StringBuffer append = buffer.append(buffer, 1, 5);
		System.out.println(append);
		
		//delete from start index to end index
		buffer.delete(10, 14);
		System.out.println(buffer);
		
		//reverse
		buffer.reverse();
		System.out.println(buffer);
		
		//insert
		buffer.insert(2, "rani");
		System.out.println(buffer);
		
		//insert object at specified index
		StringBuffer insert = buffer.insert(0, buffer);
		System.out.println(insert);
		
		//delete the object
		buffer.delete(0,buffer.length());
		System.out.println(buffer);
		
		System.out.println(buffer.insert(0, "sujatha"));
		
		System.out.println(buffer.insert(0, "Hello "));
		
		//sub string from start index and end index
		String substring = buffer.substring(2, 6);
		System.out.println(substring);
		
		//sub string index
		String substring2 = buffer.substring(2);
		System.out.println(substring2);
		
		//capacity
		System.out.println(buffer.capacity());
		
		buffer.append("welcome to tectoro");
		System.out.println(buffer.capacity());
		
		buffer.ensureCapacity(30);
		System.out.println(buffer.capacity());
		

	}

}
