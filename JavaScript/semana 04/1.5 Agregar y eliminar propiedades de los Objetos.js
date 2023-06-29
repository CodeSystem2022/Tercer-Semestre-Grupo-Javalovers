let x = 10;//variable de tipo primitivo
console.log(x.length);

//Objeto 
let persona= {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 30,
    nombreCompleto: function(){//metodo o funcion en JavaScript
        return this.nombre+' '+this.apellido;
    }

}
console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());

let persona2 = new Object(); //Debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '2312312131';
console.log(persona2.telefono);

console.log(persona['apellido']); //Accedemos como si fuera un arreglo

//for in y accedemos al objeto como si fuera un arreglo
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}
//agregar propiedad
persona.apellido = 'Suarez';// Cambiamos dinamicamente un valor del objeto
delete persona.apellido; //Eliminamos el error
console.log(persona);
