package demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Demo5 {
	public static void main(String[] args) {
		try {
			List<String> lines = Files.readAllLines(Paths.get("src/data/a.txt"));
			System.out.println("Line: " + lines.size());
			
			for (String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

