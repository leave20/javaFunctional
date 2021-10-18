package optional;


import java.util.Optional;
import java.util.function.Supplier;

public class MainOptional {
    public static void main(String[] args) {
        Object value = Optional.of("Hello").orElse("default value");
        System.out.println(value);

        Object valueTwo = Optional.of("Hola")
                .orElseThrow(() -> new IllegalStateException("exception"));
        System.out.println(valueTwo);

        Supplier<IllegalStateException> exception = () -> new IllegalStateException("exception");
        Object valueThree = Optional.ofNullable("Hello three")
                .orElseThrow(exception);
        System.out.println(valueThree);

        Optional.of("Hola four")
                .ifPresent(System.out::println);

        Optional.of("thetai6102@gmail.com")
                .ifPresent(email -> System.out.println("Sending email to " + email));

        Object valueFive=Optional.ofNullable(null);

        ((Optional<?>) valueFive).ifPresent(
                        email -> System.out.println("Sending email to " + email));

        ((Optional<?>) valueFive).orElseThrow(
                        ()-> new IllegalStateException("not sending email"));

    }
}
