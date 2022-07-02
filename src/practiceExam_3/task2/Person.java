package practiceExam_3.task2;

        /* 2. В классе Person 3 свойства: фамилия, имя, отчество.
        Поместить Person в LinkedList.
        Написать метод для добавления Person в LinkedList, но учесть, что при попадании дублирующихся Person в список - вызывать исключение
         */

import java.util.Objects;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(lastName, person.lastName) && Objects.equals(firstName, person.firstName)
                && Objects.equals(middleName, person.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, middleName);
    }

    @Override
    public String toString() {
        return "task2.Person { " + "\n" +
                " Фамилия: " + lastName + "\n" +
                " Имя: " + firstName + "\n" +
                " Очество: " + middleName +
                " }";
    }
}