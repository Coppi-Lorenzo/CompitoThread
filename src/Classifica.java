import java.util.ArrayList;

public class Classifica {
    
    ArrayList <Risultato> classifica = new ArrayList();

    public Classifica(){

    }

    public void Aggiungi(Risultato r){
        classifica.add(r);
    }

    public String Migliore(){

        int primo = 0;
        String pilota = "";

        for(int i = 0; i < classifica.size(); i++){
            if(classifica.get(i).getTempo() > primo){
                primo = classifica.get(i).getTempo();
                pilota = classifica.get(i).getNomePilota();
            }
        }
        return ("Il primo classificato è " + pilota + "con tempo " + primo);
    }
    
}
