package questionNine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourcePart {
	static String readFirstLineFromFileWithFinallyBlock(String path) throws IOException {
	
	FileReader fr = new FileReader(path);
	BufferedReader br = new BufferedReader(fr);
	    try {
	        return br.readLine();
	    } finally {
	        br.close();
	        fr.close();
	    }
}
}
