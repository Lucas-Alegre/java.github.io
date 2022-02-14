package GitHub;


class Empresa{
	
	private Region region;
	private Trabajador[] trabajador;
	
	public Trabajador (Region region, Trabajador[] trabajador) {
		this.region = region;
		this.trabajador = trabajador;	
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



