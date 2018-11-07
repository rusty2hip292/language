import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import tok.Tokenizer;

public class EntryPoint {

	public static void main(String[] args) {
		if(args.length == 0) {
			return;
		}
		
		try {
			new Tokenizer(readFile(args[0]));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<String> readFile(String filename) throws IOException {
		File f = Paths.get(filename).toFile();
		if(!f.exists()) {
			throw new IOException("The specified file (" + Paths.get(filename).toAbsolutePath().toString() + ") does not exist");
		}
		Scanner s = new Scanner(f);
		ArrayList<String> lines = new ArrayList<String>(1000);
		while(s.hasNextLine()) {
			lines.add(s.nextLine());
		}
		s.close();
		return lines;
	}
}
