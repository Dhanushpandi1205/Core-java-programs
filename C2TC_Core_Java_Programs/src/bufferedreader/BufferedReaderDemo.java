package bufferedreader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );    
     
     System.out.println("Enter your name: ");
     String name = reader.readLine();
     
     System.out.println("Enter your age: ");
     int age= Integer.parseInt(reader.readLine());
     
     System.out.println("The name is "+name);
     System.out.println("Age is "+ age);
     
    
	}
	
	
}
