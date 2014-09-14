/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Usuario {
    Scanner scanner = new Scanner(System.in);
        final int quantidade = 100;
        EstruturaDados estruturaDados = new EstruturaDados(quantidade);
        
        String cor = scanner.nextLine();
        int resultado = estruturaDados.findCor(cor);
        if (resultado == estruturaDados.size()) {
            System.out.println("Resultado não encontrado");
        }else{
            System.out.println(estruturaDados.imprimiUm(resultado));
        }
        estruturaDados.insertionSort();
        System.out.println("Digite um tamanho para pesquisar");
        double tamanho = Double.parseDouble(scanner.nextLine());
        resultado = estruturaDados.findTamanho(tamanho);
        if (resultado == estruturaDados.size()) {
            System.out.println("Resultado não encontrado");
        }else{
            System.out.println(estruturaDados.imprimiUm(resultado));
        }
    }

