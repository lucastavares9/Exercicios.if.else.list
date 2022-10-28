import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
    //Faça um Programa que leia três números e mostre-os em ordem decrescente.
    System.out.println("Informe os numeros escolhidos: ");
    Scanner sc = new Scanner(System.in);
    System.out.print("N1= ");
    int a = sc.nextInt();
    System.out.print("N2= ");
    int b = sc.nextInt();
    System.out.print("N3= ");
    int c = sc.nextInt();
    System.out.println();
    sc.close();
    System.out.print("Ordem decrescente fica: ");
    if (a>b && a>c){
        System.out.println(a+","+b+","+c);
    } else if (a>=c && a>=b){
        System.out.println(a+","+c+","+b);
    } else if (b>=a && b>=c){
        System.out.println(b+","+a+","+c);
    } else if (b>=c && b>=a){
        System.out.println(b+","+c+","+a);
    } else if (c>=a && c>=b){
        System.out.println(c+","+a+","+b);
    }else{
        System.out.println(c+","+b+","+a);
    }
       
    }
    

   }

