//paso por referencia
const persona = {
  nombre: 'Juan',
  apellido:'Lopez'
}
console.log(persona);
function cambiarVAlorObjeto(p1){
  p1.nombre = 'Ignacion';
  p1.apellido = 'Perez';
}
cambiarValorObjeto(persona);
console.log(persona); {nombre:'Ignacion',apellido:'Perez'}
