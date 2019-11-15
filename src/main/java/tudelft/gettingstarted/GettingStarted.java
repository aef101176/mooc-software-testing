/*
*  We see that:

    The very first line @Test, indicates that the following method is a JUnit test. JUnit is the framework we are gonna dive into later.
    The method name already explains what we want to test.
    The body of this test method then invokes the function we want to test (addFive()), passing the number 20 to it.
    Given this input, the expected output should then be 25. so we assert that our result is equal to 25 (using the Assertions.assertEquals() method). If the result is not equal to 25, we expect this test to fail.

*
* */

package tudelft.gettingstarted;

public class GettingStarted {
    public int addFive (int number) {
        return number + 5;
    }
}
