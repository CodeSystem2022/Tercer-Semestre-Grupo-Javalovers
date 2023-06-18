//5.5 modificacion en (padre.telefono)
let padre = new Persona3("Leo","Lopez","lopezl@gmail.com");
padre.nombre = "Luis"; // modificamos el nombre
padre.telefono = "5492618282821"; //una propiedad exclusiva del objeto padre
console.log(padre);
console.log(padre.nombreCompleto());
let madre = new Persona3("Laura","Contrera","contreral@gmail.com");
console.log(madre);
console.log(madre.telefono); //la propiedad no esta definida
console.log(madre.nombreCompleto());

//Uso de prototype
Persona3.prototype.telefono ="2618383832";
console.log(padre);
console.log(madre.telefono);
madre.telefono = "5492618383832";
console.log(madre.telefono);

