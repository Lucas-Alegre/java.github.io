package GitHub;


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



