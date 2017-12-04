import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


public class HappyNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new FileReader("happy.txt"));
		String line;
		
		while((line = br.readLine())!=null){
		
		
			line = line.trim();
			Set<String> numbers = new HashSet<String>();
			Boolean happy = true;
			
			while (!line.equals("1"))
			{
				line = happy(line);
				
				if (numbers.contains(line))
				{
					happy = false;
					break;
				}
				
				numbers.add(line);
			}
			
			System.out.println(happy ? 1 : 0);
			
		
		}
		
		
		
		
	}
	
	private static String happy(String line)
	{
		Integer sum = 0;
		
		for (int i = 0; i < line.length(); ++i)
		{
			Integer num = Integer.parseInt(line.substring(i, i + 1));
			
			sum += num * num;
		}
		return sum.toString();
	}

}
