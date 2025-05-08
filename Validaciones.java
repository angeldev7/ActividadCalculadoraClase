package principal;
import java.util.*;
public class Validaciones {
    Scanner sc=new Scanner(System.in);
  public double entradaDatos(String imput){
  while(true){
  try{
      return Double.parseDouble(imput);
  }catch(NumberFormatException e){
      System.out.println("Entrada valida");
      imput =sc.nextLine();
  }
  }
  }  
}
