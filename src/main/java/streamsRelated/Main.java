package streamsRelated;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
      //  printOdd(99);

     //   Preson P -> name, age, designation
     //   Sort using lambda with pivot as age more than 25 and the results should be
        //   saved a map with name as key and designation as value


        Person person1 = new Person("Sachin", 40, "Doctor");
        Person person2 = new Person("Manish", 20, "Software engineer");
        Person person3 = new Person("Virat", 30, "Software engineer2");
        Person person0 = new Person("Virat", 31, "Software 1");
        Person person4 = new Person("Mayank", 18, "helper");
        Person person5 = new Person("Nilesh", 56, "Software engineer3");
        Person person6 = new Person("Akshay", 14, "Student");

        List<Person> personList = new ArrayList<>();
        personList.add(person0);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);


        /*Stream<Person> sorted = personList.stream()
                .filter(p -> p.getAge() > 25)
                .sorted((p1, p2) -> p1.getAge() > p2.getAge() ? 1 : p1.getAge() < p2.getAge() ? -1 : 0);

        Map<String, String> collect = sorted.collect(Collectors.toMap(Person::getName, Person::getDesignation));
*/

        Map<String, String> collect = personList.stream()
                .filter(p -> p.getAge() > 25)
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toMap(
                        Person::getName,
                        Person::getDesignation,
                        (oldValue, newValue) -> oldValue, // Merge function to handle duplicate keys
                        LinkedHashMap::new // Supplier to create a LinkedHashMap
                ));

             collect.forEach((k,v) -> System.out.println("name : " + k +" and designation : "+v));

        //  .collect(Collectors.toMap(person -> person.getName(), p2 -> p2.getDesignation(), LinkedHashMap::new));

        Map<String, String> collect12 = personList.stream()
                .filter(p -> p.getAge() > 25)
                .sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .collect(Collectors.toMap(Person::getName, Person::getDesignation));

        Map<String, String> collect3 = personList.stream()
                .filter(p -> p.getAge() > 25)
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toMap(
                        Person::getName,
                        Person::getDesignation,
                        (oldValue, newValue) -> newValue, // Merge function to handle duplicate keys by keeping the new value
                        LinkedHashMap::new // Supplier to create a LinkedHashMap to maintain insertion order
                ));

        // Print the result
        collect3.forEach((name, designation) -> System.out.println(name + ": " + designation));

    }

    /*static void printOdd(int n) {
    //   IntStream.rangeClosed(0, n).filter(i -> i % 2 != 0).forEach(m -> System.out.print(m+" "));
        List<Integer> collect = IntStream.rangeClosed(0, n).filter(i -> i % 2 != 0).boxed().collect(Collectors.toList());

    }*/
}
