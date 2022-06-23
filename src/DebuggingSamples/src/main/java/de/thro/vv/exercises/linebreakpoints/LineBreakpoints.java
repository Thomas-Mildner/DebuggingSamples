package de.thro.vv.exercises.linebreakpoints;

public class LineBreakpoints
{
    public static void main(String[] args)
    {
        /*Exercise: Set Breakpoint --> CTRL + F8*/
        boolean firstRun = true;
        /*Step trough debugger --> F8 */
        System.out.println("Hello World");
        /*Step into method --> F7*/
        DetailedMethod(firstRun);
        System.out.println("Hello World 2");

    }

    private static void DetailedMethod(boolean boolValue){
        boolValue = false;

        /*Step out method --> SHIFT + F8 */
        var shouldNotBeViewedInDebugger = false;
    }
}
