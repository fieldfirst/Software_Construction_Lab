import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class DatasetReader {

	private double[] data;
	
	public double[] readFile(String filename) throws IOException, BadDataException {
		
		FileReader reader = new FileReader(filename);
		
		try {
			Scanner sc = new Scanner(reader);
			readData(sc);
		} finally {
			reader.close();
		}
		return data;
		
	}
	
	private void readData(Scanner sc) throws BadDataException {
		
		if (!sc.hasNextInt()) throw new BadDataException("Length Expected");
		int numberofValue = sc.nextInt();
		data = new double[numberofValue];
		
		for (int i=0; i < numberofValue; i++){
			readvalue(sc, i);
		}
		
		if(sc.hasNext()) throw new BadDataException("End of File Expected");
		
	}
	
	private void readvalue(Scanner sc, int i) throws BadDataException {
		
		if (!sc.hasNextDouble()) throw new BadDataException("Data Value Expected");
		
		data[i] = sc.nextDouble();
	}
	
}
