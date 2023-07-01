from logger_base import log
from conexion import Conexion

Class CursorDelPool:
def__init__(self) = None
self._conexion = None
self._cursor = None


def__enter__(self):
log.debug('Inicio del metodo with y __enter__')
self.conexion = Conexion.obtenerConexion()
self._cursor = self._conexion.cursor()
return self._cursor

def__exit__(self,tipo exception, valor_exception, detalle_exception):
   log.debug('Se ejecuta el metodo exit')
   if valor_exception:
     self._conexion.rollback()
     log.debug(f'Ocurrio una excepcion: {valor_exception}')
   else:
     self.conexion.comit()
     log.debug('Commit de la transaccion')
     self.cursor.close()
     Conexion.liberarConexion(self._conexion)
     

