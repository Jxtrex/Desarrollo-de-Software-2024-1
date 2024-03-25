package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClientTest {
    private Address address = new Address("street A");
    private Address secondAddress = new Address("street B");

    private Client client;
    @BeforeEach
    void setUp(){
        client = new Client();
    }
    @Test
    void afterCreationShouldHaveAddress(){
    }
    @Test
    void shouldAllowToAddAddress(){
        client.addAddress(address);
    }

    @Test
    void shouldAllowToAddManyAddress(){
        client.addAddress(address);
        client.addAddress(secondAddress);
    }
}
