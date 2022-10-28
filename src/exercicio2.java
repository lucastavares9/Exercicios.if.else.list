import java.util.Scanner;
public class exercicio2{
    public static void main(String[] args){
        // peca dois numeros e imprima o maior
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite o primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int n2 = sc.nextInt();
        sc.close();
        
        if (n1>n2){
            System.out.println("O primeiro é o maior ");
        }else{
            System.out.println("O segundo é o maior");

        }
         
    }
}
