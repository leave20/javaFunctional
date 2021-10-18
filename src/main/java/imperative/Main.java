package imperative;

import models.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static enums.Gender.*;


class MainImperative {
    public static void main(String[] args) {
        new MainImperative();
    }

    public MainImperative() {
        List<Integer> numbers = createList();
        System.out.println(numbers);

        List<Integer> pares = filterPares(numbers);
        System.out.println(pares);

        List<Person> people = Arrays.asList(
                new Person("Jhon", MALE),
                new Person("Katy", FEMALE),
                new Person("Carlos", MALE),
                new Person("Ana", FEMALE));

        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }

        }
        for (Person female : females) {
            System.out.println(female);
        }
    }


    private List<Integer> filterPares(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                result.add(number);
            }
        }
        return result;
    }

    private List<Integer> createList() {
        return Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

}

