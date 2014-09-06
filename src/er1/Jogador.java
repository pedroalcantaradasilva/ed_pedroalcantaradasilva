/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package er1;

/**
 *
 * @author Aluno
 */
public class Jogador {
  private String nome;
  private int idade;
  private double altura;
//--------------------------------------------------------------
public Jogador(String n, int id, double altura)
      {                               // comentario aqui
      nome = n;
      idade = id;
      altura = altura;
      }
//--------------------------------------------------------------
   public void displayPessoa()
      {
      System.out.print("   Nome: " + nome);
      System.out.println(", Idade: " + idade);
      System.out.println(", Altura: " + altura);
      
      }
//--------------------------------------------------------------
   public String getNome()           // comentario aqui
      { return nome; }
  
   public int getIdade() {
        return idade;
    }
   public double getAltura() {
        return altura;
    }

    public String displayJogador() {
        return "\nNome: " + nome + "  Idade: " + idade + "  Altura: " + altura;
    }

   }  // Final da Classe Jogador

