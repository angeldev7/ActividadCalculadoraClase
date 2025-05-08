package principal;

public class Calculadora {
    Validaciones entrada= new Validaciones();
  private double num1,num2;

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(String imput) {
        this.num1 = entrada.entradaDatos(imput);
    }

    public void setNum2(String imput) {
        this.num2 = entrada.entradaDatos(imput);
    }
  
   public double suma( double num1, double num2){
  return num1+num2;
  } 
   public double resta( double num1, double num2){
  return num1-num2;
  }  
   public double multiplicar( double num1, double num2){
  return num1*num2;
  }   
  public double dividir( double num1, double num2){
      if(num2== 0){
          System.out.println("error: division para cero. \n digitie de nuevo");
          return Double.NaN;
      }
  return num1/num2;
  } 
public double potencia( double num1, double num2){
    
  return Math.pow(num1, num2);}

     public double raiz( double num1){
         if(num1<0){
             System.out.println("erro: raiz de numero negativo \n digite de nuevo");
             return 0;
         }
  return Math.sqrt(num2);
  }
}
