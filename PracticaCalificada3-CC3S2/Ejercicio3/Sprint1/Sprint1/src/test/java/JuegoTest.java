import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class JuegoTest {
    @Test
    void inicializarJuego() throws Exception{
        Juego juego = new Juego(new Jugador("Jugador1"),15);
    }

    @Test
    void crearHabitacion(){
        Habitacion habitacion = new Habitacion();
    }

    @Test
    void crearHabitacionPersonalizada() throws Exception{
        Habitacion habitacion = new Habitacion(15,
                "TEST","TEST");
    }

    @Test
    void movimientosJugador(){
        Jugador jugador = new Jugador("Jugador1");
        try{
            Juego juego = new Juego(jugador,15);
            juego.moverJugador("mover norte");
            juego.moverJugador("mover sur");
            juego.moverJugador("mover oeste");
            juego.moverJugador("mover este");
        }catch(Exception e){
            System.out.println("Movimiento invalido");
        }
    }
}
