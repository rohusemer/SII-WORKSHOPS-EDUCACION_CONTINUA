package ec.edu.espol.workshops;

import java.util.Scanner;

/**
 * The Carlnsurance class is a silly example to illustrate documentation.
 */

class Carlnsurance {
  static int edad; // The age of the customer.
  static String sexo; // The sex of customer.
  static String eCivil;
  static final int PRIMA_BASE = 500;
  static final int CASADO_OMUJER = 200;
  static final int DESCUENTO_EDAD = 100;
  static final int RECARGO_HOMBRE_JOVENSOLTERO = 1500;

  /**
   * Cosntructor de la clase.
   */
  public Carlnsurance(int valoredad, String valorsexo, String estado) {
    edad = valoredad;
    sexo = valorsexo;
    eCivil = estado;
  }

  public static void setEdad(int valoredad) {
    edad = valoredad;
  }

  public static int getEdad() {
    return edad;
  }

  public static void setSexo(String valorsexo) {
    sexo = valorsexo;

  }

  public static String getSexo() {
    return sexo;

  }

  public static void setEstado(String estado) {
    eCivil = estado;

  }

  public static String getEstado() {
    return eCivil;

  }

  public static int calcularInsurance(String licencia) {
    int premium = PRIMA_BASE;
    Scanner lector = new Scanner(System.in);

    if ((getEdad() > 80) || (licencia.equals("No Valido"))) {
      System.out.println("No podemos vender seguros a mayores de 80 años o sin licencias validas");
      premium -= 1;
    } else {

      if ((getSexo().equals("M")) && (getEstado().equals("No Casado")) && (getEdad() < 25)) {
        premium += RECARGO_HOMBRE_JOVENSOLTERO;
      }

      if ((getEstado().equals("Casado")) || (getSexo().equals("F"))) {
        premium -= CASADO_OMUJER;
      }

      if ((getEdad() >= 45) && (getEdad() < 65)) {
        premium -= DESCUENTO_EDAD;
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
        ingresoEdad += lector.nextInt();
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

      ingresoSexo += lector.next();

      if ("M".equalsIgnoreCase(ingresoSexo) || "F".equalsIgnoreCase(ingresoSexo)) {

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
      ingresoEstado += lector.next();

      if ("Y".equalsIgnoreCase(ingresoEstado) || "N".equalsIgnoreCase(ingresoEstado)) {

        estadoCorrecto = true;
        lector.nextLine();

        if ("Y".equalsIgnoreCase(ingresoEstado)) {
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
      System.out.print("El cliente entrego licencia valida?(Y o N): ");
      ingresoLicencia += lector.next().toUpperCase();

      if ("Y".equals(ingresoLicencia) || "N".equals(ingresoLicencia)) {
        licenciaCorrecto = true;
        lector.nextLine();

        if ("Y".equals(ingresoLicencia)) {
          ingresoLicencia = "Valido";

        } else {
          ingresoLicencia = "No Valido";
        }

      } else {
        System.out.print("Ingresar solo Y o N: ");
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