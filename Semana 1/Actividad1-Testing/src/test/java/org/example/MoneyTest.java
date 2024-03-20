package org.example;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MoneyTest {
    @Test
    void constructorShouldSetAmountAndCurrency() {
        Money money = new Money(200,"sol");
        int amount = 200;
        String currency = "sol";
        assertThat(money.getAmount()).isEqualTo(200);
        assertThat(money.getCurrency()).isEqualTo("sol");
    }

}