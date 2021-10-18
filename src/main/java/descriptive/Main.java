package descriptive;

import models.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static enums.Gender.FEMALE;
import static enums.Gender.MALE;

class MainDescriptive {
    public static void main(String[] args) {
        new MainDescriptive();
    }

    public MainDescriptive() {
        List<Person> people = Arrays.asList(
                new Person("Jhon", MALE),
                new Person("Katy", FEMALE),
                new Person("Carlos", MALE),
                new Person("Ana", FEMALE));

//        people.stream()
//                .filter(person -> FEMALE.equals(person.gender))
//                .collect(Collectors.toSet()).forEach(System.out::println);

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);

        List<Person> females2 = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());

        females2.forEach(System.out::println);
    }
}
