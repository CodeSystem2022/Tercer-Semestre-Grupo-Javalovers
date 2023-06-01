package test;

import static aritmetica.Aritmetica.division;

public class TestExcepciones{
    public static void main(String [] args) {
        int resultado = 0;
        try{
            resultado = division( 10, 0);
          
        } catch (OperacionExcepciones e) {
             System.out.println("Ocurrio un error de tipo OperacionExcepciones");
             System.out.println(e.getMessage());
        } catch (Excepcion e) {
             System.out.println("Ocurrio un Error");
             e.printStackTrace(System.out) ; //se conoce como la pila de excepciones
             System.out.println(e.getMessage()); 
        }
         finally{
             System.out.println("Se reviso la division entra cero");
        }
         System.out.println("La variable de resultado tiene como valor: "+resultado) ;
                                
                                
                                 
        }
    }
    
}
