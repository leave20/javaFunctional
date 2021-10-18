package stream;

import enums.Gender;
import models.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static enums.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Kevin", MALE),
                new Person("Jorge", MALE),
                new Person("Sara", MALE),
                new Person("Ana", MALE),
                new Person("Carlos", MALE)
        );

        Predicate<Person> personPredicateVThree = person -> FEMALE.equals(person.gender);
        boolean containsOnlyFemales = people.stream()
                .allMatch(personPredicateVThree);
        System.out.println(containsOnlyFemales);

        Set<Gender> genders = people.stream().map(person -> person.gender).collect(Collectors.toSet());
        System.out.println(genders);
        people.stream().map(person -> person.gender).collect(Collectors.toSet()).forEach(System.out::println);
        people.stream().map(person -> person.name).collect(Collectors.toSet()).forEach(System.out::println);
        people.stream().map(person -> person.name).mapToInt(String::length).forEach(System.out::println);

        System.out.println("destructuring streams");

        Function<Person, String> personStringFunction = person -> person.name;
        people.stream().map(personStringFunction).mapToInt(String::length).forEach(System.out::println);

        System.out.println("destructuring v2 streams");

        Function<Person, String> personStringFunction1 = person -> person.name;
        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println;

        people.stream().map(personStringFunction).mapToInt(length).forEach(println);
    }
}
