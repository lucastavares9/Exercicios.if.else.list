import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
// As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
//Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
//salários até R$ 280,00 (incluindo) : aumento de 20%
//salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
//salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
//salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
//o salário antes do reajuste;
//o percentual de aumento aplicado;
//o valor do aumento;
//o novo salário, após o aumento.
     System.out.print("Informe o seu salário: ");
     Scanner sc = new Scanner(System.in);
     double salário = sc.nextDouble();
     System.out.println();
     
     if (salário<= 280){
        double antesreajuste = salário;
        System.out.println("O salário antes do reajuste: " + "R$" + (int)antesreajuste);
        double aumento = salário *0.20;
        System.out.println("O valor do aumento: " + "R$" + aumento);
        double percentualdeaumento = 20;
        System.out.println("O percentual de aumento aplicado: " + (int)percentualdeaumento + "%");
        double salárionovo = aumento + salário;
        System.out.println("O novo salário, após o aumento: " + "R$" + (int)salárionovo);
     }else if(salário >280&& salário<=700){
        double antesreajuste = salário;
        System.out.println("O salário antes do reajuste: " + "R$" + (int)antesreajuste);
        double aumento = salário *0.15;
        System.out.println("O valor do aumento: " + "R$" + (int)aumento);
        double percentualdeaumento = 15;
        System.out.println("O percentual de aumento aplicado: " + (int)percentualdeaumento + "%");
        double salárionovo = aumento + salário;
        System.out.println("O novo salário, após o aumento: " + "R$" + (int)salárionovo);
     } else if (salário >700 && salário<=1500){
        double antesreajuste = salário;
        System.out.println("O salário antes do reajuste: " + "R$"+ (int)antesreajuste);
        double aumento = salário *0.10;
        System.out.println("O valor do aumento: " + "R$" + aumento);
        double percentualdeaumento = 10;
        System.out.println("O percentual de aumento aplicado: " + (int)percentualdeaumento + "%");
        double salárionovo = aumento + salário;
        System.out.println("O novo salário, após o aumento: " + "R$" +(int)salárionovo);
     }else {
        double antesreajuste = salário;
        System.out.println("O salário antes do reajuste: " + "R$" + (int)antesreajuste);
        double aumento = salário *0.05;
        System.out.println("O valor do aumento: " + "R$" +(int)aumento);
        double percentualdeaumento = 5;
        System.out.println("O percentual de aumento aplicado: " + (int)percentualdeaumento + "%");
        double salárionovo = aumento + salário;
        System.out.println("O novo salário, após o aumento: " + "R$" +(int)salárionovo);
     }
       
      sc.close();


    }
}
