
------------------------------

class Orden{
    static contadorOrdenes = 0;
    static getMax_PRODUCTOS(){
        return 5;
    }

    constructor(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = [];
        this._contadorProductosAgregados = 0;
    }

    get idOrden(){
        return this._idOrden;
    }

    agregarProducto(producto){
        if(this._productos.lengtht < Orden.getMax_PRODUCTOS()){
            this._productos.push(producto); // Tenemos 2 tipos de sintaxis: 1
            // this._productos[this._contadorProductosAgregados++] = producto; // Segunda sintaxis
        }
        else{
            console.log('No se pueden agregar mas productos');
        }
    } // Fin del metodo agregarProducto
} // Fin de la clase Orden

let producto1 = new Producto('Pantalon',200);
let producto2 = new Producto('Camisa',150);
console.log(producto1.toString());
console.log(producto2.toString());
