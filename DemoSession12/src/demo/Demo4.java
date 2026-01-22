package demo;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class Demo4 {
	public static void main(String[] args) {
		try {
			String fileName = "b.doc.jpg.png.txt";
			String name = UUID.randomUUID().toString().replace("-", "");
			int lastIndex = fileName.lastIndexOf(".");
			String ext = fileName.substring(lastIndex);
			
			String newFileName = name + ext;
			File file = new File("src\\data\\" + newFileName);
			file.createNewFile();
			System.out.println("Successfully created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
