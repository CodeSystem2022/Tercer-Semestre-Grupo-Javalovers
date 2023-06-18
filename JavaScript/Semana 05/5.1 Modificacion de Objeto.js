//5.1Modificacion de Objeto
let persona = {
    nombre : "Carlos",
    apellido: "Gil",
    email: "cgil@gmail.com",
    edad: 30,
    nombreCompleto: function (){ //Metodo o funcion en Javascript
        return this.nombre+" "+this.apellido
    },

    get nombreEdad(){ //Este es el metodo get
        return "El nombre es: "+this.nombre+"Edad: "+this.edad;

    }
}

console.log("Comenzamos a utilizar el metodo get")
console.log(persona.nombreEdad); 
