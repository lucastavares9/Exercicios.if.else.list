import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        //Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
        
        System.out.print("Primeiro produto: " + " R$ ");
        double p1 = sc.nextDouble();
        System.out.print("Segundo produto: " + "R$ ");
        double p2 = sc.nextDouble();
        System.out.print("Terceiro produto: " + "R$ ");
        double p3 = sc.nextDouble();
        sc.close();
        System.out.println();
        System.out.print("O produto com melhor preço é");
        if (p1<p2 && p1<p3){
            System.out.println(" o PRIMEIRO " + "R$ "+ p1);
         } else if (p2<p1 && p2<p3){
            System.out.println(" o SEGUNDO " + "R$ " + p2 );
         }else {
            System.out.println(" o TERCEIRO "+ "R$ " + p3);
         }
       
    }
}
