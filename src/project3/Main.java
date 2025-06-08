package project3;

public class Main {

	public static void main(String[] args) {
		
		AgenciaAlquiler ag = new AgenciaAlquiler();
		//----------------------------------------------------------------------------
		ag.agregarVehiculo( new Auto(3, 123, "Honda", "Civic", 2012, "Disponible"));
		ag.agregarVehiculo( new Auto(4, 213, "Honda", "Accord", 1998, "Disponible"));
		ag.agregarVehiculo( new Auto(5, 321, "Toyota", "Corolla", 2021, "Disponible"));
		ag.agregarVehiculo( new Auto(5, 546, "Lexus", "IS 250", 2016, "Disponible"));
		ag.agregarVehiculo( new Auto(4, 456, "Lexus", "IS 300", 2025, "Disponible"));
		ag.agregarVehiculo( new Auto(4, 643, "Daihatsu", "Mira", 2012, "Disponible"));
		
		ag.agregarVehiculo( new Camioneta(50, 1234, "Nissan", "NP300", 2021, "Disponible"));
		ag.agregarVehiculo( new Camioneta(55, 4321, "Mazda", "BT 50", 2022, "Disponible"));
		ag.agregarVehiculo( new Camioneta(65, 1243, "Ford", "Ranger", 2022, "Disponible"));
		ag.agregarVehiculo( new Camioneta(85, 4312, "Chevrolet", "Silverado", 2025, "Disponible"));
		ag.agregarVehiculo( new Camioneta(95, 2314, "Isuzu", "Prado", 2024, "Disponible"));
		ag.agregarVehiculo( new Camioneta(105, 3432, "Toyota", "Hilux", 2026, "Disponible"));

		ag.ejecutarMenu();
	
	}
}

   