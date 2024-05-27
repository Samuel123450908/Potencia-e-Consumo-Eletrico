
public class Main {
  public static void main(String[] args) {
    System.out.println("Potência e Consumo");
    System.out.println("");

    System.out.println("Uma tv de 200 watts fica ligada aproximadamente 5h diariamente. Determine o consumo eletrico mensal da tv");
    System.out.println("");
    System.out.println("valor da potência ");
    int potencia = 200;
    System.out.println(potencia);

    System.out.println("dias");
    int hora = 5;
    System.out.println(hora);
System.out.println("");

    System.out.println("dias do mês ");
    int mes = 30;
    System.out.println(mes);
    System.out.println("");
    
    System.out.println("divida valor da potencia, o valor da hora e o valor do mês por mil");
   
    System.out.println("");
    int mil = 1000;
    System.out.println(mil);
    
System.out.println("");
    
    int consumo = potencia * hora * mes / mil;
   
    System.out.println("");
    System.out.println("consumo");
    System.out.println(consumo);
    
    

    

      
  }
}