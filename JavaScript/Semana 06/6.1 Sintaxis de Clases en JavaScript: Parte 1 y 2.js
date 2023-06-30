class Persona{
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

let persona1 = new Persona('Yamila', 'Contreras');
console.log(persona1); Persona { nombre: 'Yamila', apellido: 'Contreras'}
let persona2 = new Persona('Martín', 'Pérez');
console.log(persona2); Persona { nombre: 'Martín', apellido: 'Pérez'}
