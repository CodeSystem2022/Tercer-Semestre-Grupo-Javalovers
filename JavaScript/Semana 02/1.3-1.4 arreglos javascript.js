const autos = ['Ferrari', 'Renault', 'BMW'];
console.log(autos); ['Ferrari', 'Renault', 'BMW' ]
console.log(AUTOS[0]);
console.log(autos[2]);

for(let i = 0; i < autos.lenght; i++){
    console.log(i+' : '+autos[i])
}
//Modificar los elementos del arreglo 
autos[1] = 'Volvo';
console.log(autos[1]); Volvo

//Agregamos nuevos valores al arreglo 
autos.push('Audi');//Agregamos el elemento al final del arreglo 
console.log(autos);

autos[autos.length] = 'porshe'
console.log(autos);


