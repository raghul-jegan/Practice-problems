import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
	      File myFile = new File("test.txt");
	      Scanner reader=new Scanner(myFile);
	      while (reader.hasNextLine()) {
	    	  String line=reader.nextLine();
	    	  String[] a=line.split("\\s");
	    	  for (int i=0;i<a.length;i++) {
	    	    System.out.println(Integer.parseInt(a[i]));
	    	  }
	    	  //System.out.println(line);
	      }
	      reader.close();
	     
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
		
	}

}
