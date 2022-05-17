public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inizio");

        Semaforo semaforo = new Semaforo(2);

        Pista pista = new Pista();

        Spogliatoio spogliatoio = new Spogliatoio();

        Persona p1 = new Persona("Andrea", spogliatoio, semaforo, pista);
        Persona p2 = new Persona("Lorenzo", spogliatoio, semaforo, pista);
        Persona p3 = new Persona("Davide", spogliatoio, semaforo, pista);
        Persona p4 = new Persona("Mario", spogliatoio, semaforo, pista);
        Persona p5 = new Persona("Sudhir", spogliatoio, semaforo, pista);
        Persona p6 = new Persona("Mirko", spogliatoio, semaforo, pista);
        Persona p7 = new Persona("Livia", spogliatoio, semaforo, pista);
        Persona p8 = new Persona("Alessandro", spogliatoio, semaforo, pista);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();

        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
        p7.join();
        p8.join();

        pista.classifica();
    }
}
