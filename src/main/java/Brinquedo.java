public class Brinquedo {
    String nome;
    String cor;

    public Brinquedo(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public void mudarCor(String novaCor) {
        this.cor = novaCor;
    }


    public String toString() {
        return "Eu sou o brinquedo " + nome + " de cor " + cor;
    }
}

