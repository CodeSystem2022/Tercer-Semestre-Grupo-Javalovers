import psycopg2  #Esto es para poder conectarnos a Postgre

conexion = psycopg2.connect(
    user= 'postgres',
    password= 'admin',
    host= '127.0.0.1',
    port='5432',
    database='test_bd'
)
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'SELECT * FORM persona WHERE ide_persona = %s' #Plceholder
            ide_persona = input('Digite un número para el ide_persona: ')
            cursor.execute(sentencia, (ide_persona,)) #De esta manera ejecutamos la sentencia
            registros = cursor.fetchone()#Recuperamos todos los registros que serán una lista
            print(registros)
except Exception as e:
    print(f'Ocurrió un error: {e}')
finally: 
     conexion.close()
    
#VIDEO DE LA CLASE 6: video 1
import psycopg2  #Esto es para poder conectarnos a Postgre

conexion = psycopg2.connect( user= 'postgres1', password= 'admin', host= '127.0.0.1', port='5432', database='test_bd')
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'SELECT * FORM persona WHERE ide_persona = %s' #Plceholder
            ide_persona = input('Digite un número para el ide_persona: ')
            cursor.execute(sentencia, (ide_persona,)) #De esta manera ejecutamos la sentencia
            registros = cursor.fetchone()#Recuperamos todos los registros que serán una lista
            print(registros)
except Exception as e:
    print(f'Ocurrió un error: {e}')
finally: 
    conexion.close()

#https://www.psycopg.org/docs/usage.html
