package project3;

public class  Camioneta extends Vehiculo implements IAlquiler{
	
	public int capacidadCarga;

	Camioneta(int capacidadCarga, int matricula, String marca,
				String modelo, int year, String estado) {
		super(matricula, marca, modelo, year, estado);
		this.capacidadCarga = capacidadCarga;
	}

	public int getCapacidadCarga() {
		return capacidadCarga;
	}
	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	//Overload of interface Rent
		@Override
	public void alquilar() {
		if(estado.equals("Disponible")) {
			estado = "Alquilado";
		}else {
			System.out.println("El vehiculo no esta disponible!");
		}
	}
	//Overload method
	public void alquilar(int carga) {
		if(estado.equals("Disponible") && carga <= capacidadCarga) {
			estado = "Alquilado";
			System.out.println("Solicitud Aprovada!");
		}else if (estado.equals("Disponible") && carga > capacidadCarga){
			System.out.println("El vehiculo no cumple con la carga requerida!");
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
	//Overload Vehicle
	@Override
	public void mostrarInformacion() {
		System.out.println("Capacidad de carga: "+capacidadCarga+"Kg"+ 
				"| Matricula: "+matricula+ "| Marca: "+marca+
				"| Modelo: " +modelo+"| Año: "+year+"| Estado: "+estado);
		}
}
