/* Joaquim é Paleontólogo e precisa de um software que armazene informações sobre os 
animais que ele encontra em suas expedições. 
As informações que ele precisa armazenar são:
Cor e Tamanho  */

package e3;

/**
 *
 * Pedro Alcantara
 */
public class Animal {
    private String cor;
    private double tamanho;   

    public Animal(String cor, double tamanho) {
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public double getTamanho() {
        return tamanho;
    }
    
    public String display(){
        return "Cor: "+ cor +" Tamanho: "+ tamanho;
    }
}
