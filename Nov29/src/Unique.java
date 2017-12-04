import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;


public class Unique {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("unique.txt"));
		String s;
		
		while((s = br.readLine())!=null){
			String out = "";
			String[] grp = s.split(","); 
			Set<String> s1 = new TreeSet<String>();
			for(String sel : grp){
				if(s1.contains(sel)){
				continue;	
				}
				s1.add(sel);
				out=out + sel+",";
			}
			out = out.substring(0,out.length()-1);
			System.out.println(out);
		}
	}

}
