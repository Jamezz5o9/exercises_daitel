package ChapterSeventeen.FunctionInerfaceImp;

import ChapterSeventeen.Person;

import java.util.List;
import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        Predicate<String> predicate = word -> word.length() == 5;
        boolean result = predicate.test("Jame");
        System.out.println(result);

        List<Person> people = List.of(new Person("James", 24),
                new Person("Ayo", 23),
                new Person("Temiloluwa", 45),
                new Person("Bolaji", 45));

        Predicate<Person> checkAge = person -> person.getAge() > 30;
        people.stream().filter(checkAge).forEach(person -> System.out.println(person));

        people.stream().filter(person -> person.getAge() > 30).forEach(person -> System.out.println(person));
    }
}
