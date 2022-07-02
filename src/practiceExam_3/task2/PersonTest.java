package practiceExam_3.task2;

import java.util.LinkedList;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) throws Exception {

        LinkedList<Person> people = new LinkedList<>();

        Person person1 = new Person("Нурланбеков", "Эрлан", "Нурланбекович");
        Person person2 = new Person("Нурланбеков", "Эрлан", "Нурланбекович");

        System.out.println(addLinkedList(person1,people));
        System.out.println(addLinkedList(person2,people));
    }

    public static List<Person> addLinkedList (Person person, LinkedList<Person> register) throws Exception {
        for (Person value : register) {
            if (value.equals(person)) {
                throw new Exception("Такой персонаж у же существует!");
            }
        }
        register.add(person);
        return register;
    }
}