import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class sumOfDIgits {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("sum.txt"));
		String line;
		while((line = br.readLine())!=null){
			
			
			int sum=0;
			int num = Integer.parseInt(line);
			
			while(num>0){
				int i = num%10;
				num = num/10;
				sum = sum + i;	
			}
			System.out.println(sum);
		
		
		}
		
		
	}

}
