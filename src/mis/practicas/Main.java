package mis.practicas;

import mis.practicas.Dias.DiasDeLaSemana;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicioEnum();
		ejercicioInitializerBlock();
		
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
		
}
