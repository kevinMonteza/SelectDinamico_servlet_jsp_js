package practica_2;

public class Ciudades {
	private String direccion;
	private String nombre;
	private String tiendas;
	
	
	public Ciudades(String direccion, String nombre, String tiendas) {
		super();
		this.direccion = direccion;
		this.nombre = nombre;
		this.tiendas = tiendas;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTiendas() {
		return tiendas;
	}
	public void setTiendas(String tiendas) {
		this.tiendas = tiendas;
	}
	
}
