package project3;

abstract class Vehiculo {
	 protected int matricula;
	 protected String marca;
	 protected String modelo;
	 protected int year;
	 protected String estado = "Disponible";
	 
	 Vehiculo(int matricula, String marca, String modelo, int year, String estado) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.year = year;
		this.estado = estado;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	 
   abstract void mostrarInformacion ();
   
}
