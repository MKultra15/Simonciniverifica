public class Spogliatoio {
    
    public void cambiati(String name){
        try{
            System.out.println(name + " è entrato nello spogliatoio");
            Thread.sleep((long)(Math.random() * 1000));
        }catch(Exception e){}

        System.out.println(name + " è uscito dallo spogliatoio");
    }
}
