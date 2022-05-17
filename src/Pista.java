import java.util.ArrayList;

public class Pista{
long inizio;
long fine;
int tempo;
ArrayList lista = new ArrayList();

    public void guida(String name){
        try{
            System.out.println(name + " è salito sul kart");
            long inizio = System.nanoTime();

            for(int i = 0; i < 15; i++){
                Thread.sleep((long)(Math.random() * 1000));
            }

        }catch(Exception e){}

        long fine = System.nanoTime();
        System.out.println(name + " ha finito la guida");

        tempo = (int) ((fine - inizio) / 1000000);
        Risultato risultato = new Risultato(tempo, name);
        for(int i = 0; i < lista.size(); i++){
            if(risultato.compareTo(lista.get(i)) < 0){
                System.out.println("risultato inserito");
                lista.add(risultato);
            }
        }
        lista.add(risultato);
    }

    public void classifica(){
        System.out.println("Classifica:");
        int j = 1;
        for(int i = 0; i < lista.size(); i++){
            System.out.println("Posto " + j +": " + lista.get(i).toString());
            j++;
        }
    }
}
