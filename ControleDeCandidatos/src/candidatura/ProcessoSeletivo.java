package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo{
    public static void main(String[] args) {
        //6º
        String [] candidatos =  {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }
        /* 
        //2º Chamando o método com valores(Teste)
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
        */
    }
    //8º
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
        do {
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			
		}while(continuarTentando && tentativasRealizadas < 3);
        
        if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NAO CONSEGUIMOS CONTATO COM " + candidato +", NUMERO MAXIMO DE " + tentativasRealizadas + " TENTATIVAS REALIZADAS");
    }

    //7º Criando um método auxiliar
    static boolean atender() {
		return new Random().nextInt(3)==1;
        //valor aleatório que indica que se a tentativa for igual a 1, o candidato atendeu a ligação
	}

    //5º
    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidado pelo índice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidado nº " + indice + "é" + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação (for each)");
        for(String candidato: candidatos){
            System.out.println("O candidado selecionado foi "+ candidato);
            //Na forma abreviada não tem o númedo do índice
        }
    }

    //3º Criando o método com os candidatos participantes de acordo com a pretensão salarial
    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0; //Quantos de candidatos selecionados
        int candidatosAtual = 0; //Índice do array
        double salarioBase = 2000.0;//Parâmetro que será utilizado para verificar se o salário do candidato é igual ou menor do que o salário Base
        
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
        //enquanto a quantidade for menor do que 5 e for menor do que a quantidade total de candidatos
        //buscar mais um candidato
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O Candidato " + candidato + ", solicitou este valor de salário R$" + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato" + candidato + "foi selecionado para a vaga!");
                candidatosSelecionados++;
            }
            candidatosAtual++; //Verifica o próximo candidato do índice
        }
    }
    //4º
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
        //Método para criar um valor randômico  entre dois valores
        //A cada interação, será gerado um valor aleatório entre esses dois valores
    }

    //1º Criando o primeiro método estático
    //Utilizado em vários contextos da aplicação
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        //Criando uma condição para selecionar o candidato dentro do salário proposto
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");

        }else if(salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");

        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}