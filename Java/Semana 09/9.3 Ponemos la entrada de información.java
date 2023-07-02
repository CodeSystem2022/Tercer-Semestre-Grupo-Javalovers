  public static void main(String[] args){
      Scanner entrada = new Scanner(System.in);
      System.out.prinln("****Aplicacion Calculadora****");
      System.out.prinln("Digite el valor par el operando 1: ");
      var operando1 = Integer.parseInt(entrada.nextLine());
      System.out.prinln("Digite el valor par el operando 2: ");
      var operando2 = Integer.parseInt(entrada.nextLine());
      var resultado = operando1 + operando2;
      System.out.prinln("resultado = "+ resultado);
  }
}
