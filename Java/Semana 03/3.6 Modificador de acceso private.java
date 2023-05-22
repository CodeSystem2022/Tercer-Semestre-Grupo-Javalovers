//Del Archivo:TestDefaulf
package paquete1;

public class TestDefaulf {
    public static void main (String [] args){
      ClaseHija2 claseH2 = new ClaseHija2();
      claseH2.atributoDefault = "Cambio desde la prueba";
      System.out.println("claseH2 atributo default = " + claseH2.atributoDefault);
      
      Clase4 clase4 = new Clase4("Publico");
      System.out.println(clase4.getAtributoPrivate());
      clase4.setAtributoPrivate("Cambio");
      System.out.println("Clase4= " + clase4.getatributoPrivate());
    }
    
}
