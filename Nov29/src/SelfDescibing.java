import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class SelfDescibing {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("self.txt"));
		String line;
		int i;
		while((line = br.readLine())!=null){
		int count=0;
			for(i=0;i<line.length();i++){
				String find = line.substring(i, i+1);
				if(find!=know(count,line)){
					break;
				}
				
			}
			System.out.println(i==line.length()?"1":"0");
			
		}
		
		
		
	}
	
	static String know(int a,String line){
		
		int count=0;
		for(int i=0;i<line.length();i++){
			String find = line.substring(i, i+1);
			if(find == Integer.toString(a)){
				count++;
			}
	
		
		
		
		
	}
		return Integer.toString(count);
	}
	

}
