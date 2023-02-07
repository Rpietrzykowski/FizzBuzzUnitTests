import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class FizzBuzzResultModel {
    Integer numOfFizz;
    Integer numOfBuzz;
    Integer numOfFizzBuzz;
    Long numOfTotalUniqueEntries;
}
