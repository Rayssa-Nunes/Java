import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Jogador {
  public String nome;
  private char[][] meuJogo = new char[8][8];
  private char[][] jogoDoAdversario = new char[8][8];
  Scanner sc;// = new Scanner(System.in);
  private int submarino = 3;
  private int cruzador = 2;
  private int portaAviao = 1;
  private int qtdeArmas = 6;
  private int colunasAtingidas = 14;

  public Jogador(String nome) {
    this.nome = nome;
  }

  public void iniciarJogo() {
    instrucao();
    System.out.println("=====================================");
    System.out.println("            BATALHA NAVAL ");
    System.out.println("=====================================");
    inicializarTabuleiro(meuJogo);
    inicializarTabuleiro(jogoDoAdversario);
    imprimirTabuleiro(meuJogo);
    System.out.println(this.nome + " insira as suas armas.");
    definirArma();
    
  }
  public void instrucao() {
    System.out.println("================ INSTRUÇÕES ================");
    System.out.println("Você pode colocar 6 armas nas posições que escolher.");
    System.out.println("ARMAS        SÍMBOLO      QUANTIDADE");
    System.out.println("Submarino       s              3");
    System.out.println("Cruzador        c              2");
    System.out.println("Porta-aviões    p              1");
    System.out.println("Depois de adicionar todas as armas, você irá tentar acertar as armas do seu adversário.");
    System.out.println("Quem acertar as 6 armas primeiro, ganha o jogo.");
    System.out.println("============================================");
    System.out.println("OBS: As linhas são definidas em ordem alfabética de A à H e as colunas em ordem crescente de 0 à 7.");
    System.out.println("As armas são definidas pelo símbolo.");
    System.out.println("============================================");
    System.out.println();
}


  public void inicializarTabuleiro(char[][] jogo) {
    for (int i=0; i<jogo.length; i++) {
      for (int j=0; j<jogo.length; j++) {
        jogo[i][j] = ' ';
      }
    }
  }
  public void imprimirTabuleiro(char[][] jogo) {
    System.out.println();
    System.out.println("    0   1   2   3   4   5   6   7");
    char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
    for (int i=0; i<jogo.length; i++) {
      System.out.print(letras[i] + "   ");
      for (int j=0; j<jogo.length; j++) {
        System.out.print(jogo[i][j]);
        if (j<(jogo.length)-1) System.out.print(" | ");
      }
      System.out.println();
      if (i<(jogo.length)-1) System.out.println("   -------------------------------");
    }
    System.out.println();
  }

  public void definirArma() {
    
    sc = new Scanner(System.in);
    System.out.print("Arma: ");
    char arma = Character.toLowerCase(sc.nextLine().charAt(0));
    boolean armaValida = verificaArma(arma);

    if (armaValida) {
      definirPosicao(arma);
    } else {
      System.out.println("Insira outra arma, essa não é válida.");
      definirArma();
    }
    
  }

  public boolean verificaArma(char arma) {
    if ((arma=='s' && submarino>0) || (arma =='c' && cruzador>0) || (arma=='p' && portaAviao>0)) {
      return true;
    } else {
      return false;
    }
  }

  public void definirPosicao(char arma) {
    sc = new Scanner(System.in);
    System.out.print("Posição (exemplo C3): ");
    String posicao = sc.next();
    char[] caracteres = posicao.toCharArray();
    char linha = Character.toLowerCase(caracteres[0]);
    int coluna = (int) caracteres[1] - '0';

    char[] linhas = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

    int indice = -1; // inicializar com um valor inválido
    for (int j = 0; j < linhas.length; j++) {
      if (linhas[j] == linha) {
          indice = j;
          break; // sair do loop assim que o elemento é encontrado
      }
    }
    if (indice != -1 && (coluna >=0 && coluna <=7)) {
      boolean verificado = verificaPosicao(indice, coluna, arma);
      if (verificado) {
        System.out.println("Arma inserida com sucesso!");
        System.out.println("=====================================");
        qtdeArmas--;
        decrementarArma(arma);
      } else {
        System.out.println("Esta posição não pode ser usada.");
        System.out.println("Por favor, insira outra posição para sua arma.");
        definirPosicao(arma);
      }
    } else {
      System.out.println("Insira uma posição válida!");
      definirPosicao(arma);
    }
    if (qtdeArmas>0) definirArma();
  }

  public boolean verificaPosicao(int linha, int coluna, char arma) {
    int qtdeColunas = 0;
    int calculaColunas = (meuJogo.length-1) - coluna;
    if (arma=='s') {
      qtdeColunas = 2;
    } else if (arma=='c') {
      qtdeColunas = 1;
    } else {
      qtdeColunas = 0;
    }
    List<Integer> vazio;
    if (qtdeColunas==calculaColunas) {
      vazio = verificaVazio(linha, coluna, qtdeColunas);
    } else if (qtdeColunas<calculaColunas) {
      vazio = verificaVazio(linha, coluna, qtdeColunas+1);
    } else {
      vazio = verificaVazio(linha, coluna, -(qtdeColunas+1));
    }

    if (vazio.size()>0) {
      if (vazio.size()==(qtdeColunas+2)) {
        int ultimoIndice = vazio.size()-1;
        vazio.remove(ultimoIndice);
      }
      inserirArma(arma, vazio, linha);
      return true;
    }
    else {
      return false;
    }
  }

  public List<Integer> verificaVazio(int linha, int coluna, int qtdeColunas) {
    List<Integer> listaColunas = new ArrayList<>();
    int positivo = qtdeColunas;
    if (qtdeColunas<0) {
      positivo = qtdeColunas * (-1);
    }
    for (int i=0; i<positivo+1; i++) {
      if (qtdeColunas>0) {
        if (coluna==0) {
          if (meuJogo[linha][coluna+i]==' ') {
            listaColunas.add(coluna+i);
          } else {
            listaColunas.clear();
          }
        } else if (coluna>0) {
          if (meuJogo[linha][coluna+i]==' ' && meuJogo[linha][coluna-1]==' ') {
            listaColunas.add(coluna+i);
          } else {
            listaColunas.clear();
          }
        }
      } else {
        if (coluna==7) {
          if (meuJogo[linha][coluna-i]==' ') {
            listaColunas.add(coluna-i);
          } else {
            listaColunas.clear();
          }
        } else if (coluna<7) {
          if (meuJogo[linha][coluna-i]==' ' && meuJogo[linha][coluna+1]==' ') {
            listaColunas.add(coluna-i);
          } else {
            listaColunas.clear();
          }
        }
      }
    } 
    return listaColunas;
  }

  public void inserirArma(char arma, List<Integer> colunasVerificadas, int linha) {
    for (int i=0; i<colunasVerificadas.size(); i++) {
      meuJogo[linha][colunasVerificadas.get(i)] = arma;
    }
    System.out.println("============== MEU JOGO ==============");
    imprimirTabuleiro(meuJogo);
  }

  public void atirar(Jogador adversario) {
    System.out.println();
    System.out.println("Agora você deve tentar atingir as armas de seu adversário.");
    Jogador jogador1, jogador2;
    int contador = 0;
    int rodada = 1;
    while (this.colunasAtingidas > 0 && adversario.colunasAtingidas > 0) {
      if (contador < 2) {
          jogador1 = adversario;
          jogador2 = this;
      } else {
          jogador1 = this;
          jogador2 = adversario;
      } 
      System.out.println("=======================================");
      System.out.println("Rodada " + rodada);
      System.out.println( "Vez Jogador(a): " + jogador1.nome);
      jogador2.inserirTiro(jogador1);
      
      contador++;
      if (contador==4) {
          contador = 0;
          rodada++;
      }
    }
    
    if (adversario.colunasAtingidas == 0) {
      System.out.println("=======================================");
      System.out.println();
       System.out.println("********** " + adversario.nome + " venceu o jogo! **********");
       System.out.println();
   } else {
    System.out.println("=======================================");
    System.out.println();
    System.out.println("********** " + this.nome + " venceu o jogo! **********");
    System.out.println();
   }
    System.out.println("=========== JOGO DO ADVERSÁRIO ===========");
    imprimirTabuleiro(this.jogoDoAdversario);
  }

  public void inserirTiro(Jogador adversario) {
    sc = new Scanner(System.in);
    System.out.print("Posição (exemplo C3): ");
    String posicao = sc.next();
    char[] caracteres = posicao.toCharArray();
    char linha = Character.toLowerCase(caracteres[0]);
    int coluna = (int) caracteres[1] - '0';

    char[] linhas = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

    int indice = -1; // inicializar com um valor inválido

    for (int j = 0; j < linhas.length; j++) {
        if (linhas[j] == linha) {
            indice = j;
            break; // sair do loop assim que o elemento é encontrado
        }
    }
   
    if (indice != -1 && (coluna >=0 && coluna <=7)) {
      boolean jogoVerificado = verificarJogoDoAdversario(indice, coluna);
      if (jogoVerificado) {
        boolean acertou = verificarSeAcertou(indice, coluna);
        if (acertou) {
          System.out.println("Você atingiu um navio.");
          adversario.atingiuArma();
        } else {
          System.out.println("Você atingiu a água.");
      }
      } else {
        System.out.println("Essa coluna já foi verificada.");
        System.out.println("Insira outra posição de tiro.");
        inserirTiro(adversario);
      }
    } else {
        System.out.println("Insira uma posição válida!");
        inserirTiro(adversario);
    }

    System.out.println();
    System.out.println("=========== JOGO DO ADVERSÁRIO ===========");
    imprimirTabuleiro(this.jogoDoAdversario);
    
}

public boolean verificarJogoDoAdversario(int linha, int coluna) {
  if (jogoDoAdversario[linha][coluna] == ' ') {
    return true;
  } else {
    return false;
  }
}

public boolean verificarSeAcertou(int linha, int coluna) {
  if (meuJogo[linha][coluna] == 's' || meuJogo[linha][coluna] == 'c' || meuJogo[linha][coluna] == 'p') {
      jogoDoAdversario[linha][coluna] = 'O';
      return true;
  } else {
      jogoDoAdversario[linha][coluna] = 'X';
      return false;
  }
  
}
public int atingiuArma() {
    return colunasAtingidas--;
}
  public void decrementarArma(char arma) {
    if (arma=='s') {
      submarino--;
    } else if (arma=='c') {
      cruzador--;
    } else {
      portaAviao--;
    }
  }
  
}