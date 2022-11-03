import java.util.Scanner;

public class exercicio13{
 public static void main(String[] args) {
    System.out.println();
    System.out.print("Siga o padrao(1-Domingo, 2-Segunda,etc) e informe o número correspondente ao dia da semana: ");
    
    Scanner sc = new Scanner(System.in);
    int ds = sc.nextInt();
    sc.close();
    
    if (ds == 1){
        System.out.println("Domingo! ");
    } else if (ds == 2){
        System.out.println("Segunda! ");    
    } else if (ds == 3){
        System.out.println("Terça! ");    
    } else if (ds == 4){
        System.out.println("Quarta! ");     
    } else if (ds == 5){
        System.out.println("Quinta! ");    
    } else if (ds == 6){
        System.out.println("Sexta! ");
    } else if (ds == 7){
        System.out.println("Sábado! ");
    }else {
        System.out.println("Valor inválido");
    }

    }
 }
