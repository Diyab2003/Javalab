import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileExceptionHandling {
	public static void main(String[]args) {
		char[] data =new char[50];
		FileReader input=null;
		FileWriter output=null;
		try {
			input=new FileReader("outputfile.txt");
			int bytesRead=input.read(data);
			System.out.println(data);
			input.close();
			
			output=new FileWriter("newoutput.txt");
			output.write(data,0,bytesRead);
			output.flush();
			output.close();
			
		}catch(IOException e) {
			e.printStackTrace();
			}
	}

}
