package de.thro.vv.exercises.exceptions;

public class DebuggingException extends Exception
{
    public DebuggingException()
    {
        this("Custom Exception thrown without Exception Message");
    }

    public DebuggingException(String s)
    {
        super(s);
        System.out.printf("Exception Message: %s%n", s);
    }
}
