package de.thro.vv.exercises.fieldbreakpoints;

public class FieldBreakpoints
{
    /*Exercise*/
    /* CTRL + F8  --> Add Field Breakpoint
     CTRL + SHIFT + F8 --> Modify breakpoint settings
     */
    private static boolean fieldPropertyAccessed;

    public static void main(String[] args)
    {
        fieldPropertyAccessed = true;
        System.out.println("Field Property switched");
        fieldPropertyAccessed = false;
        System.out.println("Field Property switched");
    }
}
