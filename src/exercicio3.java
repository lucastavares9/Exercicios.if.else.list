import java.util.Scanner;

public class exercicio3 {
   public static void main(String[] args) {
    //Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o numero: ");
    int n1 = sc.nextInt();
    sc.close();

    if (n1>0){
        System.out.println("O numero é positivo");
    } else {
        System.out.println("O numero é negativo");
    }
     
   } 

}
