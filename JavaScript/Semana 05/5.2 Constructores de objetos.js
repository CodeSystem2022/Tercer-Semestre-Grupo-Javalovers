let x = 10;//variable de tipo primitivo
console.log(x.length);
console.log(x.length);
console.log('Tipos primitivos');

//Objeto 
let persona= {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 28,
    idioma: 'ALEMAN',//los idiomas se  manejan en mayuscula

    get lang(){
        return this.idioma.toUpperCase();// covierte las minusculas a mayusculas
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },

    nombreCompleto: function(){//metodo o funcion en JavaScript
        return this.nombre+' '+this.apellido;
    },
    get nombreEdad(){//este es elmetodo get
        return 'El nombre es: '+this.nombre+', Edad: '+this.edad;
    }
    
}
console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());
console.log('Ejecutamos con un objeto');

let persona2 = new Object(); //Debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '2312312131';
console.log(persona2.telefono);
console.log('Creamos un nuevo objeto');
console.log(persona['apellido']); //Accedemos como si fuera un arreglo
console.log('Usamos el ciclo for in');
//for in y accedemos al objeto como si fuera un arreglo
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}
console.log('cambiamos y eliminamos un error');
//agregar propiedad
persona.apellido = 'Suarez';// Cambiamos dinamicamente un valor del objeto
delete persona.apellido; //Eliminamos el error
console.log(persona);

//Distitas formas de imprimir un objeto
//numero 1: la mas sencilla: concatenar cada valor de cada propiedad
console.log('Distinta forma de imprimir un objeto: forma 1');
console.log(persona.nombre+', '+persona.apellido)

//numero 2: a traves del ciclo for in
console.log('Distinta forma de imprimir un objeto: forma 2');
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//Numero 3: La funcion object. values()
console.log('Distinta forma de imprimir un objeto: forma 3');
let personaArray = Object.values(persona);
console.log(personaArray);

//numero 4: utilizaremos el metodo JSON.stringify
console.log('Distinta forma de imprimir un objeto: forma 4');
let personaString = JSON.stringify(persona);
console.log(personaString)
console.log('Comenzamos a utilizar el metodo get');
console.log(persona,nombreEdad);

console.log('Comenzamoscon el metodo get y  set para idiomas');
persona.lang = 'en';
console.log(persona.lang);

function Persona3(nombre, apellido, email)// se puede hacer una preasignacion asi: nombre ='luis'
{// constructor 
    this.nombre = nombre;
    this.apellido =apellido;
    this.email = email;
}
let padre = new Persona3('Julieta', 'Martina', 'Julimartina02@gmail.com');
padre.nombre = 'guadalupe';
console.log(padre);

let madre = new Persona3 ('Laura', 'Contrera', 'contreral@gmail.com');
console.log(madre);
//al usar la funcion new se crea un espacio nuevo para cada uno de los objetos creados por lo que no se ven afectados entre si cuando modificamos alguno. ya que ninguno comprate la misma informacion  
