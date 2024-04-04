/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio1010;

import java.util.Scanner;

/**
 *
 * @author joao
 */
public class Exercicio1010 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id,qtd;
        double valor, peca1, peca2;
        String entrada;
        entrada = input.nextLine();
        String[] itens = entrada.split(" ");
        id = Integer.parseInt(itens[0]);
        qtd = Integer.parseInt(itens[1]);
        valor = Double.parseDouble(itens[2]);
        peca1 = qtd*valor;
        entrada = input.nextLine();
        itens = entrada.split(" ");
        id = Integer.parseInt(itens[0]);
        qtd = Integer.parseInt(itens[1]);
        valor = Double.parseDouble(itens[2]);
        peca2 = qtd*valor;
        System.out.printf("VALOR A PAGAR: R$ %2.2f\n", peca1+peca2);
    }
}
