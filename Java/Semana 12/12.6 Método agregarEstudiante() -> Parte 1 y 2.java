// Metodo agregar un nuevo estudiante
public boolean agregarEstudiante(Estudiante estudiante){
    PreparedStatement ps;
    Connection con = getConnection();
    String sql = 'INSERT INTO estudiantes2022 (nombre, apellido, telefono, email) VALUES (?,?,?,?)';
    try{
        ps = con.PreparedStatement(sql);
        ps.setString(1, estudiante.getNombre());
        ps.setString(2, estudiante.getApellido());
        ps.setString(3, estudiante.getTelefono());
        ps.setString(4, estudiante.getEmail());
        ps.execute();
        return true;
    } catch (Exception e) {
        System.out.println("Ocurrio un error al agregar estudiante: "+e.getMessage()); 
    } // Fin catch
    finally{
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("Error al cerrar la conexion: "+e.getMessage());
        }// Fin catch
    } // Fin finally
    return false;

} // Fin metodo agregarEstudiante
