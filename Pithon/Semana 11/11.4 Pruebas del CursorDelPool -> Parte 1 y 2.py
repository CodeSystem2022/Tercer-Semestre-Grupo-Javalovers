#PARTE1
if __name__ =='__main__':
    with CursorDelPool() as cursor:
        log.debug('Dentro del bloquew with')
        cursor.execute('SELECT * FROM persona')
        log.debug(cursor.fetchall())
#PARTE2

  @classmethod
    def seleccionar(cls):
        with CursorDelPool() as cursor:
            cursor.execute(cls._SELECCIONAR)
            registros = cursor.fetchall()
            personas = [] #Creamos una lista
            for registro in registros:
                persona =  Persona(registro[0], registro[1], registro[2], registro[3])
                personas.append(persona)
            return personas
    @classmethod
    def insertar(cls,persona):
        with CurosrDelPool() as cursor:
            valores = (persona.nombre, persona.apellido, persona.email)
            cursor.execute(cls._INSERTAR, valores)
            log.debug(f'Persona Insertada: {persona}')
            return  cursor.rowcount


    @classmethod
    def actualizar(cls, persona):
        with CursorDelPool() as cursor:
            valores = (persona.nombre, persona, apellido, persona.email, persona.id_persona)
            cursor.execute(cls.ACTUALIZAR, valores)
            log.debug(f'Persona actualizada: {persona}')
            return cursor.rowcount


    @classmethod
    def eliminar(cls, persona):
        with () as cursor:
            valores = (persona.id_persona,)
            cursor.execute(cls._ELIMINAR,valores)
            log.debeg(f'Los objetos eliminados son: {persona}')
            return cursor.rowcount

#prueba para el metodo seleccionar
personas = PersonaDAO.seleccionar()
for persona in personas:
    log.debug(persona)
        
