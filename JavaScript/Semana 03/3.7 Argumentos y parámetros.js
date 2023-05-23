//Las diferencias entre los argumentos y los parametros
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
