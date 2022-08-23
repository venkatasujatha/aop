package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String path="/home/tectoro/sujatha/Suji.txt";
		FileInputStream fis=new FileInputStream(path);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object readObject = ois.readObject();
		System.out.println(readObject);
	}

}
