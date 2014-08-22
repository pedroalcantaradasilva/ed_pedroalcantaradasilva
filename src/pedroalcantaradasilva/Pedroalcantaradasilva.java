/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pedroalcantaradasilva;


import java.util.Scanner;

public class Pedroalcantaradasilva {


class EstruturaAvancada  //Criamos aqui nossa classe EstruturaAvancada
   {
   private String[] a;                 // cria a referência do vetor
   private int nElems;               // nElems controla quantos elementos o vetor terá ...
   //-----------------------------------------------------------
   public EstruturaAvancada(int max)         // método construtor
      {
      a = new String[max];                 // cria o vetor ...
      nElems = 0;                        // inicialmente sem itens ...
      }
//--------------------------------------------------------------
//Método de busca ....
//--------------------------------------------------------------
   public boolean find(String searchKey)
      {                              // metodo buscará o valor que a classe usuaria pedir ...
      int j;
      boolean achou=false;
      for(j=0; j<nElems; j++)            // varrerá o vetor buscando ...
         if(a[j].charAt(0) == searchKey.charAt(0)) {          // entrou o item?
            System.out.println("Encontrei o nome: " + a[j]);  
            achou=true;
      }
        return achou;
      }  // fim da busca
//--------------------------------------------------------------
//Método de inserção ....
//--------------------------------------------------------------
   public void insert(String value)    // insere um elemento no vetor
      {
      a[nElems] = value;             // insere nessa posição ...
      nElems++;                      // incrementa o tamanho
      }
//--------------------------------------------------------------
//Método de remoção ....
//--------------------------------------------------------------
   public boolean delete(String value)
      {
      int j;
      for(j=0; j<nElems; j++)        // varre o vetor 
         if( value == a[j] )
            break;
      if(j==nElems)                  // se não encontrar retorna falso
         return false;
      else                           // se encontrar ...
         {
         for(int k=j; k<nElems; k++) // move os mais altos para "frente"
            a[k] = a[k+1];
         nElems--;                   // decrementa o contador de elementos
         return true;
         }
      }  // final do método de remoção
//--------------------------------------------------------------
//Método de visualização ....
//--------------------------------------------------------------
   public void display()             // mostra o conteúdo do vetor
      {
      for(int j=0; j<nElems; j++)      
         System.out.print(a[j] + " ");  
      System.out.println("");
      }
   //-----------------------------------------------------------
   }  // aqui termina a classe EstruturaAvancada

class VetorAvancadoApp
   {
   public static void main(String[] args)
      {
      Scanner entrada = new Scanner (System.in); //Instancio o objeto entrada do tipo Scanner
      int maxSize = 5;            // coloca em uma constante o tamanho do vetor
      EstruturaAvancada arr = new EstruturaAvancada(maxSize); // // cria referencia para a estrutura de dados e instancia a estrutura de dados
      
      System.out.println("Bem Vindo ao Programa de Vetores!!!");
      
      for (maxSize = 0; maxSize < 5; maxSize++)
      {
        System.out.println("Digite o " + (maxSize+1) + "o nome: ");
        arr.insert(entrada.nextLine());               // insere os itens
      }
      System.out.println("");
      System.out.print("#Vetor:= ");
      arr.display();                // mostra os itens do Vetor
      System.out.println("");
      System.out.println("Muito Bem! Agora que você cadastrou os nomes, digite uma letra");
      
      //--------------------------------------------------------------
      //Método de busca ....
     //--------------------------------------------------------------
      String searchKey = entrada.nextLine();           //configura para busca
      
      if (!arr.find(searchKey))
        System.out.println("Não encontrei nenhum nome iniciado com a letra:= " + searchKey);
      }  // fim do método main()
   }  //fim da classe VetorAvancadoApp
