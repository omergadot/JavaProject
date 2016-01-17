package RunProperties;

import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import presenter.Properties;

/**
 * in this class we just save the properties in a 
 * xml file
 * 
 * (running an another main function
 * @author Omer
 *
 */
public class RunPropertiesMain {

	public static void main(String[] args) throws FileNotFoundException {
		Properties p =new Properties();
		p.setGenerateAlgorithm("Simple");
		p.setSolveAlgorithm("a star air distance");
		p.setThreadsRunning(3);
		XMLEncoder xml = new XMLEncoder(new FileOutputStream("properties2.xml")); //the name of the 
																				 //xml file is "properties"
		xml.writeObject(p);
		xml.close();
		
	}

}
