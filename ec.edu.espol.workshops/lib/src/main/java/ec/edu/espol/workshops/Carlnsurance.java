package ec.edu.espol.workshops;

import java.util.Scanner;

public class Carlnsurance {

	public static int edad;
	public static String sexo;
	public static String eCivil;
	static final int PRIMABASE = 500;
	static final int CasadoOMujer = 200;
	static final int DescuentoEdad = 100;
	static final int RecargoHombreJovenSoltero = 1500;
	public static int premium = PRIMABASE;
		
	public Carlnsurance(int valoredad, String valorsexo, String estado) { 	
		edad = valoredad; // unsafe
		sexo = valorsexo; // unsafe
		eCivil = estado; // unsafe
	}
	
	
	public static  void setEdad(int valoredad) {
		edad = valoredad;
	}
	
	public static  int getEdad() {
		return edad;
	}
	
	public static  void setSexo(String valorsexo) {
		sexo = valorsexo;
	}
	
	public static  String getSexo() {
		return sexo;
	}
	
	public static  void setEstado(String estado) {
		eCivil = estado;
	}
	
	public static  String getEstado() {
		return eCivil;
	}
	
	
	public static int calcularInsurance(String licencia) {
		//int premium = PRIMABASE;
		Scanner lector = new Scanner(System.in);
		
		
		if ((getEdad()>80) || (licencia.equals("No Valido"))) {
			System.out.println("No podemos vender seguros a mayores de 80 años o sin licencias validas");
			premium -= 1;
		}else {
			if ((getSexo().equals("M"))&&(getEstado().equals("No Casado"))&&(getEdad()<25)) {
				premium += RecargoHombreJovenSoltero;
			}
			if((getEstado().equals("Casado"))||(getSexo().equals("F"))) {
				premium -= CasadoOMujer;
			}
			if((getEdad()>= 45) && (getEdad()<65)) {
				premium -= DescuentoEdad;
			}
		}
		lector.close();
		return premium;
	}

}
