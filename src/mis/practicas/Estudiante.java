package mis.practicas;

public class Estudiante {
String nombre;
String apellido;
int edad;
String materia1;
String materia2;
String materia3;
String materia4;
{
	materia1="sin asignar";
	materia2="sin asignar";
	materia3="sin asignar";
	materia4="sin asignar";
}
public Estudiante(String nombre, String apellido, int edad) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
}	
public void asignarMaterias(String mat1, String mat2, String mat3, String mat4) {
	materia1= mat1;
	materia2= mat2;
	materia3= mat3;
	materia4= mat4;	
}
public void mostrar() {
	System.out.println("Nombre Completo: "+ nombre +" "+ apellido + " Edad: " +edad);
	System.out.println("Materia 1: "+ materia1);
	System.out.println("Materia 2: "+ materia2);
	System.out.println("Materia 3: "+ materia3);
	System.out.println("Materia 4: "+ materia4);
}	
}

