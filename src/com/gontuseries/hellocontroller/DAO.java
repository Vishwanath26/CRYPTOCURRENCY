package com.gontuseries.hellocontroller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO {

	/*@RequestMapping("/DAO/{Symbol}")
	public static void main(@PathVariable ("Symbol")String Symbol) throws ClassNotFoundException, SQLException {
	   	 Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/vishwanath";
		String uName="root";
		String Password="qwerty";
		String Query="SELECT * FROM "+Symbol+" ORDER BY DATE DESC LIMIT 1";
   	 Connection con=DriverManager.getConnection(url, uName, Password);
   	 Statement st=con.createStatement();
   	 ResultSet rs=st.executeQuery(Query);
   	 rs.next();
   	 float price=rs.getFloat("PRICE");
   	 System.out.println(price);
   	 con.close();

	}	*/

    private String Url;
    private String User;
    private String Password;

    public DAO(){
        this.Url =  "jdbc:mysql://localhost:3306/vishwanath";
        this.User = "root";
        this.Password = "qwerty";
    }

    public ResultSet ExecSingleResultSelQuery(String query) throws Exception {
        try {
            if(query!=null&&query!="")
            {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection(Url, User, Password);
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery(query);
                    rs.next();
                    return rs;
            }
            else
                return null;
        }
        catch(Exception exp) {
            throw exp;
        }

    }



}

