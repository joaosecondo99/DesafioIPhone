package Telefonia;

import java.util.Scanner;

public interface AparelhoTelefonico {
  Scanner userInput = new Scanner(System.in);
  String telefone = userInput.next();

  public void ligar(String telefone);
  public void atender();
  public void correioVoz();
}
