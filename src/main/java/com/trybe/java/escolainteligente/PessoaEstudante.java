package com.trybe.java.escolainteligente;

import java.util.Scanner;

public class PessoaEstudante {

  /**
   * Método calcularIdadeEmDias.
   */
  public static int calcularIdadeEmDias(int anos, int meses, int dias) {
    int anosEmDias = 365 * anos;
    int mesesEmDias = 30 * meses;
    return anosEmDias + mesesEmDias + dias;
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner scanner = new Scanner(System.in);
    System.out.println(" Qual o nome da Pessoa Estudante?");
    String nome = scanner.next();
    System.out.println("Qual a sua idade em anos, meses e dias?");
    System.out.println("anos:");
    String anos = scanner.next();
    System.out.println("meses:");
    String meses = scanner.next();
    System.out.println("dias:");
    String dias = scanner.next();
    
    int anosInt = Integer.parseInt(anos);
    int mesesInt = Integer.parseInt(meses);
    int diasInt = Integer.parseInt(dias);
    
    int idadeEmDias = calcularIdadeEmDias(anosInt, mesesInt, diasInt);

    System.out.println("A idade de " + nome + " em dias é " + idadeEmDias);

    scanner.close();
  }
}