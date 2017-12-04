import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class reverseWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("rev.txt"));
		String s;
		while((s = br.readLine())!=null){
			
			StringBuffer sb = new StringBuffer(s);
			
			String rev = sb.reverse().toString();
			String[] s2 = rev.split(" ");
			String print ="";
			for(String out : s2){
				for(int i=out.length()-1;i>=0;i--){
					print = print + out.charAt(i);
				}
				print = print + " ";
			}
			
			System.out.println(print);
		}
		
		
	}

}
