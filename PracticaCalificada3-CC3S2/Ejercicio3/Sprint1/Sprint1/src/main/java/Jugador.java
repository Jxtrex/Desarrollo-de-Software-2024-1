import java.util.ArrayList;
import java.util.List;
public class Jugador {
    private String nombre;
    private List<String> inventario = new ArrayList<>();
    private int[] posicion;
    Jugador(String nombre){
        this.nombre = nombre;
        this.posicion = new int[]{0, 0};
    }

    Jugador(String nombre,Integer posx,Integer posy){
        this.nombre = nombre;
        this.posicion = new int[]{posx,posy};
    }
    int[] getPosition(){
        return posicion;
    }
    @Override
    public String toString() {
        int cont = 0;
        String temp = "";
        for(String item: inventario)
            temp = temp + "Item " + (++cont) + "->" + item;
        return temp;
    }

    String showInventario(){
        return inventario.toString();
    }

    List<String> getInventario(){
        return inventario;
    }

    void addItem(String objeto){
        inventario.add(objeto);
    }

    void removeItem(String objeto) throws Exception{
        if(inventario.contains(objeto))
            inventario.remove(objeto);
        else
            throw new Exception("No existe el objeto en tu inventario");
    }


    public void setPosition(int i, int i1) {
        this.posicion[0] = i;
        this.posicion[1] = i1;
    }
}
