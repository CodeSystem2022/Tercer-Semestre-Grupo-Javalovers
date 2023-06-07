//Uso de call
let persona4= {
  nombre:'Juan',
  apellido;'Perez',
  nombreCompleto2: function(titulo, telefono){
    retunr titulo+': '+this.nombre+''+this.apellido+''+telefono;
  }
}

let persona5= {
  nombre: 'Carlos',
  apellido:'Lara'
}

console.log(persona4.nombrecompelto2('Lic,'5426468495643)); Lic: Juan Perez 5426468495643
console.log(persona4.nombrecompelto2.call(persona5,'ing','54265856575446')); Ing.: Carlos Lara 54265856575446
