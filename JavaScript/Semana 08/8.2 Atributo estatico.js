modificaciones en este cogido (ATRIBUTO ESTATICO)
class Persona{ //Clase padre
    static contadorObjetosPersona = 0;
    
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        Persona.contadorObjetosPersona++;
        console.log("Se incrementa el contador: "+Persona.contadorObjetosPersona);
        
    }
