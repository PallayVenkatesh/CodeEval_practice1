import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;


public class Intersection {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("inter.txt"));
		String s;
		
		while((s = br.readLine())!=null){
			String set1 = s.split(";")[0];
			String set2 = s.split(";")[1];
			String out ="";
			String[] grp1 = set1.split(",");
			String[] grp2 = set2.split(",");
			Set<String> s1 = new TreeSet<String>();
			for(String o : grp1){
				s1.add(o);
			}
			for(String o2 : grp2){
				if(s1.contains(o2)){
					out = out + o2 +",";
				}
			}
			if(out.length()>0){
				out = out.substring(0,out.length()-1);	
			}
			
			System.out.println(out);
			
			
		}
	}

}
