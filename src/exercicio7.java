import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        //Faça um Programa que leia três números e mostre o maior deles.
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.print("Digite segundo numero: ");
        int n2 = sc.nextInt();
        System.out.print("Digite terceiro numero: ");
        int n3 = sc.nextInt();
        sc.close();

        if (n1>n2 && n1>n3){
            System.out.println("Primeiro é maior");
        } else if (n2>n1 && n2>n3){
            System.out.println("Segundo é o maior");
        }else {
            System.out.println("Terceiro é maior");
        }


    }
}
