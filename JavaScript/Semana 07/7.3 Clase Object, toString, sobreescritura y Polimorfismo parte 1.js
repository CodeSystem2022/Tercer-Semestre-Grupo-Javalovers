//Let persona3 = new Persona('Carla', ' Ponce'); esto no se debe hacer: Persona is no...

class Persona{ //Clase padre
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get apellido(){
        return this._apellido;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }
  
    nombreCompleto(){
        return this._nombre+ '' + this._apellido;
    }
  toString(){//Regresa un String
      return this.nombreCompleto();
  }
}

class Empleado extends Persona{ // Clase hija 
    constructor(nombre, apellido, departemento){
        super(nombre, apellido);
        this._departamento = departamento;
    }

    get departamento(){
        return this._departamento;
    }

    set departamento(departamento){
        this._departamento = departamento;
    }

    //Sobreescritura
    nombreCompleto(){
        return super.nombreCompleto() + ' ' + this._departamento;
    }
}

let persona1 = new Persona('Martin','Perez');
console.log(persona1.nombre);
persona1.nombre= 'Juan Carlos';
console.log(persona1.nombre);
//console.log(persona1);

let persona2 = new Persona('Carlos','Lara');
console.log(persona2.nombre);
persona2.nombre= 'María Laura';
console.log(persona2.nombre);
//console.log(persona2);

let empleado1 = new Empleado('María', 'Gimenez', 'Sistema');
console.log(empleado1);
console.log(empleado1.nombreCompleto());
//console.log(persona3);

let empleado2 = new Empleado('Luna', 'Martinez', 'Sistema');
console.log(empleado1);
console.log(empleado1.nombreCompleto());
//console.log(persona3);

//object.prototype.toString Esta es la manera de acceder a atributos y metodos de manera dinamica
console.log(empleado1.toString());

 
