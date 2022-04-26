package properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.setProperty("driver-class", "jdbc.mariadb.jdbcapi.DriverSpy");
		prop.setProperty("jdbcUrl", "jdbc:mariadb://localhost:3307/java");
		prop.setProperty("username", "javauser");
		prop.setProperty("password", "mariadb");
		
		try {
			prop.store(new FileOutputStream("database.txt"), "Database Properties Text");
			prop.storeToXML(new FileOutputStream("database.xml"), "Database Properties XML");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
