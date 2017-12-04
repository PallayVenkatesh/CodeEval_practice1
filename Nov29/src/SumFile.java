import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SumFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("sumFile.txt"));
		String s;
		int sum =0;
		while((s = br.readLine())!=null){
		
		sum = sum + Integer.parseInt(s);
		}
		System.out.println(sum);
		
	}

}
