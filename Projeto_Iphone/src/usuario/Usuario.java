package usuario;

import Aparelho.IPhone;

public class Usuario {

    public static void main(String[] args) {
        
        IPhone iPhone = new IPhone();

        //System.out.println("funções Aparelho telefone:");
        //System.out.println("");
        iPhone.atender();
        iPhone.ligar(null);
        iPhone.iniciarCorreioVoz();

        //System.out.println("");
        //System.out.println("Funções Navegador Internet");
        //System.out.println("");
        iPhone.exibirPagina(null);
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();

        //System.out.println("");
        //System.out.println("Funções Reprodutor Musical");
        //System.out.println("");
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica(null);
    }
    
}
