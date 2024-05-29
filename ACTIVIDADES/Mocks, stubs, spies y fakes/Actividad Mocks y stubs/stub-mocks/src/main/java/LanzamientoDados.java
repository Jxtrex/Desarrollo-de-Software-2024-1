import java.util.Random;
import java.util.random.RandomGenerator;

public class LanzamientoDados implements NumerosAleatorios {
    private final int NUMEROS_LADOS = 6;
    private final RandomGenerator rnd;

    public LanzamientoDados(NumerosAleatorios r) {

        this.rnd = r;
    }

    public String asText() {
        int lanzado = rnd.nextInt() (NUMEROS_LADOS) + 1;
        return String.format("El lanzamiento es %d", lanzado);
    }


    @Override
    public int nextInt(int upperBoundInclusive, int lowerBoundInclusive) {

    }
}
