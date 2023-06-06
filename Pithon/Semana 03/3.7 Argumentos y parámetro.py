/parametros: es la lista de variables que definimos en una funcion y los argumentos son valores que pasamos cuando llamamos una funcion 

//Funcion tipo expresion 
let sumar = function(a = 4, b = 8){
  console.log(arguments[0]);//muestra parametro de: a 
  console.log(arguments[1]);//muestra el parametro de b
  console.log(arguments[2])
  return a + b + arguments [2]
  //return a + b;
}
resultado = sumar(3, 2, 3);
console.log(resultado);
