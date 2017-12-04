import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Fib {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new FileReader("fib.txt"));
		String line;
		
		
		while((line = br.readLine())!=null){
			
			int count =2;
			int i=1,j=1;
			int c = 0;
			while(count < Integer.parseInt(line)){
				c= i+j;
				count++;
				i=j;
				j=c;
				
			}
			System.out.println(c);
			
			
			
			
		}
		
		
	}

}
