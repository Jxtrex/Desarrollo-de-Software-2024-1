import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    public void testSum_PositiveNumbers_ShouldReturnCorrectSum() {
        // Arrange
        Calculator calculador = new Calculator();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculador.add(numeroA, numeroB);

        // Assert
        assertEquals(15, resultado, "10 + 5 deberia ser 15");
    }

    @Test
    void restar() {
    }

    @Test
    void multiplicacion() {
    }

    @Test
    void division() {
    }
}