package com.trybe.java.escolainteligente;

import java.util.Scanner;

public class Secretaria {

  /**
   * Método calcularMedia.
   */
  public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
    double v = (nota1 + nota2 + nota3 + nota4) / 4.0;
    return v;
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner scanner = new Scanner(System.in);
    System.out.println(" Qual o nome da Pessoa Estudante?");
    String nome = scanner.next();
    System.out.println("Entre com as notas das provas");
    System.out.println("Avaliação 1:");
    String av1 = scanner.next();
    System.out.println("Avaliação 2:");
    String av2 = scanner.next();
    System.out.println("Avaliação 3:");
    String av3 = scanner.next();
    System.out.println("Avaliação 4:");
    String av4 = scanner.next();

    double av1Int = Double.parseDouble(av1);
    double av2Int = Double.parseDouble(av2);
    double av3Int = Double.parseDouble(av3);
    double av4Int = Double.parseDouble(av4);


    double media = calcularMedia(av1Int, av2Int, av3Int, av4Int);

    System.out.println("A média das notas de " + nome + " é " + media);

    scanner.close();
  }
}
