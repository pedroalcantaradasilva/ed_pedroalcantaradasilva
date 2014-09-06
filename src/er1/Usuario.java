/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package er1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Usuario {
    
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Estrutura estrutura = new Estrutura(100);
        estrutura.insert("Neymar", 22, 1.90);
        estrutura.insert("Oscar", 56, 2.05);
        estrutura.insert("Pedro" , 39, 1.70);
        estrutura.insert("Paulo" , 35, 1.69);
        
        System.out.println(estrutura.display());
        System.out.println("\nDigite a idade do jogador: ");
        int idade = Integer.parseInt(scanner.nextLine());
        int posicao = estrutura.find(idade);
        if (posicao == estrutura.numero()) {
            System.out.println("Nenhum jogador foi encontrado com essa idade!");
        } else {
            System.out.println(estrutura.displayUnico(posicao));
        }
        System.out.println("Digite o nome do jogador: ");
        String nome = scanner.nextLine();
        posicao = estrutura.findLinear(nome);
        if (posicao == -1) {
            System.out.println("Nome não encontrado!");
        } else {
            System.out.println(estrutura.displayUnico(estrutura.findLinear(nome)));
        }
        }
}
       

