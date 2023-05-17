package test;

import enumeraciones.Dias;

public class TestEnumeraciones  {
  public static void main(Sting[] args) {
    System.out.println("Dia 1: " + Dias.LUNES);
    indicarDiaSemana(Dias.Lunes);//Las enuneraciones se tratan como cadenas
    //ahora no se deben utilizar comillas, se accede a traves de el operador de punto
  }
  
  private static void indicarDiaSemana(Dias dias){
    switch(dias){
      case LUNES:
        System.out.println("Prmer dia de la semana");
        break;
      case MARTES;
        System.out.println("Segundo dia de la semana");
        break;
      case MIERCOLES;
        System.out.println("Tercer dia de la semana");
        break;
      case JUEVES;
        System.out.println("Cuarto dia de la semana");
        break;
      case VIERNES;
        System.out.println("Quinto dia de la semana");
        break;
      case SABADO;
        System.out.println("Sexto dia de la semana");
        break;
      case DOMINGO;
        System.out.println("Septimo dia de la semana");
        //agregar default

        
        
       
    

        
        
        
        
        
        
       
    
 
