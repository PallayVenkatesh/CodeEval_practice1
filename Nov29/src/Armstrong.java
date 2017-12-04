import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Armstrong {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("hi");
		BufferedReader br = new BufferedReader(new FileReader("arm.txt"));
		String line;
		int i;
		while((line = br.readLine())!=null){
			System.out.println("hi");
			int len = line.length();
			int num = Integer.parseInt(line);
			int temp=num;
			int sum=0;
			System.out.println(len);
			while(num>0){
				
				int d = num%10;
				num = num/10;
				sum = (int) (sum + Math.pow(d, len));
				
			}
			if(sum==temp){
				System.out.println("Armstrong");
			}
			else{
				System.out.println("not Armstrong");
			}
			
		}
		
	}

}
