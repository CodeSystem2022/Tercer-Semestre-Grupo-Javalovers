import java.util.Scanner;
public class CalculadotraUTN {
  public static void main(Sting[] args){
    Scanner entrada = new Scanner(System.in);
    System.out.println("****** Aplicacion Calculadora ******");
    //Mostrtamos el menu
  System.out.println("""
         1. Suma
         2. Resta
         3. Multiplicacion
         4. Division
         5. Salir
         """);

    System.out.println("Operacion a realizar?");
    var operacion = Integer.parseInt(entrada.nextLine());

    if(operacion >= 1 && operacion <= 4){
      System.out.println("Digite el valor para el operador1: ");
      var operando1 = Integer.parseInt(entrada.nextLine());
      System.out.println("Digite el valor para el operador2: ");
      var operando2 = Integer.parseInt(entrada.nextLine());
      var resultado = operando1 + operando2;
      System.out.println("resultado =  " + resultado);

    }
  }
    
      
      
    
         
