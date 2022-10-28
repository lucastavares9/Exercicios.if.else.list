public class montanharevisao{
    public static void main(String[] args) {
     


        //Fazer duas entradas, altura e peso 
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com a altura: ");
        double Altura = sc.nextDouble();
        System.out.print("Entre com a peso: ");
        double peso = sc.nextDouble();
        

        sc.close();

        double imc = peso/ Math.pow(Altura, 2);
        String diagnostico = resultadoIMC(imc);
       System.out.println("Altura: " + Altura);
       System.out.println("Peso: " + peso);
       System.out.println("IMC: " + imc);
       System.out.println("Diagnóstico: " + diagnostico);
    

    }

    public static String  resultadoIMC(Double imc){
        String retorno = "";
     if (imc < 18.5) {
        retorno ="MAGREZA";
     } else 
     if ((imc >= 18.5)&&(imc < 25)){
        retorno = "NORMAL";
     } else 
     if ((imc >= 25) && (imc < 30)) {
        retorno = "SOBREPESO";
     } else 
     if ((imc >= 30)&& (imc < 40) ){
        retorno = "OBESIDADE";
     } else {
        retorno = "OBESIDADE GRAVE";
     }


        return retorno; 
    }
}

    
