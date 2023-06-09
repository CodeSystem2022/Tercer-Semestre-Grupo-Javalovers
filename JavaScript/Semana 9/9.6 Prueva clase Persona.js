class Persona{

    static contadorPersonas = 0

    constructor(nombre, apellido, edad){
        super(nombre, apellido, edad);
        this._idPersona = ++ Persona.contadorPersonas;
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
        
    }

    get idPersona(){
        return this._idPersona;
    }
    get nombre(){
        return this._nombre;
    }

    set nombre (nombre){
        this._nombre = nombre;
    }

    get apellido(){
        return this._apellido;
    }

    set apellido (apellido){
        this.apellido = apellido;
    }

    get edad(){
        return this._edad;
    }

    set edad (edad){
        this._edad = edad;
    }
    
    toString(){
        return `
        ${super.idePersona}
        ${this._nombre}
        ${this._edad}`;
    }
}

class Empleado extends Persona{
    static contadorEmpleados = 0;

    constructor(nombre, apellido, edad, suelado){
        super (nombre, apellido, edad);
        this.idEmpleado = ++ Empleado.contadorEmpleados;
        this._sueldo = sueldo ;
    }

    get idEmpleado(){
        return this._idPersona;
    }
    get sueldo(){
        return this._sueldo;
    }

    set sueldo (sueldo){
        this._sueldo = nsueldo;
    }
    toString(){
        return ` ${super.toString()} ${this._idEmpleado} ${this.sueldo}`;
    }
}

class Cliente extends Persona{

    static contadorClientes = 0;

    constructor(nombre, apellido, edad, fecharegistro){
        super(nombre, apellido, edad);
        this._idCliente = ++ Cliente.contadorClientes;
        this._fechaRegistro = fecharegistro;
    }

    get _idCliente(){
        return this._idCliente;
    }
    get fecharegistro(){
        return this._fechaRegistro;
    }

    set fecharegistro (fecharegistro){
        this._fechaRegistro = fecharegistro;
    }
    
    toString(){
        return `
        ${super.toString()}
        ${this._idCliente}
        ${this._fechaRegistro}`;
    }
}
 //Prueba class Persona
let persona1 = new Persona ('Juan', 'Perez', 32 );
console.log(persona1.toString());


let persona2 = new Persona('Carla', 'Ortega', 22);
console.log(persona2.toString());
