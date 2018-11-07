package tok;

import java.util.ArrayList;
import java.util.HashMap;

public class Tokenizer {

	private HashMap<String, Command> valid_tokens = new HashMap<String, Command>();
	private ArrayList<String> file_in;
	private ArrayList<String> tokens = new ArrayList<String>(10000);
	
	public Tokenizer(ArrayList<String> in) {
		if(in == null) {
			throw new IllegalArgumentException("Tokenizer cannot be created with null list");
		}
		
		file_in = in;
		build_valid_tokens();
	}
	
	private void build_valid_tokens() {
		for(String line : file_in) {
			for(String word : line.split(" ")) {
				
			}
		}
	}
	
}
