import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Multiple {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("mul.txt"));
		String s;
		while((s = br.readLine())!=null){
			
			String x = s.split(",")[0];
			String n = s.split(",")[1];
			int num = 0;
			int i=1;
			while(num < Integer.parseInt(x)){
				
				num= Integer.parseInt(n) * i;
				 i=i+1;
			}
			System.out.println(num);
			
		
		
		}
		
	}

}
