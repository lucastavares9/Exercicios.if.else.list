import java.util.Scanner;
public class exercicio15 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    System.out.print("Informe o seu plano(1 para Prata e 2 para Gold): ");
    int plano = sc.nextInt();
    System.out.print("Quantida de chamadas locais: ");
    double minLocais = sc.nextDouble();
    System.out.print("Quantidade de minutos interurbanos: ");
    double minInter = sc.nextDouble();
    System.out.print("Quantidade de mensagens de texto: ");
    int mensagens = sc.nextInt(); 
    double tarifaplano, valorLocal, valorinter,valorMenssagem, valorplano;
    sc.close();
    System.out.println();
    System.out.println("DADOS DO PLANO");
    
    if(plano == 1){
        tarifaplano = 40;
        valorLocal = 0.15 * minLocais;
        valorinter = 1.50 * minInter;
        valorMenssagem = 0.10 *mensagens;
        valorplano = tarifaplano + valorLocal + valorinter + valorMenssagem;

    } else {
        tarifaplano = 80;
        valorLocal = 0;
        valorinter = 0.90 * minInter;
        valorMenssagem = 0.10 * mensagens;
        valorplano = tarifaplano + valorinter + valorMenssagem;
    }
    
    System.out.println("Valor da tarifa fixa:R$ " + tarifaplano);
    System.out.println("Valor dos minutos locais:R$ " + valorLocal);
    System.out.println("Valor minutos Interurbanos:R$ " + valorinter);
    System.out.println("Valor total das menssagens:R$ " + valorMenssagem);
    System.out.println("Valor total do plano:R$ " + valorplano);

         
    }
}
