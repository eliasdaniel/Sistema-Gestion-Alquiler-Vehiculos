package project3;

public class Auto extends Vehiculo implements IAlquiler{
	
	private int numeroDePuertas;

	 Auto(int numeroDePuertas, int matricula, 
				String marca, String modelo, 
				int year, String estado) {
		super(matricula, marca, modelo, year, estado);
		this.numeroDePuertas = numeroDePuertas;
	}


	public int getNumeroDePuertas() {
		return numeroDePuertas;
	}

	public void setNumeroDePuertas(int numeroDePuertas) {
		this.numeroDePuertas = numeroDePuertas;
	}
	//Metodos de la interfaz Alquiler
	@Override
	public void alquilar() {
		if(estado.equals("Disponible")) {
			estado = "Alquilado";
		}else {
			System.out.println("El vehiculo no esta disponible!");
		}
	}
	public void alquilar(int puertas) {
		
		if(estado.equals("Disponible") && puertas <= numeroDePuertas) {
			estado = "Alquilado";
			System.out.println("Solicitud Aprobada!");
		}else if (estado.equals("Disponible") && puertas > numeroDePuertas){
			System.out.println("El vehiculo no cumple con puertas requeridas!");
		}else {
			System.out.println("El vehiculo no esta disponible!");
		}
	}
	@Override
	public void devolver() {
		if(estado.equals("Alquilado")) {
			estado = "Disponible";
		}
		
	}
	//Metodos de Vehiculo
	@Override
	void mostrarInformacion() {
		System.out.println("Numero de Puertas: "+numeroDePuertas+ 
				"| Matricula: "+matricula+ "| Marca: "+marca+
				"| Modelo: " +modelo+"| Año: "+year+"| Estado: "+estado);
	}
	
	
	
}
