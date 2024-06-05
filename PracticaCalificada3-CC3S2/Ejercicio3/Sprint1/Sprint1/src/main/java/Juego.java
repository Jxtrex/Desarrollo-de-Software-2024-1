import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Juego {
    private enum estadoDelJuego {EN_CURSO,FINALIZADO}
    private estadoDelJuego estadoActualDelJuego;


    private int mapSize;
    private Habitacion[][] habitaciones;
    private Jugador jugador;
    Juego(Jugador jugador, Integer mapSize) throws Exception{
        if(mapSize<= 0) throw new Exception();
        // Crea las habitaciones
        this.mapSize = mapSize;
        habitaciones = new Habitacion[mapSize][mapSize];
        for(Habitacion[] temp : habitaciones)
        {
                for (Habitacion habitacion : temp)
                {
                    habitacion = new Habitacion();
                }
        }

        //Inicializa al jugador
        this.jugador  = jugador;
        //Asigna al jugador
        habitaciones[0][0].asignarJugador(this.jugador);
    }

    void moverJugador(String movimiento){
        Scanner mov = new Scanner(System.in);
        mov.nextLine();
        switch (movimiento){
            case "mover norte":
                if(jugador.getPosition()[0]>1) {
                    System.out.println("Se mueve al norte");
                    habitaciones[jugador.getPosition()[0]][jugador.getPosition()[1]].asignarJugador(null);
                    jugador.setPosition(jugador.getPosition()[0] - 1, jugador.getPosition()[1]);
                    habitaciones[jugador.getPosition()[0]][jugador.getPosition()[1]].asignarJugador(jugador);
                }
            case "mover sur":
                if(jugador.getPosition()[0]<this.mapSize-1) {
                    System.out.println("Se mueve al norte");
                    habitaciones[jugador.getPosition()[0]][jugador.getPosition()[1]].asignarJugador(null);
                    jugador.setPosition(jugador.getPosition()[0]+1,jugador.getPosition()[1]);
                    habitaciones[jugador.getPosition()[0]][jugador.getPosition()[1]].asignarJugador(jugador);
                }
            case "mover este":
                if(jugador.getPosition()[1]>1) {
                    System.out.println("Se mueve al este");
                    habitaciones[jugador.getPosition()[0]][jugador.getPosition()[1]].asignarJugador(null);
                    jugador.setPosition(jugador.getPosition()[0],jugador.getPosition()[1]-1);
                    habitaciones[jugador.getPosition()[0]][jugador.getPosition()[1]].asignarJugador(jugador);}
            case "mover oeste":
                if(jugador.getPosition()[1]<this.mapSize-1) {
                    System.out.println("Se mueve al oeste");
                    habitaciones[jugador.getPosition()[0]][jugador.getPosition()[1]].asignarJugador(null);
                    jugador.setPosition(jugador.getPosition()[0],jugador.getPosition()[1]+1);
                    habitaciones[jugador.getPosition()[0]][jugador.getPosition()[1]].asignarJugador(jugador);}
        }
    }
}
