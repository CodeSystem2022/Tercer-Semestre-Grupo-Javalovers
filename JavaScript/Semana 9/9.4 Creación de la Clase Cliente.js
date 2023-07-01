class Cliente extends Persona{

    static contador = 0;

    constructor(nombre, apellido, edad, fecharegistro){
      super(nombre, apellido, edad);
      this._idCliente = ++fecharegistro;
    }
  get idCliente(){
    return this._idCliente;

  get fecharegistro(){
    retur thus._fechaRegistro;
  }
  set fecharegistro(fecharegistro){
    this._fecharegistro = fecharegistro;
  }
    toString(){
        return
      ${super.toString()}
      ${this._idCliente}
      $this._fechaRegistro}';
  }
}
