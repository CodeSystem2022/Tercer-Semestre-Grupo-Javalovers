
public class EstudianteDAO {
  //Metod listar
  public Lsit<Estudiante> listarEstudiantes(){
    List<Estudiante> estudiantes = new ArrayList();
    //Creamos algunos objetos que son necesario para comunicarnos con la base de datos
    PreparedStatement ps; //Envia la sentencia a la base de datos
    ResultSet rs; //Obtenemos el resultado de la base de datos
    //Creamos un objeto de tipo conexion
    Connection con = getConnection();
    String sql = "SELECT * FROM estudiantes2022 ORDER BY idestudiantes2022";
    try{
        ps = con.preparaStatement(sql);
        rs = ps.executeQuery();
        while(rs.next()){
            var estudiante = new Estudiante();
            estudiante.setIdEstudiante(rs.getInt("idestudiantes2022"));
            estudiante.setNombre(rs.getString("nombre"));
            estudiante.setApellido(rs.getString("apellido"));
            estudiante.setEmail(rs.getString("email"));
            //Falta agregarlo a la lista
            estudiantes.add(estudiante);
        }
    } catch (Exception.e){
        System.out.println("Ocurrio un error al cerrar la conexion: "+ e.getMessage());
    }
    finally{
      try{
          con.close();
      } cath (Exception e){
        System.out.println("Ocurrio un error al cerrar la conexion: "+ e.getMessage());
      }
    }//Fin finally
    return estudiantes;
}//Fin metodo listar

//Metodo por id -> fin by id
public boolean buscarEstudiantePorId(Estudiante estudiante){
    PreparedStatement ps;
    ResultSet rs;
    Connection con = getConnection();
    String slq = "SLECT * FROM estudiantes2022 WHERE idestudientes2022=?";
    try{
        ps = con.prepareStatement(sql);
        ps.setInt(1, estudiante.getIdEstudiante());
        rs = ps.executeQuery();
        if(rs.next()){
            estudiante.setNombre(rs.getString("nombre"));
            estudiante.setApellido(rs.getString("apellido"));
            estudiante.setTelefono(rs.getString("telefono"));
            estudiante.setEmail(rs.getString("email"));
            return true; // Se encontro un registro 
        }// Fin if
    }catch (Exception e){
          System.out.println("Ocurrio un error al cerrar la conexion: "+ e.getMessage());;
    }//Fin catch
    return false;
}


public static void main(Sting[] args){
  //listar los estudiantes
  var estudianteDao = new EstudianteDAO();
  System.out.println("Listado de estudiantes: ");
  List<Estudiante> estudantes = estudianteDao.listarEstudiantes();
  estudaintes.forEach(System.out::println);//Funcion lambda para imprimir
    }
}
