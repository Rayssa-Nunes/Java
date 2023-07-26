import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira o nome dos Jogadores.");
    System.out.print("Jogador 1: ");
    String nomeJogador1 = sc.next();
    System.out.print("Jogador 2: ");
    String nomeJogador2 = sc.next();

    Jogador jogador1 = new Jogador(nomeJogador1);
    Jogador jogador2 = new Jogador(nomeJogador2);

    jogador1.iniciarJogo();
    jogador2.iniciarJogo();
    jogador1.atirar(jogador2);
  }
}