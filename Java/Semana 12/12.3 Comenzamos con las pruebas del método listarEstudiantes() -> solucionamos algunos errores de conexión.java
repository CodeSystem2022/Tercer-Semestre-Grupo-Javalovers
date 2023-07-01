public static void main(Sting[] args){
  //listar los estudiantes
  var estudianteDao = new EstudianteDAO();
  System.out.println("Listado de estudiantes: ");
  List<Estudiante> estudantes = estudianteDao.listarEstudiantes();
  estudaintes.forEach(System.out::println);//Funcion lambda para imprimir
    }
}
