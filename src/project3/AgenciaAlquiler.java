package project3;

import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaAlquiler {
	
	 private ArrayList<Vehiculo> listaVehiculos;
	 Scanner read = new Scanner(System.in);
	 
	 //Constructor
	 public AgenciaAlquiler() {
		this.listaVehiculos = new ArrayList<>();
	}
	// methods
	void agregarVehiculo(Vehiculo vehiculo) {
		listaVehiculos.add(vehiculo);
	}
	void eliminarVehiculo(int matricula) {
		boolean elim = false;
		for(Vehiculo vAux : listaVehiculos) {
			if(vAux.getMatricula() == matricula) {
				listaVehiculos.remove(vAux);
				elim = true;
				System.out.println("Vehiculo eliminado!");
				break;
			}
		}if(!elim) {
			System.out.println("No se encontro el vehiculo con matricula: "+matricula);
		}
	}
	void mostrarInformacionVehiculos() {
		if(listaVehiculos.isEmpty()) {
			System.out.println("No hay vehiculos registrados!");
		}else {
			for(Vehiculo vAux : listaVehiculos) {
				vAux.mostrarInformacion();
				System.out.println("------------------------------------------------------------------------------------------------------------------");
			}
		}
	}
	//method action
	void alquilarVehiculo() {
		int entrada= 0;
		System.out.println("Ingrese: 1.Para Auto | 2.Para Camioneta | 3.Cualquiera: ");
		entrada = read.nextInt();
		read.nextLine();
		
		switch (entrada){
		case 1:
			System.out.print("Ingrese matricula del Vehiculo: ");
			int num_matri = read.nextInt();
			System.out.print("Ingrese numero de puertas del Vehiculo: ");
			int num_puertas = read.nextInt();
			
			for (Vehiculo v1 : listaVehiculos) {
			    if (v1 instanceof Auto && v1.getMatricula() == num_matri) { 
			    	Auto auto = (Auto) v1; // Hacer el cast
			    	auto.alquilar(num_puertas); // Llamar la versión sobrecargada con capacidad mínima
			    }
		}
			break;
			
		case 2:
			
			System.out.println("Ingrese matricula del Vehiculo: ");
			int num_matr = read.nextInt();
			System.out.println("Ingrese carga del Vehiculo: ");
			int num_carga = read.nextInt();
			
			for (Vehiculo v : listaVehiculos) {
			    if (v instanceof Camioneta && v.getMatricula() == num_matr) { 
			        Camioneta camioneta = (Camioneta) v; // Hacer el cast
			        camioneta.alquilar(num_carga); // Llamar la versión sobrecargada con capacidad mínima
			        return;
			    }
			}
			break;
			
		case 3:
			System.out.println("Ingrese matricula del Vehiculo: ");
			int num_mat = read.nextInt();
			
			for(Vehiculo vAux : listaVehiculos) {
				if(vAux.getMatricula() == num_mat && vAux instanceof IAlquiler) {
					((IAlquiler)vAux).alquilar();
					return;
				}else {
					System.out.println("Vehiculo no encontrado!");
				}
				
			}
			break;
			
			default:
				System.out.println("Opcion invalida!");
		}
	
}
	void devolverVehiculo() {
		System.out.println("Ingrese matricula del Vehiculo: ");
		int num_matri = read.nextInt();
		for(Vehiculo vAux : listaVehiculos) {
			if(vAux.getMatricula() == num_matri && vAux instanceof IAlquiler) {
				((IAlquiler)vAux).devolver();
				return;
			}
		}
		System.out.println("Vehiculo no encontrado!");
	}
	//method menu interactive
	void ejecutarMenu() {
		int opc;
		
		do {
			System.out.println("\n--- Menu de Agencia de Alquiler ---");
			System.out.println("1. Alquilar vehiculo");
            System.out.println("2. Devolver vehiculo");
            System.out.println("3. Mostrar informacion de vehiculos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opc = read.nextInt();
            read.nextLine();
            
            switch (opc) {
            case 1:
            	alquilarVehiculo();
            	break;
			case 2:
			    devolverVehiculo();
			    break;
			case 3:
				mostrarInformacionVehiculos();
				break;
			case 4:
				System.out.println("Saliendo del sistema");
				break;
			default:
				System.out.println("Opción invalida");
            }
            
		}while(opc < 4);
	}
	
}
