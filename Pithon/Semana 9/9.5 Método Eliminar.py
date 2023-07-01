@classmethod
def eliminar(cls, persona):
  with Conexion.obtenerCoenxion():
    valores = (persona.id_persona,)
    cursor.execute(cls._ELIMINAR, valores)
    log.debug(f'Los objetos eliminados son: {persona}')
    return cursor.rowcount

if__name == '__main__':
#Eliminar un registro
persona1 = Persona(id_persona=13)
persona_eliminadas = PersonaDAO.eliminar(persona1)
log.debud(f'Perosnas eliminadas: {personas_eliminadas}')

