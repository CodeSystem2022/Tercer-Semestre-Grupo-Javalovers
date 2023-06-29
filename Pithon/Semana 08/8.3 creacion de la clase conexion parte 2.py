import psycopg2 as bd
# psycopg2 as db otra manera de importar el psycog2
from logger_base import log
import  sys

class conexion:
    _DATABASE = 'test_bd'
    _USERNAME = 'postgres'
    _PASSWORD = 'admin'
    _DB_PORT = '5432'
    _HOST = '127.0.0.1'
    _conexion = None
    _cursor = None

  @classmethod
  def obtenerConexion(cls):
    is cls._conexion in None:
      try:
          cls._conexion = bd.connect(host=cls._HOST,
                                     user=cls._USERNAME,
                                     password=cls._PASSWORD,
                                     port=cls._DATABASE)
        log.debug(f'Conexcion Exitosa: {cls._conexion}')
        return cls._conexion
      except Exception as e:
      log.error(f'Ocurrio un error: {e}')
      sys.exit()
    else:
        return cls._conexion
