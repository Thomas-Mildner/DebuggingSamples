[![Java CI with Gradle](https://github.com/Thomas-Mildner/DebuggingSamples/actions/workflows/gradle.yml/badge.svg)](https://github.com/Thomas-Mildner/DebuggingSamples/actions/workflows/gradle.yml)

# DebuggingSamples
Sample repository with code snippets to practice debugging with IntelliJ IDEA


# Examples

## Breakpoints

Breakpoints are special markers in the development environment that stop regular program execution at a desired point. This allows the developer to examine the program state and behavior to detect errors and incorrect behavior.

### Types of breakpoints

The following types of breakpoints are available in IntelliJ IDEA:
(vgl. https://www.jetbrains.com/help/idea/using-breakpoints.html#set-breakpoints)

- Line Breakpoints: Suspend the program upon reaching the line of code where the breakpoint was set. This type of breakpoints can be set on any executable line of code.

    ![](./doc//Images/LineBreakpoints.PNG)
- Method Breakpoints: Suspend the program upon entering or exiting the specified method or one of its implementations, allowing you to check the method's entry/exit conditions.
    ![](./doc/Images/MethodBreakpoints.PNG)
- Field Watchpoints: To detect access and modification of fields if caller source is unknown
    
    ![](./doc/Images/FieldBreakpoints.PNG)
- Exception Breakpoints:
Hold application if specific exception occurs

    > CTRL + SHIFT + F8  --> View Breakpoints, ALT + Insert (Exception)
     
    ![](./doc/Images/ExceptionSettings.gif)

Alternatively, check "Any Exception" to stop the application if an exception occurs.

### Conditional Debugging

## Watches

## Expressions

## Remote Debug



# Tipps and Tricks

## IntelliJ IDEA Shortcuts

> Toggle line Breakpoint Shortcut: CTRL + F8
>
> Edit breakpoint properties: CTRL + SHIFT + F8
>


## Google Search Engine

- Use Placeholder:
    > ### Wrong
    >> could not cast value of type DemoHomeClass to DemoClass
    >>> About 7 results (0,56 seconds)
    >
    > ### Better:
    >
    >> Could not cast value of type * to type *
    >>> About 1.550.000.000 results (0,51 seconds) 
    >  
    > ### Further Improvement:
    >
    >> site: stackoverflow.com solved Could not cast value of type * to type *
    >>> About 4.420.000 results (1,02 seconds)   --> StackOverflow Entry with solved question is first result

- Exclude Search Results:
    > Mustang -Car Ford
    >> Show only horse results 

- Must Have Search Terms:
    > Mustang "Ford"
    >> Will search for Cars, excluded horses

- Combinations:
    > -site: udemy "java spring boot"
    >> Show results for Java Spring Boot Courses on Udemy
    >
    > -site: udemy "java RestApi*"
    >> Search on Udemy for Java RestAPI results
    >
    > blog: java spring boot "jpa" 2020..2022
    >> Search for blog entries that can contain java spring boot and must contain "JPA" in the period from 2020 to 2022.


# Exercises

Clone this Repository: https://github.com/Thomas-Mildner/DebuggingSamples </br>
- LineBreakpoints: *de.thro.vv.exercises.linebreakpoints.LineBreakpoints --> Main*<br/>
- MethodBreakpoints: *de.thro.vv.exercises.methodbreakpoints.MethodBreakpoints --> Main*<br/>
- FieldBreakpoints: *de.thro.vv.exercises.fieldbreakpoints.FieldBreakpoints --> Main*<br/>
- ComplexDebugging: *de.thro.vv.exercises.complexDebugging.ComplexDebugging --> Main*<br/>
- ExceptionDebugging: *de.thro.vv.exercises.exceptions.ExceptionDebugging --> Main* <br/>
- 