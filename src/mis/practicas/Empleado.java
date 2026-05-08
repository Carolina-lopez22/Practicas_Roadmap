package mis.practicas;

public class Empleado {
	private double salario;
	
	    public void setSalario(String textoSalario) {

	        try {

	            salario = Double.parseDouble(textoSalario);

	            if (salario < 0) {

	                throw new IllegalArgumentException("El salario no puede ser negativo");
	            }
	        } catch (NumberFormatException a) {
	            System.out.println("Debe ingresar un número válido");

	        } catch (IllegalArgumentException e) {

	            System.out.println(e.getMessage());
	        }
	    }
	    public double getSalario() {
	        return salario;
	    }
	    public void aumentarSalario(double porcentaje) {

	        try {

	            if (porcentaje < 0) {

	                throw new IllegalArgumentException("El porcentaje no puede ser negativo");
	            }

	            salario += salario * (porcentaje / 100);

	            System.out.println("Nuevo salario: " + salario);

	        } catch (IllegalArgumentException i) {
	            System.out.println(i.getMessage());
	        }
	    }
}
	

	       

