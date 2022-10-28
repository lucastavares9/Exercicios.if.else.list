import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        // Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
        // A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
        //A mensagem "Reprovado", se a média for menor do que sete;
        //A mensagem "Aprovado com Distinção", se a média for igual a dez.

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite segunda nota: ");
        double n2 = sc.nextDouble();
        double media = (n1+n2)/2;
        sc.close();
     
        if (media==10){
            System.out.println("Aprovado com distinção");
        } else if (media>= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

}
