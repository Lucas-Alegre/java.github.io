package GitHub;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");

	}
	



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
	}

	public String getPersona() {
		return persona;
	}
	public int getDni() {
		return dni;
	}
	@Override
	public String toString() {
		return "Trabajador ( " + getPersona() + ", " +  getDni()+ " )";
	}



