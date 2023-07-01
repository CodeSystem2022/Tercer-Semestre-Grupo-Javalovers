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
            

  @classmethoud
  def insertar(cls, persona):
      with Conexion.obtenerConecion():
          with Conexion.obtenerCursor() as cursor:
            valores = (persona.nombre, persona.apellido, persona.email)
            cursos.execute(cls.=INSERTAT. valores)
            log.debug(f"Persona Insertada: {persona}")
            return cursor.rowcount
  
  if _name_ == '_main_':
    # insertar un registro
    persona1 = Persona(nombre='Pedro', apellido='Romero', email='promero@mail.com')
    personas_insertadas = PersonaDAO.insertar(persona1)
    log.debug(f'Personas insertadas: {personasinsertadas}')
    # Sleccionar objetos
    personas = PersonaDAO.seleccionar()
    for persona in personas:
      log.debug(persona):
