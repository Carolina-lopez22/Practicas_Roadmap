package mis.practicas;

public class PromedioConCasting {
	private int nota1;
	private int nota2;
	private int nota3;
	
	
	public PromedioConCasting(int nota1, int nota2, int nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}


	public double calcularPromedio() {
		double numero1 = (double) nota1;
		double numero2 = (double) nota2;
		double numero3 = (double) nota3;
		return (numero1 + numero2 + numero3)/3;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
