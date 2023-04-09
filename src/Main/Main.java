package Main;

import java.sql.Connection;
import java.sql.SQLException;

import KetNoiCSDL.ConnectionDB;
import View.Appt;

public class Main {

	public static void main(String[] args) throws SQLException {
		Connection conn = ConnectionDB.getConnect();
		if(conn != null)
		{
			System.out.print("hello");
			Appt ui = new Appt();
			ui.ShowWindow();
		}

	}

}
