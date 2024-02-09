package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Dictionary {
	public String words[] = new String[80]; 
	public void makeDictionary() {
		try (BufferedReader reader = new BufferedReader(new FileReader("dictionary.txt"))) {
			String line;
			int i = 0;
			while ((line = reader.readLine()) != null) {
				words[i] = line.toLowerCase();
				++i;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
