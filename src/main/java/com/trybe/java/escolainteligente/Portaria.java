package com.trybe.java.escolainteligente;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Portaria {

  /**
   * Método emitirRelatorio.
   */
  public static void emitirRelatorio(int qtdFundamental1, int qtdFundamental2, int qtdMedio) {
    int total = qtdFundamental1 + qtdFundamental2 + qtdMedio;
    System.out.println("-----------------------------------------------------");
    System.out.println("RELATÓRIO");
    System.out.println("-----------------------------------------------------");
    System.out.println("Total de alunos: " + total);
    System.out.println("Total de alunos do fundamental I: " + qtdFundamental1);
    System.out.println("Total de alunos do fundamental II: " + qtdFundamental2);
    System.out.println("Total de alunos do ensino médio: " + qtdMedio);
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Entre com o número correspondente à opção desejada:");
    System.out.println("1 - Registrar o acesso de pessoa estudante");
    System.out.println("2 - Finalizar o acesso e emitir o relatório");

    int fund = 0;
    int fund2 = 0;
    int med = 0;


    int option = scanner.nextInt();
    while (option == 1) {
      System.out.println("Informe a idade da pessoa estudante:");
      int age = scanner.nextInt();

      if (age <= 10) {
        System.out.println("Pessoa estudante do Ensino Fundamental I, catraca liberada!");
        fund += 1;
      } else if (age <= 14) {
        System.out.println("Pessoa estudante do Ensino Fundamental II, catraca liberada!");
        fund2 += 1;
      } else {
        System.out.println("Pessoa estudante do Ensino Médio, catraca liberada!");
        med += 1;
      }

      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Registrar o acesso de pessoa estudante");
      System.out.println("2 - Finalizar o acesso e emitir o relatório");

      option = scanner.nextInt();
    }

    emitirRelatorio(fund, fund2, med);

  }
}