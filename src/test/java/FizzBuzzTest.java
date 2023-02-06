import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.frequency;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    void verifyAllFizzBuzzResultsForRange1To100(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> fizzBuzzResults = fizzBuzz.generateFizzBuzzList(1, 100);
        assertThat(frequency(fizzBuzzResults, FizzBuzzEnum.FIZZ.toString())).isEqualTo(27);
        assertThat(frequency(fizzBuzzResults, FizzBuzzEnum.BUZZ.toString())).isEqualTo(14);
        assertThat(frequency(fizzBuzzResults, FizzBuzzEnum.FIZZ_BUZZ.toString())).isEqualTo(6);
        assertThat(fizzBuzzResults.stream().distinct().count()).isEqualTo(56);
    }

    @Test
    void verifyFizzBuzzNumberForRangeFrom1To2(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> fizzBuzzResults = fizzBuzz.generateFizzBuzzList(1, 2);
        assertThat(frequency(fizzBuzzResults, FizzBuzzEnum.FIZZ_BUZZ.toString())).isEqualTo(0);
        assertThat(frequency(fizzBuzzResults, FizzBuzzEnum.FIZZ.toString())).isEqualTo(0);
        assertThat(frequency(fizzBuzzResults, FizzBuzzEnum.BUZZ.toString())).isEqualTo(0);
        assertThat(fizzBuzzResults.stream().distinct().count()).isEqualTo(2);
    }

    @Test
    void verifyFizzBuzzNumberForSingleRange(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> fizzBuzzResults = fizzBuzz.generateFizzBuzzList(1, 1);
        assertThat(frequency(fizzBuzzResults, FizzBuzzEnum.FIZZ_BUZZ.toString())).isEqualTo(0);
        assertThat(frequency(fizzBuzzResults, FizzBuzzEnum.FIZZ.toString())).isEqualTo(0);
        assertThat(frequency(fizzBuzzResults, FizzBuzzEnum.BUZZ.toString())).isEqualTo(0);
        assertThat(fizzBuzzResults.stream().distinct().count()).isEqualTo(1);
    }

    @Test
    void verifyFizzBuzzNumberForRangeFrom1To3(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> fizzBuzzResults = fizzBuzz.generateFizzBuzzList(1, 3);
        assertThat(frequency(fizzBuzzResults, FizzBuzzEnum.FIZZ_BUZZ.toString())).isEqualTo(0);
        assertThat(frequency(fizzBuzzResults, FizzBuzzEnum.FIZZ.toString())).isEqualTo(1);
        assertThat(frequency(fizzBuzzResults, FizzBuzzEnum.BUZZ.toString())).isEqualTo(0);
        assertThat(fizzBuzzResults.size()).isEqualTo(3);
    }

    @Test
    void verifyFizzBuzzNumberForRangeFrom1To5(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> fizzBuzzResults = fizzBuzz.generateFizzBuzzList(1, 5);
        assertThat(frequency(fizzBuzzResults, FizzBuzzEnum.FIZZ_BUZZ.toString())).isEqualTo(0);
        assertThat(frequency(fizzBuzzResults, FizzBuzzEnum.FIZZ.toString())).isEqualTo(1);
        assertThat(frequency(fizzBuzzResults, FizzBuzzEnum.BUZZ.toString())).isEqualTo(1);
        assertThat(fizzBuzzResults.size()).isEqualTo(5);
    }

    @Test
    void verifyFizzBuzzNumberForRangeFrom1To15(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> fizzBuzzResults = fizzBuzz.generateFizzBuzzList(1, 15);
        assertThat(frequency(fizzBuzzResults, FizzBuzzEnum.FIZZ_BUZZ.toString())).isEqualTo(1);
        assertThat(frequency(fizzBuzzResults, FizzBuzzEnum.FIZZ.toString())).isEqualTo(4);
        assertThat(frequency(fizzBuzzResults, FizzBuzzEnum.BUZZ.toString())).isEqualTo(2);
        assertThat(fizzBuzzResults.size()).isEqualTo(15);
    }


}
