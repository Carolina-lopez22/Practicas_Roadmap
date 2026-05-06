package mis.practicas;

import mis.practicas.Dias.DiasDeLaSemana;

public class Main {

	public static void main(String[] args) {
		
		ejercicioEnum();
		ejercicioInitializerBlock();
		ejercicioPassByValue();
		ejercicioTypeCasting();
		
	}

	private static void ejercicioEnum() {
		DiasDeLaSemana dia = DiasDeLaSemana.LUNES;
	if (dia == DiasDeLaSemana.SABADO || dia == DiasDeLaSemana.DOMINGO ) {
		System.out.println("Hoy " + dia + " es dia de descanso ");
	}
	else {
		System.out.println("Hoy " + dia + " es dia de hacer tareas ");
	}
		
	}
	private static void ejercicioInitializerBlock() {
		Estudiante estudiante1 = new Estudiante("Carla","Vega", 22);
		estudiante1.asignarMaterias("Fisíca", "Quimica", "Ingles", "Matematicas");
		
		Estudiante estudiante2 = new Estudiante("Adrian","Ortiz", 21);
		estudiante2.asignarMaterias("Español", "Historia", "Matematicas", "Quimica");
		
		Estudiante estudiante3 = new Estudiante("Alex","Martinez", 20);
		estudiante3.asignarMaterias("Derecho", "Español", "Historia", "Sociales");
		
		Estudiante estudiante4 = new Estudiante("Veronica","Lemus", 23);
		estudiante4.asignarMaterias("Fisíca", "Programacion", "Ingles", "Estadistica");
		
		estudiante1.mostrar();
		estudiante2.mostrar();
		estudiante3.mostrar();
		estudiante4.mostrar();
	}
	public static void ejercicioPassByValue() {
		
		Producto pro1 = new Producto("Bocina", 2000, 5);
		
		modificar(pro1);
		
		System.out.println("Cantidad: "+ pro1.cantidad);
		System.out.println("Nombre: "+pro1.nombre);
		System.out.println("Precio: "+pro1.precio);
		
	}
		
	public static void modificar(Producto prod ) {
			prod.cantidad += 5;
			
			prod.nombre= "Tablet";
			prod.precio= 1000;
	}
	public static void ejercicioTypeCasting() {
		PromedioConCasting pro1 = new PromedioConCasting(99,98,98);
		System.out.println("El promedio de notas es: "+pro1.calcularPromedio());
	}
		
}
