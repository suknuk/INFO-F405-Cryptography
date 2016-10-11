package language;

import java.util.ArrayList;

public class Tree {
	private ArrayList<Tree> nodes;
	private char letter;
	private boolean wordAtNode;

	public Tree(char letter) {
		this.nodes = new ArrayList<Tree>();
		this.wordAtNode = false;
		this.letter = letter;
	}
	
	public void setNodeIsWord(boolean isWord){
		this.wordAtNode = isWord;
	}
	
	public ArrayList<Tree> getNodes(){
		return this.nodes;
	}
	
	public char getLetter(){
		return this.letter;
	}
	
	public boolean wordAtNode(){
		return this.wordAtNode;
	}

}
