package nhclCo.it;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

public class ItDepartment {

	 final static String
     DEBUG_LOG_PATH = "C:\\Users\\ngs93\\eclipse-workspace\\FileHandling\\debuglog.txt";

	private FileOutputStream fileOutputStream;
	
	public ItDepartment() {
	 try {
	     File debugLogFile = new File(DEBUG_LOG_PATH);
	     if (!debugLogFile.exists()) {
	         Files.createFile(Paths.get(DEBUG_LOG_PATH));
	     }
	     this.fileOutputStream = new FileOutputStream(debugLogFile, true);
	 } catch (IOException e) {
	     e.printStackTrace();
	     System.out.println("Unable to create debug log file");
	 }
	}
	
	public void logIssue(String issue) {
	 try {
	     byte[] message = String.format("[%s] ERROR %s\n", new Date(), issue).getBytes();
	     fileOutputStream.write(message);
	 } catch (IOException e) {
	     e.printStackTrace();
	     System.out.println("Unable to write to debug log. Message: " + e.getMessage());
	 }
	}
	
	public Object readObject(File file) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        return ois.readObject();
    }
}
