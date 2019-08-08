package jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

public class Fetch {
	public void fetchData() {
		try {
			Connection con=new Database().loading();
			java.sql.Statement stmt = con.createStatement();
			ResultSet rs = ((java.sql.Statement) stmt).executeQuery("select * from actor");
			while (rs.next())
				System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  "
						+ rs.getString(4));
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


