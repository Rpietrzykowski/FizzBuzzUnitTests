import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzNegativeTests {

    @Test
    void verifyFizzBuzzNumberWithInvalidRange(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(FizzBuzzConstants.RANGE_FROM_LOWER_THAN_RANGE_TO_EXCEPTION)
                .isEqualTo(FizzBuzzAssertions.checkIllegalArgumentException(fizzBuzz, 1, -15).getMessage());
    }

    @Test
    void verifyFizzBuzzNumberForNegativeRanges(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(FizzBuzzConstants.RANGE_LOWER_THAN_ZERO_EXCEPTION)
                .isEqualTo(FizzBuzzAssertions.checkIllegalArgumentException(fizzBuzz, -100, -1).getMessage());
    }

    @Test
    void verifyFizzBuzzNumberForNegativeRangeFrom(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(FizzBuzzConstants.RANGE_LOWER_THAN_ZERO_EXCEPTION)
                .isEqualTo(FizzBuzzAssertions.checkIllegalArgumentException(fizzBuzz, -100, 1).getMessage());
    }

    @Test
    void verifyFizzBuzzNumberForNegativeRangeToEqualsZero() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(FizzBuzzConstants.RANGE_LOWER_THAN_ZERO_EXCEPTION)
                .isEqualTo(FizzBuzzAssertions.checkIllegalArgumentException(fizzBuzz, -100, 0).getMessage());
    }

    @Test
    void verifyFizzBuzzNumberForBothRangeEqualsZero() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(FizzBuzzConstants.RANGE_LOWER_THAN_ZERO_EXCEPTION)
                .isEqualTo(FizzBuzzAssertions.checkIllegalArgumentException(fizzBuzz, 0, 0).getMessage());
    }

    @Test
    void verifyFizzBuzzNumberForBothRangeAreNegative() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(FizzBuzzConstants.RANGE_LOWER_THAN_ZERO_EXCEPTION)
                .isEqualTo(FizzBuzzAssertions.checkIllegalArgumentException(fizzBuzz, -1, -1).getMessage());
    }
}

