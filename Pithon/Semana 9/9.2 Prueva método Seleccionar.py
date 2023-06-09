class PersonaDAD:
    """
    DAD significa:Data Access object
    CRUD significa:
                    Create -> Insertar 
                    Read -> Seleccionar
                    Update -> Actualizar
                    Delete -> Eliminar
    """
    SELECCIONAR = 'SELECT * FROM persona ORDER BY id_persona'
    INSERTAR = 'INSERT INTO persona (nombre, apellido, email) VALUES (%s, %s, %s)'
    ACTUALIZAR = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    ELIMINAR= 'DELETE FROM persona WHERE id_persona%s'
    
    #Definimos los métodos de clase
    @classmethod 
    def seleccionar(cls):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                cursor.execute(cls._SELECCIONAR)
                registros = cursor.fetchall()
                personas = [] #Creamos una lista
                for registro in registros:
                    persona = Persona(registro[0], registro[1], registro[2], registro[3])
                    personas.append(persona)
                return personas
            
if __name__ == '__main__':
    personas = PersonaDAO.seleccionar()
    for persona in personas:
        log.debug(persona)