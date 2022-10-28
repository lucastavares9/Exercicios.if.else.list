import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        //Faça um Programa que leia três números e mostre o maior e o menor deles.
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.print("Entre com segundo numero: ");
        int n2 = sc.nextInt();
        System.out.print("Entre com terceiro numero: ");
        int n3 = sc.nextInt();

        sc.close();
        
        if (n1>n2 && n1>n3){
            System.out.println("O primeiro é o maior");
        } else if (n2>n1 && n2>n3){
            System.out.println("O segundo é maior");
        } else{
            System.out.println("O terceiro é maior");
        }
        
        if (n1<n2 && n1<n2){
            System.out.println("O primeiro é o menor");
        } else if (n2<n1 && n2<n3){
            System.out.println("O segundo é menor");
        } else{
            System.out.println("O terceiro é menor");
        }
    }
}
