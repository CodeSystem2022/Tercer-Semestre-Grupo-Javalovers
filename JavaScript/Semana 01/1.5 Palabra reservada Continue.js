//La palabra continue y Etiquetas Labels (nos permite ir a la parte del programa que queramos)
inicio://las etiquetas labels no son recomendadas en la programacion 
for (let contanda = 0; contanda <=10; contanda++){
    if(contanda % 2 !== 0){
        console.log(contanda) //Muestra todos los pares
        //continue inicio;
        break inicio;// al poner el break aca rompe el ciclo 
    }
    console.log(contanda);
}
console.log('fin el ciclo ');// se conoce como programacion go to no esta recomendada para realizar pero si en necesario saberla para modificarlo o al menos saber de que se trata
