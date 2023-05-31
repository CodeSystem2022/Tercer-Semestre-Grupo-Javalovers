let x = 10; // variable de tipo primitiva
console.log(x.length);
console.log('Tipos primitivos');

//Objecto
let persona = {
    nombre : 'Carlos',
    apellido:'Gil',
    email : 'cgil@gmail.com',
    edad : 30,
    nombreCompleto: function(){ //método o función en JavaScript
        return this.nombre+' '+this.apellido;
    }
}
console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());
console.log('Ejecutando con un objecto');

//Vamos a crear otro objecto en memoria:
let persona2 = new Object(); 
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '549261828221';
console.log('Creamos un nuevo objecto');
console.log(persona2.telefono);

console.log(persona['apellido']);//Accedemos como si fuera un arreglo
console.log('Usamos el ciclo for in');

//for in y accedemos al objecto como si fuera un arreglo 
for(propiedad in persona) {
    console.log(propiedad);
    console.log(persona[propiedad]);
}
console.log('Cambiamos y eliminamos un error');

persona.apellido = 'Betancud';//Cambiamos dianamicante  un valor del objecto
delete persona.apellido; //Eliminamos el error (la propiedad y sus valor)
console.log(persona);

