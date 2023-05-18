const autos = ['Ferrari', 'Renault', 'BMW'];
console.log(autos); ['Ferrari', 'Renault', 'BMW' ]
console.log(AUTOS[0]);
console.log(autos[2]);

for(let i = 0; i < autos.lenght; i++){
    console.log(i+' : '+autos[i])
}
autos[1] = 'Volvo';
console.log(autos[1]); Volvo

autos.push('Audi');
console.log(autos);

autos[autos.length] = 'porshe'
console.log(autos);

autos[6] = 'Renault'
console.log(autos)

consaole.log(autos instanceof Array);
