try:
  with conexion:
    with conexion.cursor() as cursor:
      sentencia = 'DELATE FROM persona WHERE id_persona=%s'
      entrada = input('Digite el numero de registros a eliminar:  ')
      valores = (entrada,) #Es una tupla de valores
      cursor.execute(sentencia, valores) #De esta manera ejecutamos la sentencia
      registros_eliminados = cursor.rowcount
      print(f'Los registros eliminados son: {registros_eliminados}')
