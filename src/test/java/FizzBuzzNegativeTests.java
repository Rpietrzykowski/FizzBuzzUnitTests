import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzNegativeTests {

    @Test
    void verifyFizzBuzzNumberWithInvalidRange(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            fizzBuzz.generateFizzBuzzList(1, -15);
        });
        assertThat("RangeFrom has lower value than rangeTo value.").isEqualTo(exception.getMessage());
    }

    @Test
    void verifyFizzBuzzNumberForNegativeRanges(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            fizzBuzz.generateFizzBuzzList(-100, -1);
        });
        assertThat("Provided range contains number lower than 0. Please provide positive numbers for ranges").isEqualTo(exception.getMessage());
    }

    @Test
    void verifyFizzBuzzNumberForNegativeRangeFrom(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            fizzBuzz.generateFizzBuzzList(-100, 10);
        });
        assertThat("Provided range contains number lower than 0. Please provide positive numbers for ranges").isEqualTo(exception.getMessage());
    }

    @Test
    void verifyFizzBuzzNumberForNegativeRangeToEqualsZero(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            fizzBuzz.generateFizzBuzzList(-100, 0);
        });
        assertThat("Provided range contains number lower than 0. Please provide positive numbers for ranges").isEqualTo(exception.getMessage());
    }
}
