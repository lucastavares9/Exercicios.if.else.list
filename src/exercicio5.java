import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        //Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite uma letra: ");
        String l = sc.next();
        sc.close();
        
        if (l.equals("a")||l.equals("e")||l.equals("i")||l.equals("o")||l.equals("u")){
            System.out.println("A letra inserida vogal");
        } else{
            System.out.println("A letra inserida é uma consoante");
        }
    }
}
