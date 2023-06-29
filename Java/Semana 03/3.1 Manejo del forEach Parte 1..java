package test;

import domain.Persona;

public class TestForEach {
    public static void main (String [] args){
        int edades[] = {5, 6, 8, 9}; //Sintaxis resumida
        for (int edad: edades){  //Sintaxis del FOReACH
            System.out.println( "edad = " + edad);
        }
    }
}
