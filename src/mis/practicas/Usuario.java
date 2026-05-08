package mis.practicas;

public class Usuario {
	protected String nombre;
	protected String correo;
	
	public Usuario(String nombre, String correo) {
		this.nombre = nombre;
		setCorreo(correo);
	}
	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		if(correo.contains("@"))
		this.correo = correo;
		else
			System.out.println("El correo debe llevar @");
	}

	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Correo: "+ correo);
	}
	
}

