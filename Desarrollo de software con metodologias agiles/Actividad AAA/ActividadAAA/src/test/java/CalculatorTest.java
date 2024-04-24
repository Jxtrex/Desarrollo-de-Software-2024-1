import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    public void testSum_PositiveNumbers_ShouldReturnCorrectSum() {
        // Arrange
        Calculator calculator = new Calculator();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculator.sumar(numeroA, numeroB);

        // Assert
        assertEquals(15, resultado, "10 + 5 deberia ser 15");
    }

    @Test
    public void restaPositiva() {
        // Arrange
        Calculator calculator = new Calculator();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculator.restar(numeroA, numeroB);

        // Assert
        assertEquals(5, resultado, "10 - 5 debería ser 5");
    }

    @Test
    void multiplicacion() {
        // Arrange
        Calculator calculator = new Calculator();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculator.multiplicacion(numeroA, numeroB);

        // Assert
        assertEquals(50, resultado, "10 * 5 debería ser 50");
    }

    @Test
    void division() {
        // Arrange
        Calculator calculator = new Calculator();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        double resultado = calculator.division(numeroA,numeroB);

        // Assert
        assertEquals(2,resultado, "10 / 5 debería ser 2");
    }
}