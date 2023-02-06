
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FizzBuzz {
    List<String> generateFizzBuzzList(Integer rangeFrom, Integer rangeTo){
        if(rangeFrom > rangeTo) { throw new IllegalArgumentException("RangeFrom has lower value than rangeTo value."); }
        else if (rangeFrom <= 0) { throw new IllegalArgumentException("Provided range contains number lower than 0. Please provide positive numbers for ranges"); }
       return IntStream.rangeClosed(rangeFrom, rangeTo).mapToObj(FizzBuzz::returnFizzBuzzInfo).collect(Collectors.toList());
    }

    static String returnFizzBuzzInfo(Integer givenNumber){
        if (givenNumber % 3 == 0 && givenNumber % 5 == 0) {
            return FizzBuzzEnum.FIZZ_BUZZ.toString();
        } else if (givenNumber % 3 == 0) {
            return FizzBuzzEnum.FIZZ.toString();
        } else if (givenNumber % 5 == 0) {
            return FizzBuzzEnum.BUZZ.toString();
        } else {
           return String.valueOf(givenNumber);
        }
    }
}

