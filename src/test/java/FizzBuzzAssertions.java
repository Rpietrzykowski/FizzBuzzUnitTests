import java.util.List;

import static java.util.Collections.frequency;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzAssertions {

    public static IllegalArgumentException checkIllegalArgumentException(FizzBuzz fizzBuzz, Integer rangeFrom, Integer rangeTo){
        return assertThrows(IllegalArgumentException.class, () -> {
            fizzBuzz.generateFizzBuzzList(rangeFrom, rangeTo);
        });
    }

    public static void verifyCorrectFizzBuzzValues(List<String> fizzBuzzResults, FizzBuzzResultModel result){
        assertThat(frequency(fizzBuzzResults, FizzBuzzEnum.FIZZ.toString())).isEqualTo(result.getNumOfFizz());
        assertThat(frequency(fizzBuzzResults, FizzBuzzEnum.BUZZ.toString())).isEqualTo(result.getNumOfBuzz());
        assertThat(frequency(fizzBuzzResults, FizzBuzzEnum.FIZZ_BUZZ.toString())).isEqualTo(result.getNumOfFizzBuzz());
        assertThat(fizzBuzzResults.stream().distinct().count()).isEqualTo(result.getNumOfTotalUniqueEntries());
    }
}
