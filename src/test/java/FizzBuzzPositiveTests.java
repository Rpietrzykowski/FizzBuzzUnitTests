import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.frequency;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzPositiveTests {

    @Test
    void verifyAllFizzBuzzResultsForRange1To100(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        FizzBuzzResultModel fizzBuzzExpectedResults = new FizzBuzzResultModel(27, 14, 6, 56L);

        List<String> fizzBuzzResults = fizzBuzz.generateFizzBuzzList(1, 100);

        FizzBuzzAssertions.verifyCorrectFizzBuzzValues(fizzBuzzResults, fizzBuzzExpectedResults);
    }

    @Test
    void verifyFizzBuzzNumberForRangeFrom1To2(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        FizzBuzzResultModel fizzBuzzExpectedResults = new FizzBuzzResultModel(0, 0, 0, 2L);

        List<String> fizzBuzzResults = fizzBuzz.generateFizzBuzzList(1, 2);

        FizzBuzzAssertions.verifyCorrectFizzBuzzValues(fizzBuzzResults, fizzBuzzExpectedResults);
    }

    @Test
    void verifyFizzBuzzNumberForSingleRange(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        FizzBuzzResultModel fizzBuzzExpectedResults = new FizzBuzzResultModel(0, 0, 0, 1L);

        List<String> fizzBuzzResults = fizzBuzz.generateFizzBuzzList(1, 1);

        FizzBuzzAssertions.verifyCorrectFizzBuzzValues(fizzBuzzResults, fizzBuzzExpectedResults);
    }

    @Test
    void verifyFizzBuzzNumberForRangeFrom1To3(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        FizzBuzzResultModel fizzBuzzExpectedResults = new FizzBuzzResultModel(1, 0, 0, 3L);

        List<String> fizzBuzzResults = fizzBuzz.generateFizzBuzzList(1, 3);

        FizzBuzzAssertions.verifyCorrectFizzBuzzValues(fizzBuzzResults, fizzBuzzExpectedResults);
    }

    @Test
    void verifyFizzBuzzNumberForRangeFrom1To5(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        FizzBuzzResultModel fizzBuzzExpectedResults = new FizzBuzzResultModel(1, 1, 0, 5L);

        List<String> fizzBuzzResults = fizzBuzz.generateFizzBuzzList(1, 5);

        FizzBuzzAssertions.verifyCorrectFizzBuzzValues(fizzBuzzResults, fizzBuzzExpectedResults);
    }

    @Test
    void verifyFizzBuzzNumberForRangeFrom1To15(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        FizzBuzzResultModel fizzBuzzExpectedResults = new FizzBuzzResultModel(4, 2, 1, 11L);

        List<String> fizzBuzzResults = fizzBuzz.generateFizzBuzzList(1, 15);

        FizzBuzzAssertions.verifyCorrectFizzBuzzValues(fizzBuzzResults, fizzBuzzExpectedResults);
    }


}
