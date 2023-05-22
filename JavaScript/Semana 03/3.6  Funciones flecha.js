miFuncion(8, 2);   //Esto se lo conoce como hosting

function miFuncion(a, b){   //La funcion la podemos llamar ante de definirla o despues y a esto se lo denomina HOISTING(MUEVE LA RECLARACION DE LA FUNCION)
    //console.log("Sumamos:"+ (a + b));
    return a + b;
}

//Llamamos la funcion
miFuncion(5, 4); 

let resultado = miFuncion(6, 7);
console.log(resultado);

//Declaramos una funcion de tipo expresión 
let x = function(a, b){ return a + b }; //necesita cierre con punto y coma
resultado = x(5, 6); //al llamarla se pone la variable y parentesis
console.log(resultado);
miFuncion(8, 2);   //Esto se lo conoce como hosting

function miFuncion(a, b){   //La funcion la podemos llamar ante de definirla o despues y a esto se lo denomina HOISTING(MUEVE LA RECLARACION DE LA FUNCION)
    //console.log("Sumamos:"+ (a + b));
    return a + b;
}

//Funciones de tipo self y invoking
(function(a, b){
    console.log('Ejercutando la funcion: '+(a + b));
})(9, 6);

console.log(typeof miFuncion);
funcion miFunciondos(a, b){
    console.log(arguments.length);
}
miFunciondos(5, 7, 3);

//toString
var miFuncionTexto = miFunciondos.toString();
console.log(miFuncionTexto);

//Funciones flecha.... ya no usamos la palabra reservada "funcion", no se utilizan las llaves y no se utiliza la palabra reselvada "Return"
const sumarFuncionFlecha = (a, b) => a + b;
resultado = sumarFuncionFlecha(3, 7);    //Asignamos el valor a una variable
console.log(resultado);  
