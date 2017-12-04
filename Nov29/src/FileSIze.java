import java.io.File;


public class FileSIze {

	public static void main(String[] args)
	{
		String file = args[0];
		File CP_file = new File(file);
		System.out.println(CP_file.length());
	}
	
}
