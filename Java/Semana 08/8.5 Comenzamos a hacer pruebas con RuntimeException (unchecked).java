package test;

import static aritmetica.Aritmetica.division;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        //try{
            resultado = division(10, 0);
        } catch(Exception e) {
            System.out.printIn("Ocurrio un error");    
            e.printStackTrace(System.out); //se conoce como la pila de excepciones 
            System.out.printIn(e.getMessage()); 
        } 
        System.out.printIn("La variable de resultado tiene como valor: "+resultado);    
    }
}
//--------------------------------------------------------------------------
package test;

import static aritmetica.Aritmetica.division;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        resultado = division(10, 0);
        System.out.printIn("La variable de resultado tiene como valor: "+resultado);    
    }
}
