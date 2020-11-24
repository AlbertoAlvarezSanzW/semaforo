

public class Main {


/*

    Vamos a simular un torneo de Battle Royale, estio warzone
    En resumen, entran 10 jugadores (hilos) de los que solo puede quedar 1
    Sin embargo inicialmentre, se crean 15(hilos) de los cuales solo los 10 primeros más rapidos entran a la batalla de inmediato.
    los demas tendran que esperar a que haya hueco.
    nada mas entrar el primer hilo duerme entre 1 y 5 sec
    el primer hilo que acabe consigue un bonus.
    los 5 ultimos mueren, dando paso a los hilos que estaban esperando,
    cuando todos los hilos hayan acabado, cada uno de los hilos saca un numero aleatorio que sera la puntuacion y
    se lo entrega a alguna clase que se encarga de calcular el ganador.
    la puntuacion que hubiera sacado los hilos que tenian bonus vale doble.  gana el hilo que mas puntos haya obtenido
     */


    public static void main (String[] args){


        final int BATTLEROYAL = 15;

        // creamos un bucle for con los lochadores que van a participar
        for (int i = 0; i < BATTLEROYAL; i++){
            // creamos 1 objeto por cada luchardor
            Jugador entra = new Jugador();
            //
            entra.setName("Luchador "+ i);
            entra.start();

        }
    }
}
