# numberrangesummarizer


Implemented by: Alisio Batinti


* NOTE 1:
  * maven was used to assist in building the project
  * https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
  * "c:\numberrangesummarizer>mvn package" used to take the compiled code and package it in its distributable JAR format.
  * The above commnand also runs the unit tests in the process and displays the outcome to the user
  * "c:\numberrangesummarizer>java -cp target/numberrangesummarizer-1.0.jar numberrangesummarizer.Main" was used to run code via cmd
  
* NOTE 2:
  * Unit tests take place by way of the unitTest class using the methods from the implementation class
  * as there arent many methods in this project, the unit tests aim less to test methods and more to test outputs and handling different cases
  * tests for negative numbers, doubles, empty-inputs, duplicates and unordered ranges are all present

* NOTE 3:
  * a failure test for input of string characters exists - the aim is to have an exception thrown, 
  * however running the code with string characters itself will really throw exceptions and crash the programme
  * only the "q" or "Q" string characters are accepted as single inputs for exiting the programme

* NOTE 4:
  * carriage returns and spaces are not treated as blanks
  * That being said blanks and nulls, by their formal definition, are not handled

* ASSUMPTION 1:
  * only use quotes for hardcoded variables/params 
  * command inputs should not contain quotes unless a blank alone is being inputed


* ASSUMPTION 2:
  * inputs will only be string representation of integers
   * i.e "1,3,5,7"


* ASSUMPTION 3:
  * inputs will be delimited only by the comma character
   * i.e ","
  * spaces in inputs will lead to the input being treated as multiple arguments
  * outputs must be delimted by comma-space
   * i.e ", "


* ASSUMPTION 4:
  * inputs are to be converted to a collection of ints for transformation
  * the transformed collection is to be converted to a single string output
  * constraints on sizes for inputs and outputs need not be considered for this implementation


* ASSUMPTION 5:
  * ranges are to be summarised by the use of "-"

* ARGUMENT 5:
  * this leads to a poor representation of a range between negative integers
   * i.e "-10--1" may be ambiguous to a user

* ALTERNATIVE 5:
  * ranges are to be summarised by the use of ":"
   * i.e "-10:-1, 0, 1:10"


INSTRUCTIONS:
/**
 * @author Werner
 *
 * Implement this Interface to produce a comma delimited list of numbers,
 * grouping the numbers into a range when they are sequential.
 *
 *
 * Sample Input: "1,3,6,7,8,12,13,14,15,21,22,23,24,31
 * Result: "1, 3, 6-8, 12-15, 21-24, 31"
 *
 * The code will be evaluated on
 *   - functionality
 *   - style
 *   - robustness
 *   - best practices
 *   - unit tests
 */ 
