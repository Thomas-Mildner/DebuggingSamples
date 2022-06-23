package de.thro.vv.exercises.exceptions;

public class ExceptionDebugging
{
    /*Exercise*/
    /* CTRL + SHIFT + F8  --> View Breakpoints, ALT + Insert (Exception)*/
    public static void main(String[] args)
    {
        try{
            throw new DebuggingException("Exception Message");
        }
        catch(Exception ex){
            System.out.println("Unexpected Exception thrown - Debug this");
        }
    }
}
