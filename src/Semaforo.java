public class Semaforo {
    
    int valore;

    public Semaforo(int v){
        valore = v;
    }

    public synchronized void Occupa(){
        while(valore == 0){
            try{
                wait();
            } catch (Exception e){}
        }
        valore--;
    }

    public synchronized void Libera(){
        notify();
        valore++;
    }

}
