package de.thro.vv.exercises.conditionaldebugging;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ConditionalDebugging
{
    private static Random random = new Random();

    public static void main(String[] args)
    {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 100; i++)
        {
            /*Exercise Add Breakpoint to hold application if person.Age is above 80*/
            var randomPerson = getRandomPerson();
            personList.add(randomPerson);
        }
    }

    private static Person getRandomPerson(){
        var p = new Person();
        p.setAge(random.nextInt(100));
        return p;
    }

    private static class Person{
        public int Age;

        public int getAge()
        {
            return Age;
        }

        public void setAge(int age)
        {
            Age = age;
        }
    }
}
