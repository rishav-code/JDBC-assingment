package jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.util.Scanner;

public class Delete {
	public void deleteData() {
		try {
			Scanner scanner = new Scanner(System.in);
			Connection con = new Database().loading();
			java.sql.Statement stmt = con.createStatement();
			stmt.execute("DELETE FROM actor WHERE actor_id <= 19");
			System.out.println("Data Deleted");
			con.close();
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
}

}
