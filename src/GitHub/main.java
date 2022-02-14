package GitHub;



class Empresa{
	




class Persona{
	
	private String nombre;
	private String apellido;
	
	public Persona(String nombre,String apellido) {
		this.apellido = apellido;
		this.nombre = nombre;	
	}

	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	@Override
	public String toString() {
		return "Persona ( " + getApellido() + ", " +  getNombre()+ " )";
	}

}	

}

class Trabajador{
	
	private Persona persona;
	private int dni;
	
	public Trabajador (Persona persona, int dni) {
		this.persona = persona;
		this.dni = dni;	

	private Region region;
	private Trabajador[] trabajador;
	
	public Trabajador (Region region, Trabajador[] trabajador) {
		this.region = region;
		this.trabajador = trabajador;	
		//Facu
	}

	public String getRegion() {
		return region;
	}
	public int getTrabajador() {
		return trabajador;
	}
	@Override
	public String toString() {
		return "Empresa ( " + getRegion() + ", " +  getTrabajador()+ " )";
	}
}
	
	
	

class Region{
	
	private String pais;
	private int codigoPostal;
	
	public Region (String pais, int codigoPostal) {
		this.pais = pais;
		this.codigoPostal = codigoPostal;	
	}

	public String getPais() {
		return pais;
	}
	public int getcodigoPostal() {
		return codigoPostal;
	}
	@Override
	public String toString() {
		return "Empresa ( " + getPais() + ", " +  getcodigoPostal()+ " )";
	}
}






