# Horspool Example

**Boyer Moore Horspool Example in Kotlin**

This is a simple example of implementation of the Boyer Moore Horspool Algorithm

The article for this code is https://rajeevkuruganti.com/boyer-moore-horspool-algorithm/

**Example**

This example uses gradle, Kotlin 1.4.21 and target JRE11. I have developed it using IntelliJ IDE

The function which finds the pattern in the source text is in Horspool.kt and the function is executed in unit tests with different use cases. 

You can download/clone this repo and use it how you please. I am grateful if you acknowledge you got if from me, (Rajeev Kuruganti.


**Use Cases**

***Use Case 1: Happy Path***

  source = "Test Tooth String. Molar teeth are growing."

  pattern = "Tooth"

And the pattern is found in the 5th place of the source string

***Use Case 2: Not Happy Path***

  source = "Test Tooth String."

  pattern = "Molar teeth"

As the pattern does not match in the source string we get return as -1

***Use Case 3: Multiple occurences in the source***

  source = "Test tooth String. Molar tooth are growing."

  pattern = "tooth"

 In this scenario the test function has the logic and calls the function and stores in an array the position 5 and 25. 
