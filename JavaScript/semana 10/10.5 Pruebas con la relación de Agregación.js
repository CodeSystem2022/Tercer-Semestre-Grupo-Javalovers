calcularTotal(){
let totalVenta = 0;
  for(let producto of this._productos){
    totalVenta += producto.precio;
  }//fin ciclo for
  return totalVenta;
}//fin del metodo calcularTotal

mostrarOrden(){
let productoOrden = '';
for(let produto of tuhis._productos){
  productosOrden += producto.toSting()+ ' ';
}//Fin del ciclo for
console.log('Orden: ${this.idOrden}, Total: $${this.calcularToal()}, productos: ${productosOrden}')
}//Fin metodo mostrarOrden
}//Fin de la clase Orden

let produto1 = new Producto('Pantalon',200);
let producto2 = new Producto('Camisa',150);
let producto3 = new Producto('Cinturon', 50);
let orden1 = new Orden();
let orden2 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden2.agregarProducto(producto3);
orden1.mostrarOrden();
orden2.mostarOrden();


