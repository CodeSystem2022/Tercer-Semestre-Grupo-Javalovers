#para actulizar un registro 
@classmethod
def actualizar(cls,persona):
    with Conexion.obtenerConexion():
        with Conexion.obtenerCursor() as cursor:
            valores = (persona.nombre,persona,apellido,persona.email,persona.id_persona)
            cursor.execute(cls.ACTUALIZAR, valores)
            log.debug(f'Persona actualizada: {personas_insertadas}')
            return cursor.rowcount

if __name__ -- '__main__':
    #Actualizar un registro
    persona1 = Persona(1, 'Juan Jose', 'Pena', 'jjpena@mail.com')
    personas_actualizadas = PersonaDAD.actualizar(persona1)
    log.debug(f'Persona actualizadas: {personas_actualizadas}')



#Insertar un registro
    #persona1= Persona(nombre='Omero', apellido='Ramos', email='omeror@mail.com')
    #personas_insertadas= PersonaDAD.insertar(persona1)
    #log.debug(f'Personasinsertadas: {personas_insertadas}')


#Seleccionar objetos
    personas = PersonaDAD.seleccionar()
    for persona in personas:
        log.debug(persona)

