#cREACION DE LA CLASE 3EXTENSION DE LA CLASE 1
  package paquete2;

import paquete1.Clase1;

public class Clase3 extends Clase1{
    public Clase3(){
      super("protected");
      this.atributoProtected = "Accedemos desde la clase hija";
        System.out.println("AtributoProtected = " + this.atributoProtected);
        this.atributoPublic = "es totalmente publico";
        
    }
    
}


#MODIFICACION A LA CLASE 1
package paquete1;

public class Clase1 {
    public String atributoPublic = "Valor atributo public";
    protected String atributoProtected = "Valor atributo protected";
    
    public Clase1 (){
        System.out.println("Constructor public");
    }
    
    protected Clase1(String atributoPublic){
        System.out.println("Constructor protected");
    }
    
    public void metodopublico(){
        System.out.println("Metodo public");
    }
    
protected void metodoProtected(){
    System.out.println("Metodo protected");
}
    
}


#MODIFICACIONES DENTRO DE  TESTMODIFICADORESDEACCESO
package test;

import paquete1.Clase1;
import paquete2.Clase3;

public class TestModificadoresdeAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println("clase1 = " + clase1.atributoPublic);
        clase1.metodopublico();
        Clase3 claseHija = new Clase3();
        System.out.println("claseHija = " + claseHija);
    }
    
}
