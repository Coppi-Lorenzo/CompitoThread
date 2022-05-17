public class Persona extends Thread{
     
    String nome;
    Spogliatoio sp;
    Semaforo s;

    Risultato c;
    
    public Persona(String n, Spogliatoio spog, Semaforo semaforo1){
        nome = n;
        sp = spog;
        s = semaforo1;
    }

    public void run(){
        s.Occupa();
        sp.entra(nome);
        s.Libera();

        

        s.Occupa();
        sp.entra(nome);
        s.Libera();

        c.ContaGiri(nome);
    }

    
}
