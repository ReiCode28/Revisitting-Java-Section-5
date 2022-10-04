public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}

/*If i wanted to only print the even numbers from 0 - 10
 then i can use the above code. The "continue" keyword will
 skip all of the odd numbers and only print the even numbers
 */

 /*
  * Break keyword completely breaks the loop
  */
