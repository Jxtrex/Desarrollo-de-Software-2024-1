import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloMockitoTest {
    private HelloMockito helloMockito = new HelloMockito(PersonRepository personRepository, TranslationService translationService);
    @Test
    void greetPerson() {
        String greeting = helloMockito.greet("World");
        assertEquals("Hello, World, from Mockito!", greeting);
    }
}
