import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private List<String> objetos;
    private String acertijo;
    private String respuesta;
    private Jugador jugador;
    boolean liberada = false;
    Habitacion(){
      objetos = new ArrayList<>(5);
      this.acertijo = "¿Cuál es la mitad de uno?";
      this.respuesta = "El ombligo";
        this.jugador = null;
        liberada = true;
    }
    Habitacion(Integer cantidadObjetos, String acertijo, String respuesta) throws Exception{
        if(cantidadObjetos > 10) throw new Exception("Máximo 10 objetos.");
    objetos = new ArrayList<>(cantidadObjetos);
        this.acertijo = acertijo;
        this.respuesta = respuesta;
        this.jugador = null;
    }
    void asignarJugador(Jugador jugador)
    {
        this.jugador = jugador;
    }

}
