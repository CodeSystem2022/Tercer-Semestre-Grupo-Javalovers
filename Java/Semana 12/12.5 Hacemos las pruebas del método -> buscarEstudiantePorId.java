  //Buscar por id
    var estudiante1 = new Estudiante(1);
    System.out.println('Estudiantes antes de la busqueda: '+estudiante1);
    var encontrado = estudianteDao.buscarEstudiantePorId(estudiante1);
    if(encontrado)
      System.out.println('Estudiante encontrado: '+estudiante1);
    else
      System.out.println('No se encontro el estudiante: '+estudiante1.getIdEstudiante())


