if __name__ =='__main__':
    with CursorDelPool() as cursor:
        log.debug('Dentro del bloquew with')
        cursor.execute('SELECT * FROM persona')
        log.debug(cursor.fetchall())
        
