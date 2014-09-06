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
public class Estrutura {
    private Jogador[] jogadores;
    private int nElms;

    public Estrutura(int quant) {
        jogadores = new Jogador[quant];
        nElms = 0;
    }

    public void insert(String nome, int idade, double altura) {
        Jogador jogador = new Jogador(nome, idade, altura);
        int j;
        if (nElms != 0) {
            for (j = 0; j < nElms; j++) // localiza onde esse elemento se encaixa
            {
                if (jogadores[j].getIdade() > idade) {
                    break;
                }
            }
            for (int k = nElms; k > j; k--) // move os elementos maiores uma posição p/ frente
            {
                jogadores[k] = jogadores[k - 1];
            }
            jogadores[j] = jogador;
        } else {
            jogadores[0] = jogador;
        }
        nElms++;
    }

    public boolean delete(String nome) {                              // comentario aqui
        int result = findLinear(nome);
        if (result == nElms) {
            return false;
        } else {
            for (int k = result; k < nElms; k++) {
                jogadores[k] = jogadores[k + 1];
            }
            nElms--;
            return true;
        }
    }

    public int find(int idade) {
        int lowerBound = 0;
        int upperBound = nElms - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (jogadores[curIn].getIdade() == idade) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return nElms;
            } else {
                if (jogadores[curIn].getIdade() < idade) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public int findLinear(String nome) {
        int posicao = -1;
        for (int i = 0; i < nElms; i++) {
            if (jogadores[i].getNome().equals(nome)) {
                posicao = i;
            }
        }
        return posicao;
    }

    public String display() {
        String resultado = "";
        for (int i = 0; i < nElms; i++) {
            resultado = resultado + displayUnico(i);
        }
        return resultado;
    }

    public String displayUnico(int index) {
        return jogadores[index].displayJogador();
    }

    public int numero() {
        return nElms;
    }
}
