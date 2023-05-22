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
    

    
    
    
    
    //Del archivo: Clase4
package paquete2;

public class Clase4 {
    private String atributoPrivate= "atributo Privado"
     
    private Clase4(){
        System.out.println("Constructor private");
    }
    //Creamos un constructor public para poder crear objectos
    public Clase4(String argumento){ //Aqui se puede llamr al constructor vacio
        this();
        System.out.println("Constructor publico");
    }
    //Metodo private
    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
 
}
