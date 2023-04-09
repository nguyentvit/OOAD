package Main;

import java.sql.Connection;
import java.sql.SQLException;

import KetNoiCSDL.ConnectionDB;
//import View.Appt;
import View.Calendar;

public class Main {

	public static void main(String[] args) throws SQLException {
		Connection conn = ConnectionDB.getConnect();
		if(conn != null)
		{
			System.out.print("hello");
			Calendar ui = new Calendar();
			ui.ShowWindow();
		}

	}

}
