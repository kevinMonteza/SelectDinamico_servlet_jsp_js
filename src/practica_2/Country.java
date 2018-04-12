package practica_2;

public class Country {
	private String nombre;
	private int cod;
	public Country(String nombre, int cod) {
		super();
		this.nombre = nombre;
		this.cod = cod;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	
}
