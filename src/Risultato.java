public class Risultato {

    String nomePilota;

    int Tempo = 0;

    int NumGiri = 15;

    public int getTempo(){
        return Tempo;
    }

    public String getNomePilota(){
        return nomePilota;
    }

    public Risultato(){

    }

    public void ContaGiri(String s){

        long inizio = System.nanoTime();

        for(int i = 0; i < NumGiri; i++){
            try{
            Thread.sleep((long)(Math.random() * 1000));
            }catch (Exception e){}
        }

        long fine = System.nanoTime();  
        Tempo =(int) ((fine-inizio)/1000000);
        nomePilota = s;
    }
}
