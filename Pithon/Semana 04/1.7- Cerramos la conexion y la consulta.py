cursor = conexion.cursor()
sentencia ="SELECT*FROM persona"
cursor.execute(sentencia)
registros =cursor.fetchall()
print(registros)


cursor .close()
conexion.close()

