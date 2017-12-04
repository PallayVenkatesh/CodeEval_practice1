
public class Mult {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i = 1; i < 13; ++i)
		{
			StringBuilder line = new StringBuilder();
			
			for (int j = 1; j < 13; ++j)
			{
				line.append(String.format("%4d", i*j));
			}
			
			System.out.println(line);
		}
		
	}

}
