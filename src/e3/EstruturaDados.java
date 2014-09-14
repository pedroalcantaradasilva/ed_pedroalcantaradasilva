/*Utilizando os conceitos aprendidos até agora, desenvolva um software em que seja possível 
Joaquim cadastrar seus animais e depois fazer uma busca (binária) tanto por Cor quanto por 
Tamanho de seus animais. */

package e3;

/**
 *
 * Pedro Alcantara
 */
public class EstruturaDados {
    private Animal[] vetorAnimal;
    private int nElements;

    public EstruturaDados(int quantidade) {
        vetorAnimal = new Animal[quantidade];
        nElements = 0;
    }
    
    public void insert(String cor, double tamanho){
        int j;
        for (j = 0; j < nElements; j++) // localiza onde esse elemento se encaixa
        {
            if (vetorAnimal[j].getCor().compareTo(cor) >= 0) {
                break;
            }
        }
        for (int k = nElements; k > j; k--) // move os elementos maiores uma posição p/ frente
        {
            vetorAnimal[k] = vetorAnimal[k - 1];
        }
        Animal animal = new Animal(cor, tamanho);
        vetorAnimal[j] = animal;
        nElements++;
    }
    
    public int size() {
        return nElements;
    }
    
    public int findCor(String cor) {
        int lowerBound = 0;
        int upperBound = nElements - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (vetorAnimal[curIn].getCor().equals(cor)) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return nElements;
            } else {
                if (vetorAnimal[curIn].getCor().compareTo(cor) < 0) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }
    
    public void insertionSort()
      {
      int in, out;

      for(out=1; out<nElements; out++)     // vamos rodar até o final do vetor
         {
         double temp = vetorAnimal[out].getTamanho();            // jogamos em uma variável temporária o item marcado
         in = out;                      // inicializamos a variavel in, que ira receber o valor a esquerda
         while(in>0 && vetorAnimal[in-1].getTamanho() >= temp) // enquanto o item a esquerda for maior que o marcado ...
            {
            vetorAnimal[in] = vetorAnimal[in-1];            // ...nós fazemos eles pularem uma casa a direita
            --in;                       
            }                           // ... quando o item for menor, ele nao pula!
         vetorAnimal[in] = vetorAnimal[out];                  // ...inserimos o valor marcado na posição que ficou "livre", ou seja,
                                        // onde estava o último item a esquerda maior que o marcado
         }  // end for
      }
    
    public int findTamanho(double tamanho) {
        int lowerBound = 0;
        int upperBound = nElements - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (vetorAnimal[curIn].getTamanho() == tamanho) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return nElements;
            } else {
                if (vetorAnimal[curIn].getTamanho() < tamanho) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }
    
    public String imrpimirTodos(){
        String resultado = "";
        for (int i = 0; i < nElements; i++) {
            resultado = resultado + vetorAnimal[i].display()+"\n";
        }
        return resultado;
    }
    
    public String imprimiUm(int posicao){
        return vetorAnimal[posicao].display();
    }
}
