//Archivo: Gerente.java
package domain;

public class Gerente extends Empleado{
    private String-departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    } 
}








//Archivo: testSobreescritura.java
package test;

public class testSobreescritura {
    Gerente gerente1 = new Gerente("Jose", 5000, "Sistemas");
    System.out.println("gerente1 = "+ gerente1.obtenerDetalles());  
}
