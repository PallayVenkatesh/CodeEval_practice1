import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class lowerCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("low.txt"));
		String line;
		while((line = br.readLine())!=null){
			
			
			System.out.println(line.toLowerCase());
			
			
		}
		
	}

}
