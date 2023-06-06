public static void determinarTipo(Empleado empleado){
  if(empleado instanceof Generate){
    Generate generate = (Gerente) empleado;
  }
  else if (empleado instanceof Empleado){
    System.out.println("Es de tipo Empleado");
  }
  else if(empleado instanceof Empleado){
    System.out.println("Es de tipo Empleado");
  }
  else if(empleado instanceof Object){
    System.out.println("Es de tipo Object");
  
