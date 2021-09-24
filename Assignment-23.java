import java.io.*;
import java.util.*;


class Person
{
    private String name;
    private int age;
 
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
 
    @Override
    public String toString()
    {
        return "{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
}



public class Main
{
	public static void main(String[] args) {
	    
	    
	    List<Person> persons = new ArrayList<>(Arrays.asList(
                                            new Person("Athlestan", 35),
                                            new Person("Lagertha", 36),
                                            new Person("Ragnar", 40),
                                            new Person("Floki", 38),
                                            new Person("Bjorn", 19)
                                        ));
        Comparator<Person> byAge = Comparator.comparing(Person::getAge);
        Collections.sort(persons, byAge);
        System.out.println(persons);
        Comparator<Person> byName = Comparator.comparing(Person::getName);
        Collections.sort(persons, byName);
        System.out.println(persons);

	}
}
