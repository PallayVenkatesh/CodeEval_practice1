import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class RightMost {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("right.txt"));
		String s;
		
		while((s = br.readLine())!=null){
		
			String letter = s.split(",")[1];
			String word = s.split(",")[0];
			
			System.out.println(word.indexOf(letter));
			
			
			
			
		}
		
		
	}

}
