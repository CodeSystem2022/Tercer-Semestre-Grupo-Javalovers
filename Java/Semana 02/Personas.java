package  domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
static{ //Bloque de inicializacion estatico
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
      //idPersona=10;No es estatico un atributo, por esto tenemos un error
       
    }
    
    {//Bloque de inicializacion no estatico (contexto dinamico)
        system.out.println("Ejecucion del bloque NO estatico");
        this.idpersona - persona.contadorPersonas++;//incrementamos el atributo
    }
    
