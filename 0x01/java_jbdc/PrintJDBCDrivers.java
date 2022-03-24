
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class PrintJDBCDrivers {

	public static void main(String[] args) {
		Enumeration<Driver> e = DriverManager.getDrivers();
		while(e.hasMoreElements()) {
					
		System.out.println(e.nextElement().getClass().getName() + " " + e.nextElement().getMajorVersion());
		}
	}

}
