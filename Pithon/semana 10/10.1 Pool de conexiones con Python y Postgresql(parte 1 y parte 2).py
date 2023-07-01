#PARTE 1 ALEXA NAHUEL
import psycopg2 import pool
#psycopg2 as db otra manera de importar el psycopg2
#from logger_base import log
#import sys


class Conexion:
    _DATABASE = "test_bd"
    _USERNAME = "postgres"
    _PASSWORD = "admin"
    _DB_PORT = "5432"
    _HOST = "127.0.0.1"
    _MIN_CON = 1
    _MAX_CON = 5
    _pool = None

@classmethod
def obtenerConexion(cls):
    conexion = cls.obtenerpool().getconn()
    log.debug(f'Conexion obtenida del pool: {conexion}')
    return conexion
    
#PARTE2: ANDRES CARRIZO 

@classmethod
def obtenerCursor(cls):
    pass

@classmethod
def obtenerPoll(cls):
    if cls._pool is None:
        try:
            cls._pool= pool.SimpleConnectionPool(cls._MIN_CON,
                                                 cls._MAX_CON,
                                                 host=cls._HOST,
                                                 user=cls._HOST,
                                                 password=cls._PASSWORD,
                                                 port=cls._DB_PORT,
                                                 database=cls._DATABASE)
            log.debug(f'creacion del pool exitosa: {cls.pool}')
                                                 
    
