public class ControleFluxo {
    public static void main(String[] args) throws Exception{
    // Estrutura Condicionais: if-else-else if, switch-case       
        double saldo = 25.0;
        double valorSolicitado = 15.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;  
            System.out.println("Novo saldo: R$ " + saldo);                 
        } else
            System.out.println("Saldo insuficiente"); 

           
        int nota = 6;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

        
        String sigla = "M";
        switch (sigla) {
            case "P":
                System.out.println("PEQUENO");
                break;
            case "M":
                System.out.println("MEDIO");
                break;
            case "G":
                System.out.println("GRANDE");
                break;
            default:
                System.out.println("INDEFINIDO");
        }

    // Estrutura de Repetição: for, while, do-while
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos ++){
            System.out.println("Contando carneirinhos " + carneirinhos);
        }

        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
        for(String aluno : alunos) {
	        System.out.println("Nome do aluno é: " + aluno);
        }

        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break; // continue           
            System.out.println(numero);            
        }

    // Estrutura de exceções: try-catch-finally, throw
    }
}
