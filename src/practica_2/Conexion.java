package practica_2;


import java.sql.Connection;
import java.sql.DriverManager;





public class Conexion {
	    private static Connection con = null;
	   
	   public static Connection getConexionMYSQL(){
	        try{
	            Class.forName("com.mysql.jdbc.Driver").newInstance();
	            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","");
	            return con;
	        }catch(Exception e){
	        	 e.getMessage();
	            e.printStackTrace();
	           
	            return con;
	        }
	    }
	}
	
