public class Persona extends Thread{
    String nome;
    Spogliatoio spogliatoio;
    Semaforo semaforo;
    Pista pista;

    public Persona(String nome, Spogliatoio spogliatoio, Semaforo semaforo, Pista pista) {
        this.nome = nome;
        this.spogliatoio = spogliatoio;
        this.semaforo = semaforo;
        this.pista = pista;
    }

    public void run() {
        semaforo.P();
        spogliatoio.cambiati(nome);
        semaforo.V();

        pista.guida(nome);

        semaforo.P();
        spogliatoio.cambiati(nome);
        semaforo.V();
    }
    
}
