import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo {
	public static void main(String[]args) {
		String data ="This is the input of the file";
		FileWriter output=null;
		try {
			output= new FileWriter("outputfile.txt");
			output.write(data);
			output.flush();
			output.close();
	}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

