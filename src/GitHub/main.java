package GitHub;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");

	}
	
	

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



