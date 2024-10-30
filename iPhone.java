import Internet.NavegadorWeb;
import Musica.ReprodutorMusical;
import Telefonia.AparelhoTelefonico;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorWeb {

  // Implementação dos métodos de ReprodutorMusical
  public void tocar() {
    System.out.println("Reproduzindo música...");
  }
  public void pausar() {
    System.out.println("Pausando música...");
  }
  public void selecionarMusica(String musica) {
    System.out.println("Selecionando a música: " + musica);
  }

  // Implementação dos métodos de AparelhoTelefonico
  public void ligar(String numero) {
    System.out.println("Ligando para " + numero + "...");
  }
  public void atender() {
    System.out.println("Atendendo chamada...");
  }
  @Override
  public void correioVoz() {
    System.out.println("Iniciando correio de voz...");
  }

  // Implementação dos métodos de NavegadorInternet
  public void exibirPagina(String url) {
    System.out.println("Exibindo página: " + url);
  }
  public void adicionarNovaAba() {
    System.out.println("Abrindo uma nova aba...");
  }
  public void atualizarPagina() {
    System.out.println("Atualizando página...");
  }
}
