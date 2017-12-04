import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("fizz.txt"));
		String s;
		while((s=br.readLine())!=null){
			s=s.trim();
			
			String s2[] = s.split(" ");
			
			int one = Integer.parseInt(s.split(" ")[0]);
			int two = Integer.parseInt(s.split(" ")[1]);
			int max = Integer.parseInt(s.split(" ")[2]);
			
			
			StringBuilder out =  new StringBuilder();
			for(int i=1;i<=max;i++){
				if(i%one==0){
					out.append("F");
				}
				if(i%two==0){
					out.append("B");
				}
				else if(i%two!=0&&i%one!=0){
					out.append(i);
				}
				out.append(" ");
				
				
				
			}
			
			out.deleteCharAt(out.length()-1);
			System.out.println(out);
			
		}
		
	}

}
