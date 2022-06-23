[![Java CI with Gradle](https://github.com/Thomas-Mildner/DebuggingSamples/actions/workflows/gradle.yml/badge.svg)](https://github.com/Thomas-Mildner/DebuggingSamples/actions/workflows/gradle.yml)

# DebuggingSamples
Sample repository with code snippets to practice debugging with IntelliJ IDEA


# Examples

## Breakpoints

Breakpoints are special markers in the development environment that stop regular program execution at a desired point. This allows the developer to examine the program state and behavior to detect errors and incorrect behavior.

### Types of breakpoints

The following types of breakpoints are available in IntelliJ IDEA:

- Line Breakpoints: 
- Method Breakpoints:
- Field Watchpoints:
- Exception Breakpoints:

> Toggle line Breakpoint Shortcut: CTRL + F8
>
> Edit breakpoint properties: CTRL + SHIFT + F8

### Conditional Debugging

## Watches
## Expressions


## Exception Debugging

## Remote Debug



# Tipps and Tricks

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
> site: udemy "java RestApi*"
>> Search on Udemy for Java RestAPI results
>
> blog: java spring boot "jpa" 2020..2022
>> Search for blog entries that can contain java spring boot and must contain "JPA" in the period from 2020 to 2022.