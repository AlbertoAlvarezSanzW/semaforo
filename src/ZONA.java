import java.util.Random;
import java.util.concurrent.Semaphore;

public class ZONA {


    private static final int MAXIMO = 10;
    private static final Semaphore available = new Semaphore(MAXIMO,false);

    // variable static
    private static Jugador ganador;


    public static void siguienteParticipante(Jugador jugador) throws InterruptedException {

        available.acquire();
        System.out.println("Entran los participantes que estaban en espera" + jugador.getName());
        Thread.sleep(2000);

        if (!losPrimeros(jugador)){
            System.out.println("Comienzan a pegarse " + jugador.getName());
            matarnos(ganador,jugador);

        }

    }
    private static synchronized boolean losPrimeros(Jugador jugador) throws InterruptedException{
        if (ganador == null){
            ganador = jugador;
            return true;
        }else{
            return false;
        }
    }


    private static void matarnos (Jugador ganador, Jugador jugador){
        Random random = new Random();
        if (random.nextBoolean()){
            ZONA.ganador = jugador;
        }
        available.release();
        System.out.println("El ganador del enfrentamiento entre "+jugador.getName() +" y "+ganador.getName()+" ha sido --->: "+ganador.getName());
    }



}
