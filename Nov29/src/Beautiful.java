import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Beautiful {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		System.out.println("hi");
		BufferedReader br = new BufferedReader(new FileReader("beauty.txt"));
		String line;
		int i;
		while((line = br.readLine())!=null){
		
			System.out.println(line);
			
		}
	}

}
