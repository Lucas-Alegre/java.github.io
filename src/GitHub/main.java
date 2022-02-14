package GitHub;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");

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



