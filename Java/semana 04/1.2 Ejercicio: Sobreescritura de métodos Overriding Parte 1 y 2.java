//Archivo: Gerente.java
package domain;

public class Gerente extends Empleado{
    private String-departamento;
    
   








//Archivo: testSobreescritura.java
package test;

public class testSobreescritura {
   
    public static void main(String[] args) {    
        Gerente gerente1 = new Gerente("Jose", 5000,"Sistemas");
        System.out.println("gerente1 = " + gerente1.obtenerDetalles());
