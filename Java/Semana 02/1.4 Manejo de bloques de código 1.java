package domain;


public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    static{ //Bloque de inicializacion estatico
        System.out.println("Ejecucion del bloque estatico");
        ++Persona.contadorPersona;
        
        //idPersona = 10; no es estatico un atributo, por esto tenemos un error
    }
    {//Bloque de inicializacion NO estatico (contexto dinamico)
            System.out.println("Ejecucion del bloque no estatico");
            this.idPersona = Persona.contadorPersona++;// Incrementamos el atributo 
    }
    // Los bloques de inicializacion se ejecutan antes del contructor de nuestra clase 
    
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }
    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
}
