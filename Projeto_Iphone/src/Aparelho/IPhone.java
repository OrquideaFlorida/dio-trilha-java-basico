package Aparelho;

import java.util.Scanner;

import apps.AparelhoTelefonico;
import apps.NavegadorInternet;
import apps.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico , NavegadorInternet , ReprodutorMusical {

    Scanner scanner = new Scanner(System.in);
    String musica[] = {"Nirvana", "Alice in Chains", "Silvechair", "Soundgarden", "Metallica"};
    int musicaIndice = 0;

    public void ligar(String numero) {
        System.out.println("Para quem deseja ligar? ");
        numero = scanner.nextLine();
        System.out.println("Chamando " + numero + " ...");
    }
    public void atender() {
        System.out.println("Atendeu a ligação.");;
    }
    public void iniciarCorreioVoz() {
        System.out.println("Abrindo Correio de voz...");
    }

    public void exibirPagina(String url) {
        System.out.println("Qual pagina deseja abrir?: ");
        url = scanner.nextLine();
        System.out.println("Abrindo pagina " + url + " ...");
    }
    public void adicionarNovaAba() {
        System.out.println("Abrindo pagina em Nova Aba...");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }

    public void tocar() {
        System.out.println("Tocando Musica da lista...");
    }
    public void pausar() {
        System.out.println("Pausando Musica...");
    }
    public void selecionarMusica(String musicaEscolhida) {
        System.out.println("Lista de musicas: ");
        for(int i=1; i <= musica.length; i++ ){
            System.out.println(i + " - " + musica[i-1]);
        }

        while (musicaIndice == 0) {
            System.out.println("Escolha um numero da sua Lista de Musica: ");
            musicaIndice = scanner.nextInt();
        }
        musicaEscolhida = musica[musicaIndice-1];

        System.out.println("Tocando " + musicaEscolhida + " ...");
    }
    
    
}