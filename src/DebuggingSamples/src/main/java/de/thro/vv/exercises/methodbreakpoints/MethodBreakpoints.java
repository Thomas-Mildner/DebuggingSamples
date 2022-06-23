package de.thro.vv.exercises.methodbreakpoints;

public class MethodBreakpoints
{
    public static void main(String[] args)
    {
        Test();
    }

    /*Exercise*/
    /* CTRL + F8  --> Add Method Breakpoint
     CTRL + SHIFT + F8 --> Modify breakpoint settings
     */
    private static void Test(){
        System.out.println("Test Method called");
    }
}
