package test;

import domain.*;

public class TestSobreescritura {
  public static void main (String[] args{
    Empleado empleado1 = new Empleado("Juan",1000);
    imprimir(empleado1);
    //System.out.println("empleado1 =" + empleado1.obtenerDetalles());
    imprimir (gerente1)
    Generate gerente1 = new Gerente ("Jose",5000,"Sistema");
    //System.ouy.println("gerente1 =" + gerente1.obtenerDetalles());
  }
   
  public static void imprimir(Empleado empleado) {
    System.out.println("empleado = " + empleado.obtenerDetalles());
