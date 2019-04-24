package auxiliary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MailSingleton {
	private static WebDriver mail;
	private static Statement statement;
	private static boolean connect = false;

	private MailSingleton() {
	}

	public static WebDriver getInstanse() {

		if (mail == null) {
			mail = new ChromeDriver();
		}

		return mail;
	}

	public static WebDriver delInstanse() {

		if (!(mail == null)) {
			mail = null;
		}

		return mail;
	}

	public static String getDatabase(String query) {
		String returnValue = null;
		String url = "jdbc:mysql://localhost:3306/sys?serverTimezone=Europe/Moscow&useSSL=false";
		String user = "root";
		String password = "191196";

		if (!connect) {
			try {
				Connection con = DriverManager.getConnection(url, user, password);
				Statement st = con.createStatement();
				statement = st;
				connect = true;
				st.executeQuery("USE my_project;");
			}

			catch (SQLException ex) {
			Fields.getLog().fatal("No connection");
				ex.printStackTrace();
				
			}
		}

		try {
			ResultSet result = statement.executeQuery(query);

			if (result.next()) {
				returnValue = result.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			Fields.getLog().warn("Missing values");
		}

		return returnValue;

	}

	public static void closeDatabase() {
		if (connect == true) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
				Fields.getLog().warn("The database was not closed");
			}
			connect = false;
		}
	}

}
