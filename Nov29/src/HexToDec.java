import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class HexToDec {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new FileReader("hex.txt"));
		String line;
		int i;
		while((line = br.readLine())!=null){
		
			line = line.trim();
			System.out.println(Integer.parseInt(line,16));
		
		}
		
		
		
	}

}
