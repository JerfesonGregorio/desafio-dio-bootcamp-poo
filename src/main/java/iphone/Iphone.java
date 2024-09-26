package iphone;

import iphone.components.AparelhoTelefonico;
import iphone.components.Navegador;
import iphone.components.ReprodutorMusical;

public class Iphone implements Navegador, AparelhoTelefonico, ReprodutorMusical {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página da url " + url);
    }

    @Override
    public void exibirNovaAba() {
        System.out.println("Exibindo nova página...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música " + musica);
    }
}
