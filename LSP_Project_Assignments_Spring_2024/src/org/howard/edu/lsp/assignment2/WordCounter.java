package org.howard.edu.lsp.assignment2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class WordCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "src/org/howard/edu/lsp/assignment2/words.txt" ;
		Map<String, Integer> wordCount = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split("\\s+");
				for (String word : words) {
					word = word.toLowerCase();
					String[] letters = word.split("[^a-z]");
					for (String subWord : letters) {
						if (subWord.length() > 3) {
							wordCount.put(subWord,  wordCount.getOrDefault(word,  0) + 1);
					}
					
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
