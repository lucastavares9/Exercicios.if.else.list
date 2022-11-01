import java.util.Scanner;

public class exercicio11{
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Em qual turno você estuda, M-matutino, V-vespertino e N-norturno? ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe em qual periodo você estuda: ");
        String turno = sc.next();
        
       

        if (turno.equals("m")){
          System.out.println("Bom dia!");
         } else if (turno.equals("v")){
          System.out.println("Boa tarde!");
         }else if (turno.equals("n")){
          System.out.println("Boa noite!");
         }else{
            System.out.println("Valor inválido");
         }
         sc.close();
        }

    }
