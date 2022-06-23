package de.thro.vv.exercises.watches;

import java.util.Random;

public class WatchesExercise
{
    static int valueToBeWatched = 0;

    public static void main(String[] args)
    {
        var random = new Random();
        for (int i = 0; i < 10; i++)
        {
            var value = random.nextBoolean();
            if (random.nextBoolean())
                valueToBeWatched += 1;
        }
    }
}
