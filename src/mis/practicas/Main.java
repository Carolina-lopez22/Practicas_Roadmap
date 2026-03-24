package mis.practicas;

import mis.practicas.Practica_Enum.DiasDeLaSemana;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio1();
		
	}

	private static void ejercicio1() {
		DiasDeLaSemana dia = DiasDeLaSemana.LUNES;
	if (dia == DiasDeLaSemana.SABADO || dia == DiasDeLaSemana.DOMINGO ) {
		System.out.println("Hoy " + dia + " es dia de descanso ");
	}
	else {
		System.out.println("Hoy " + dia + " es dia de hacer tareas ");
	}
		
	}

}
