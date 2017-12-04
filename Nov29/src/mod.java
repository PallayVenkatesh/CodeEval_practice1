import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class mod {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new FileReader("mod.txt"));
		String line;
		int i;
		while((line = br.readLine())!=null){
			
			String a = line.split(",")[0];
			String b = line.split(",")[1];
			
			System.out.println((Integer.parseInt(a)/Integer.parseInt(a))*Integer.parseInt(a));
			
			
		}
	}

}
