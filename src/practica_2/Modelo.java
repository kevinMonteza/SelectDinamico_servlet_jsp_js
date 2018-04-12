package practica_2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Modelo {
	Connection conn = null;

	public Modelo(Connection conn) {
		this.conn = conn;
	}

	public List<Country> getPaises() {
		Statement miStatement = null;
		Country country = null;
		List<Country> lista = new ArrayList<>();
		ResultSet rs = null;
		String sql = "SELECT * FROM `country` ";

		try {
			conn = Conexion.getConexionMYSQL();
			miStatement = conn.createStatement();
			rs = miStatement.executeQuery(sql);
			while (rs.next()) {
				country = new Country(rs.getString("country"), rs.getInt("country_id"));
				lista.add(country);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	public List<Ciudades> getCiudades(String cod) {
		Statement miStatement = null;
		Ciudades ciudad = null;
		List<Ciudades> lista = new ArrayList<>();
		ResultSet rs = null;
		String sql = "SELECT     a.address,     c.city,     co.country FROM     address a INNER JOIN city c "
				+ "ON     (c.city_id = a.city_id) INNER JOIN country co "
				+ "ON 	(co.country_id = c.country_id) WHERE     co.country_id = "+cod;

		try {
			conn = Conexion.getConexionMYSQL();
			miStatement = conn.createStatement();
			rs = miStatement.executeQuery(sql);
			while (rs.next()) {
				ciudad = new Ciudades(rs.getString(1),rs.getString(2),rs.getString(3));
				lista.add(ciudad);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	
	}
	}

