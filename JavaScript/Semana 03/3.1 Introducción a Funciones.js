//llamar ala funcion antes de estar definirla, esto se llama hoisting 
miFuncion(8, 2);
function miFuncion(a, b){//escritura camelcase
    console.log('Sumamos: '+ (a+b));
}
//Llamando a la funcion
miFuncion(5, 4);
