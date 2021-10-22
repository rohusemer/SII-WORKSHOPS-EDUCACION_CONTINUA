package ec.edu.espol.workshops;

import java.util.Scanner;

class Carlnsurance {
	public int edad;
	public String sexo;
	public String eCivil;
	static final int PRIMABASE = 500;
	static final int CasadoOMujer = 200;
	static final int DescuentoEdad = 100;
	static final int RecargoHombreJovenSoltero = 1500;

	public Carlnsurance(int valoredad, String valorsexo, String estado) {
		edad = valoredad;
		sexo = valorsexo;
		eCivil = estado;
	}
	
	public  void setEdad(int valoredad) {
		edad = valoredad;
	}
	
	public  int getEdad() {
		return edad;
	}
	
	public  void setSexo(String valorsexo) {
		sexo = valorsexo;
	}
	
	public  String getSexo() {
		return sexo;
	}
	
	public  void setEstado(String estado) {
		eCivil = estado;
	}
	
	public  String getEstado() {
		return eCivil;
	}
	
	public int calcularInsurance(String licencia) {
		int premium = PRIMABASE;
		Scanner lector = new Scanner(System.in);
		
		
		if ((getEdad()>80) || (licencia.equals("No Valido"))) {
			System.out.println("No podemos vender seguros a mayores de 80 años o sin licencias validas");
			premium = -1;
		}else {
			if ((getSexo().equals("M"))&&(getEstado().equals("No Casado"))&&(getEdad()<25)) {
				premium += RecargoHombreJovenSoltero;
			}
			if((getEstado().equals("Casado"))||(getSexo().equals("F"))) {
				premium -= CasadoOMujer;
			}
			if((getEdad()>= 45)&&(getEdad()<65)) {
				premium -= DescuentoEdad;
			}
		}
		lector.close();
		return premium;
	}

	public static void main(String[] args) {
		System.out.println("Sistema de Insurance");
		System.out.println("///////////////////////////////");
		Scanner lector = new Scanner(System.in);
		
		boolean edadCorrecta = false;
		int ingresoEdad = 0;
		while (!edadCorrecta) {
			System.out.println("Ingresar edad del cliente:");
			if (lector.hasNextInt()) {
			    ingresoEdad = lector.nextInt();
			    edadCorrecta = true;
			    lector.nextLine();
			} else {
				lector.next();
				System.out.println("Ingresar solo numeros enteros");
			}
		}
		
		boolean sexoCorrecto = false;
		String ingresoSexo = "";
		while (!sexoCorrecto) {
			System.out.println("Ingresar sexo del cliente(M o F):");
			ingresoSexo = lector.next().toUpperCase();
			if (ingresoSexo.equals("M") || ingresoSexo.equals("F")) {
				sexoCorrecto = true;
				lector.nextLine();
			} else {
				System.out.println("Ingresar solo M o F");
				lector.nextLine();
				
			}
		}
		
		boolean estadoCorrecto = false;
		String ingresoEstado = "";
		while (!estadoCorrecto) {
			System.out.println("El cliente es casado?(Y o N):");
			ingresoEstado = lector.next().toUpperCase();
			if (ingresoEstado.equals("Y") || ingresoEstado.equals("N")) {
				estadoCorrecto = true;
				lector.nextLine();
				if (ingresoEstado.equals("Y")) {
					ingresoEstado = "Casado";
				} else {
					ingresoEstado = "No Casado";
				}
			} else {
				System.out.println("Ingresar solo Y o N");
				lector.nextLine();
			}
		}
		boolean licenciaCorrecto = false;
		String ingresoLicencia = "";
		while (!licenciaCorrecto) {
			System.out.println("El cliente entrego licencia valida?(Y o N):");
			ingresoLicencia = lector.next().toUpperCase();
			if (ingresoLicencia.equals("Y") || ingresoLicencia.equals("N")) {
				licenciaCorrecto = true;
				lector.nextLine();
				if (ingresoLicencia.equals("Y")) {
					ingresoLicencia = "Valido";
				} else {
					ingresoLicencia = "No Valido";
				}
			} else {
				System.out.println("Ingresar solo Y o N");
				lector.nextLine();
			}
		}
		lector.close();
		
		setEdad(ingresoEdad);
		setSexo(ingresoSexo);
		setEstado(ingresoEstado);
		System.out.println(calcularInsurance(ingresoLicencia));
		
	}	
}