package mis.practicas;

public class Alumno extends Usuario {
	private String carrera;
	private double promedio;
	
	
	public Alumno(String nombre, String correo, String carrera, double promedio) {
		super(nombre, correo);
		this.carrera = carrera;
		this.promedio = promedio;
	}
	public double calcularPromedio(double nota1, double nota2, double nota3) {
		return promedio=(nota1+nota2+nota3)/3;

	}
	@Override
	public void mostrarDatos() {
		System.out.println("----Datos del Alumno----");
		super.mostrarDatos();
		System.out.println("Carrera: "+ carrera);
		System.out.println("Promedio: "+promedio);
	}
	
}
