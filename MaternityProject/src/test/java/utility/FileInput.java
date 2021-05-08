package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileInput {

	
	
	public Properties readFile() throws IOException {
		
		FileInputStream fis = new FileInputStream("/Users/saifulalam/eclipse-workspace/MaternityProject/src/main/resources/configure.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		return prop;
	}

	
	
}
