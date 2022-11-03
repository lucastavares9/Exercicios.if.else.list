import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        System.out.println("Bem vindo, ao progama calcule sua media no semestre!");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Insira Primeira Nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Insira Segunda Nota: ");
        double n2 = sc.nextDouble();
        double media = (n1+n2)/2;

        System.out.println("Media= " + media);
        System.out.print("Concetio: ");
        sc.close();

        if (media >= 9 && media <= 10){
            System.out.println("A");
        } else if (media >= 7.5 && media <= 9){
            System.out.println("B");
        } else if (media >= 6 && media <= 7.5){
            System.out.println("C");
        } else if (media >= 4 && media <= 6){
            System.out.println("D");
        } else if (media <= 4){
            System.out.println("E");

        }


    }
}
