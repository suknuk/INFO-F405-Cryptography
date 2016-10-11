package language;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LanguageTree {
	
	private Tree root;
	
	
	
	public LanguageTree(String file) {
		try {
			Scanner in = new Scanner(new FileReader(file));

			while (in.hasNext()) {
				System.out.println(in.next());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void insertWord(String word, Tree node){
		
	}
}
