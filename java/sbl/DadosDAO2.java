package sbl;

import java.sql.Connection;
import java.sql.DriverManager;

//ATENÇÃO : IMPORT DadosDAO2 na class controller (servlet webservlet)
//
//
public class DadosDAO2 {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url ="jdbc:mysql://127.0.0.1:3306/dbSBL?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "senha";
	
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		}catch (Exception e) {
			System.out.println(e);
			System.out.println("jijij");
			return null;
		}
	}
	
	public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			System.out.println("fdf");
			con.close();
		}catch (Exception e) {
			System.out.println(e);
			System.out.println("fdfw");
		}
	}

}
