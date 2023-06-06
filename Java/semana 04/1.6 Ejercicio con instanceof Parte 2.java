public static void determinarTipo(Empleado empleado){
  if(empleado instanceof Generate){
    Generate generate = (Gerente) empleado;
    ((Gerente) empleado).getDepartamento();
    System.out.println("gerente = "+gerente.getDepartamento());
  }
  else if (empleado instanceof Empleado){
    System.out.println("Es de tipo Empleado");
    //Gerente gerente = (Gerente)empleado;
    //System.out.println("gerente = "+gerente.getDepartamento());
  }

  else if(empleado instanceof Object){
    System.out.println("Es de tipo Object");
