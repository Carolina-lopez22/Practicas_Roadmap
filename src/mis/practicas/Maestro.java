package mis.practicas;

public class Maestro extends Usuario {
private String curso;

public Maestro(String nombre, String correo, String curso) {
	super(nombre, correo);
	this.curso = curso;
}

@Override
public void mostrarDatos() {
	System.out.println("----Datos del Maestro----");
	super.mostrarDatos();
	System.out.println("Curso: "+ curso);
}

}
