package cl.cvv.dominio;

public class Saludo {
	
	private String saludo;
	private String nombre;
	
	public Saludo( String nombre ) {
		
		this.nombre = nombre;	
		this.saludo = "Hola " + this.nombre + "!";
	}
	
	public String getSaludo() {
		return saludo;
	}
	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	

}
