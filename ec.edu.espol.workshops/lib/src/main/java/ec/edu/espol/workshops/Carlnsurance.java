package ec.edu.espol.workshops;

public class Carlnsurance {
	private int edad;
	private char[] sexo = {"M", "F"};
	private String[] eCivil = {"Casado", "No Casado"};
	static final int PRIMABASE = 500;

	public Carlnsurance(String edad, char[] sexo, String[] eCivil) {
		this.edad = edad;
		this.sexo = sexo;
		this.eCivil = eCivil;
	}
	
	
}

