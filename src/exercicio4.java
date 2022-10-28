import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        // Faça um Programa que verifique se uma letra digitada é "F" ou "M".
        // Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite F ou M: ");
        String l1 = sc.next();
        sc.close();

        if (l1.equals("F")){
            System.out.println("FEMININO");
        } else if (l1.equals("M")){
            System.out.println("MASCULINO");
        } else{
            System.out.println("SEXO INVÁlIDO");
        }


    }


}
