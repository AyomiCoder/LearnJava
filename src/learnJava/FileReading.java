package learnJava;

import java.io.*;

public class FileReading {

	public static void main(String[] args) {
		try {
			
			BufferedReader bw = new BufferedReader(
								new FileReader("C:\\Users\\Ayomide Aluko\\Desktop\\dsa\\java.txt"));
			
//			new FileWriter("C:\\Users\\Ayomide Aluko\\Desktop\\dsa\\java.txt")
//			bw.write("Ayomide\n");
//			bw.write("Aluko\n");
//			bw.write("Olaoluwa\n");
//			bw.write("Feranmi\n");
//			bw.write("Stephen\n");
			String s;
			
			while((s = bw.readLine())!= null) {
				System.out.println(s);
			}
			bw.close();
		}catch(Exception ex) {
			return;
		}

	}

}
