



public class Jugador extends Thread{

    @Override
    public void run() {
        try{
            ZONA.siguienteParticipante(this);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
