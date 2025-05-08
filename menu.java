package principal;
import java.util.*;
public class menu {
Calculadora calculos= new Calculadora(0,0);
Scanner sc= new Scanner(System.in);
public void iniciar(){
    char opc;
    System.out.println("==Calculdora==");
do{    System.out.println("1.suma");
System.out.println("2.resta");
System.out.println("3.multiplicacion");
System.out.println("4.division");
System.out.println("5.potencia");
System.out.println("6.raiz");
System.out.println("7.salir");
opc=sc.next().charAt(0);
switch(opc){
    case '1':
        operacionSuma();
        break;
    case '2':
        operacionResta();
        break;
            case '3':
                operacionMultiplicacion();
        break;
    case '4':
        operacionDivision();
        break;
            case '5':
                operacionPotencia();
        break;
    case '6':
        operacionRaiz();
        break;
            case '7':
                System.out.println("BYE BYE");
        break;
            default: System.out.println("Opcion no valida");
}
}while(opc != '7');
}    

    private void obtenerNumeros() {
        System.out.print("Ingrese el primer número: ");
        calculos.setNum1(sc.nextLine());
        System.out.print("Ingrese el segundo número: ");
        calculos.setNum2(sc.nextLine());
    }
    
    private void operacionSuma() {
        obtenerNumeros();
        double resultado = calculos.suma(calculos.getNum1(), calculos.getNum2());
        System.out.println("Resultado: " + resultado);
    }
    
    private void operacionResta() {
        obtenerNumeros();
        double resultado = calculos.resta(calculos.getNum1(), calculos.getNum2());
        System.out.println("Resultado: " + resultado);
    }
    
    private void operacionMultiplicacion() {
        obtenerNumeros();
        double resultado = calculos.multiplicar(calculos.getNum1(), calculos.getNum2());
        System.out.println("Resultado: " + resultado);
    }
    
    private void operacionDivision() {
        obtenerNumeros();
        double resultado = calculos.dividir(calculos.getNum1(), calculos.getNum2());
        if (!Double.isNaN(resultado)) {
            System.out.println("Resultado: " + resultado);
        }
    }
    
    private void operacionPotencia() {
        obtenerNumeros();
        double resultado = calculos.potencia(calculos.getNum1(), calculos.getNum2());
        System.out.println("Resultado: " + resultado);
    }
    
    private void operacionRaiz() {
        System.out.print("Ingrese el número para calcular la raíz: ");
        calculos.setNum1(sc.nextLine());
        double resultado = calculos.raiz(calculos.getNum1());
        if (!Double.isNaN(resultado)) {
            System.out.println("Resultado: " + resultado);
        }
    }
}
