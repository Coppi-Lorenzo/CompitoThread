public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inizio conteggio");

        Classifica classifica = new Classifica();

        Spogliatoio spogliatoio = new Spogliatoio();


        Semaforo sem1 = new Semaforo(2);

        Persona persona1 = new Persona("Mario", spogliatoio, sem1);
        Persona persona2 = new Persona("Pietro", spogliatoio, sem1);
        Persona persona3 = new Persona("Marco", spogliatoio, sem1);
        Persona persona4 = new Persona("Filippo", spogliatoio, sem1);
        Persona persona5 = new Persona("Giuseppe", spogliatoio, sem1);
        Persona persona6 = new Persona("Franco", spogliatoio, sem1);
        Persona persona7 = new Persona("Gianni", spogliatoio, sem1);
        Persona persona8 = new Persona("Lorenzo", spogliatoio, sem1);

        persona1.start();
        persona2.start();
        persona3.start();
        persona4.start();
        persona5.start();
        persona6.start();
        persona7.start();
        persona8.start();

        persona1.join();
        persona2.join();
        persona3.join();
        persona4.join();
        persona5.join();
        persona6.join();
        persona7.join();
        persona8.join();

        classifica.Migliore();

        System.out.println("Termine conteggio");
    }
}
