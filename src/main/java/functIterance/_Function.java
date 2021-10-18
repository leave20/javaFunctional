package functIterance;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        //Function takes 1 arguments and produces 1 result
        int increment = increment(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyByTenFunction.apply(increment);
        System.out.println(multiply);

        Function<Integer, Integer> addByOneAndTenMultiply =
                incrementByOneFunction.andThen(multiplyByTenFunction);
        System.out.println(addByOneAndTenMultiply.apply(5));

        //BiFunction takes 2 arguments and produces 1 result
        System.out.println(incrementByOneAndMultiply(4, 8));

        System.out.println(incrementByOneAndTenMultiplyBiFunction.apply(4, 8));

    }


    static Function<Integer, Integer> multiplyByTenFunction =
            number -> number * 10;

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    private static int increment(int i) {
        return i + 1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndTenMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    private static int incrementByOneAndMultiply(int number, int numMultiplyBy) {
        return (number + 1) * numMultiplyBy;
    }
}
