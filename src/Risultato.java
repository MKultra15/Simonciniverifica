public class Risultato implements Comparable{
    int tempo;
    String nome;

    public Risultato(int tempo, String nome) {
        this.tempo = tempo;
        this.nome = nome;
    }

    @Override
    public int compareTo(Object o) {
        return (this.tempo - ((Risultato)o).tempo);
    }

    @Override
    public String toString() {
        return "Risultato: nome = " + nome + ", tempo = " + tempo;
    }

    
}