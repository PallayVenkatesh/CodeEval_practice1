import java.io.BufferedReader;
import java.io.FileReader;


public class Bits {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		BufferedReader buffer = new BufferedReader(new FileReader("bits.txt"));	
		String line;
			while ((line = buffer.readLine()) != null)
			{
				line = line.trim();
				String[] numbers = line.split(",");

				Integer number = Integer.parseInt(numbers[0]);
				Integer bit1 = Integer.parseInt(numbers[1]);
				Integer bit2 = Integer.parseInt(numbers[2]);

				String bits = Integer.toBinaryString(number);
				
				System.out.println(bits.charAt(bits.length() - bit1) == bits.charAt(bits.length() - bit2));
			}	}
}
