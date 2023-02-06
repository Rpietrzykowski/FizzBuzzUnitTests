public enum FizzBuzzEnum {
    FIZZ("Fizz"),
    BUZZ("Buzz"),
    FIZZ_BUZZ("FizzBuzz");

    private final String value;

    FizzBuzzEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
