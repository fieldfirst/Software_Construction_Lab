import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class MyMain {

	public static void main(String[] args){
	
		Scanner in = new Scanner(System.in);
		DatasetReader reader = new DatasetReader();
		
		boolean done = false;
		
		while(!done){
			try {
				System.out.print("Please Enter filename : ");
				String filename = in.next();
				
				double[] data = reader.readFile(filename);
				double sum = 0;
				
				for (double d : data){
					sum += d;
				}
				
				System.out.println("The sum is " + sum);
				done = true;
				
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				System.out.println("File not found");
				
			} catch (BadDataException e) {
				
				System.out.println("Bad data " + e.getMessage());
				
			} catch (IOException e){
				
				System.out.println("File not found");
			}
			
		}
		
	}
	
}
