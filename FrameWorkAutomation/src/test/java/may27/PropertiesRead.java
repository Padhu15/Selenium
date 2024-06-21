package may27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead {

	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("config.properties");
	Properties config=new Properties();
	config.load(fis);
System.out.println(config.getProperty("browser"));


	}

}
