package ec.edu.espol.workshops;

public class Carlnsurance {
	private int edad;
	private char[] sexo = {"M", "F"};
	private String[] eCivil = {"Casado", "No Casado"};
	static final int PRIMABASE = 500;

	public Carlnsurance(int edad, char[] sexo, String[] eCivil) {
		this.edad = edad;
		this.sexo = sexo;
		this.eCivil = eCivil;
	}
	
	public void setEdad(int edad) {
		
		this.edad = edad;
		
	}
	
	public String getEdad() {
		return this.edad
	}
	
	public void setSexo(char sexo) {
		
		this.sexo = sexo;
		
	}
	
	public String getSexo() {
		return this.sexo
	}
	
	public void setEstado(int estado) {
		
		this.estado = estado;
		
	}
	
	public String getEstado() {
		return this.estado 
	}
}

