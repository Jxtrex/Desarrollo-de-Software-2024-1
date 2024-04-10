import org.junit.jupiter.api.Test;

import java.awt.geom.RoundRectangle2D;

import static org.junit.jupiter.api.Assertions.*;

class CalculadorTest {

    @Test
    void testSum_PositiveNumbers_ShouldReturnCorrectSum() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculador.sumar(numeroA, numeroB);

        // Assert
        assertEquals(15, resultado, "10 + 5 deberia ser 15");
    }

    @Test
    void testSum_NegativeNumbers_ShouldReturnCorrectSum() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = -10;
        int numeroB = -5;

        // Act
        int resultado = calculador.sumar(numeroA, numeroB);

        // Assert
        assertEquals(-15, resultado, "(-10) + (-5) deberia ser -15");
    }

    @Test
    void testSum_PositiveAndNegativeNumbers_ShouldReturnPositiveSum() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = -5;

        // Act
        int resultado = calculador.sumar(numeroA, numeroB);

        // Assert
        assertEquals(5, resultado, "10 + (-5) deberia ser 5");
    }

    @Test
    void testSum_PositiveandNegativeNumber_ShouldReturnNegativeSum() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = -10;
        int numeroB = 5;

        // Act
        int resultado = calculador.sumar(numeroA, numeroB);

        // Assert
        assertEquals(-5, resultado, "(-10) + 5 deberia ser -5");
    }

    @Test
    void testSustr_PositiveNumbers_ShouldReturnPositiveDifference() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 5;

        // ACt
        int resultado = calculador.restar(numeroA, numeroB);

        // Assert
        assertEquals(5, resultado, "10 - 5 debería ser 5");
    }

    @Test
    void testSustr_PositiveNumbers_ShouldReturnNegativeDifference() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 5;
        int numeroB = 10;

        // Act
        int resultado = calculador.restar(numeroA, numeroB);

        // Assert
        assertEquals(-5, resultado, "5 - 10 debería ser -5");
    }

    @Test
    void testSustr_NegativeNumbers_ShouldReturnPositiveDifference() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = -5;
        int numeroB = -10;

        // Act
        int resultado = calculador.restar(numeroA, numeroB);

        // Assert
        assertEquals(5, resultado, "(-5) - (-10) debería ser 5");
    }

    @Test
    void testSustr_NegativeNumbers_ShouldReturnNegativeDifference() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = -10;
        int numeroB = -5;

        // Act
        int resultado = calculador.restar(numeroA, numeroB);

        // Assert
        assertEquals(-5, resultado, "(-10) - (-5) debería ser -5");
    }

    @Test
    void testMult_PositiveNumbers_ShouldReturnPositiveProduct() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculador.multiplicacion(numeroA, numeroB);

        // Assert
        assertEquals(50, resultado, "10 * 5 debería ser 50");
    }

    @Test
    void testMult_NegativeNumbers_ShouldReturnPositiveProduct() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = -10;
        int numeroB = -5;

        // Act
        int resultado = calculador.multiplicacion(numeroA, numeroB);

        // Assert
        assertEquals(50, resultado, "(-10) * (-5) debería ser 50");
    }

    @Test
    void testMult_PositiveAndNegativeNumbers_ShouldReturnNegativeProduct() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = -5;

        // Act
        int resultado = calculador.multiplicacion(numeroA, numeroB);

        // Assert
        assertEquals(-50, resultado, "10 * (-5) debería ser 50");
    }

    @Test
    void testMult_ProductWithZero_ShouldReturnZeroProduct() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 0;

        // Act
        int resultado = calculador.multiplicacion(numeroA, numeroB);

        // Assert
        assertEquals(0, resultado, "10 * 0 debería ser 0");
    }

    @Test
    void testDiv_PositiveNumbers_ShoudlReturnPositiveDivision() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        double resultado = calculador.division(numeroA, numeroB);

        // Assert
        assertEquals(2, resultado, "10 / 5 debería ser 2");
    }

    @Test
    void testDiv_NegativeNumbers_ShoudlReturnPositiveDivision() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = -10;
        int numeroB = -5;

        // Act
        double resultado = calculador.division(numeroA, numeroB);

        // Assert
        assertEquals(2, resultado, "(-10) / (-5) debería ser 2");
    }

    @Test
    void testDiv_PositiveAndNegativeNumbers_ShoudlReturnNegativeDivision() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = -10;
        int numeroB = 5;

        // Act
        double resultado = calculador.division(numeroA, numeroB);

        // Assert
        assertEquals(-2, resultado, "(-10) / (-5) debería ser 2");
    }

//    @Test
//    void testDiv_DivisionByZero_ShoudlReturnWarning() {
//        // Arrange
//        Calculador calculador = new Calculador();
//        int numeroA = 10;
//        int numeroB = 0;
//
//        // Act
//        double resultado = calculador.division(numeroA, numeroB);
//
//        // Assert
//        assertEquals(new ArithmeticException(), resultado, "10 / 0 debería lanzar una advertencia");
//    }
}