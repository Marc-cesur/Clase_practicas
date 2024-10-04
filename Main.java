import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
    /*  Calculo de tiempo de segundos a minutos y segundos */

    // Hacer que el usuario meta datos, en este caso los segundos
    System.out.print("Enter time in seconds: ");
    Scanner t = new Scanner(System.in);
    int tiempoTotal = t.nextInt();

    // Calculo de minutos a segundos

    int calculoMinutos = tiempoTotal / 60;
    int resto = tiempoTotal % 60;
    System.out.print( tiempoTotal + " segundos son: " + calculoMinutos + " minutos y " + resto + " segundos");
    t.close();
  }
}