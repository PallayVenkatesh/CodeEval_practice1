import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;


public class Cycle {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("cycle.txt"));
		String line;
		while((line = br.readLine())!=null){
			line = line.trim();
			String[] numbers = line.split(" ");

			Set<String> occurances = new TreeSet<String>();
			String firstMatch = null;
			for (String number : numbers)
			{
				if (occurances.contains(number))
				{
					firstMatch = number;
					break;
				}

				occurances.add(number);
			}

			StringBuilder builder = new StringBuilder();
			Boolean started = false;
			for (String number : numbers)
			{
				if (started && number.equals(firstMatch))
				{
					break;
				}
				
				if (number.equals(firstMatch))
				{
					started = true;
				}

				if (started)
				{
					builder.append(number);
					builder.append(" ");
				}
			}
			
			if (builder.length() > 0)
			{
				builder.deleteCharAt(builder.length() - 1);
			}
			System.out.println(builder);
			
			
			
	}

}
}
