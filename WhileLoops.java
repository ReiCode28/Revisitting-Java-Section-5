public class WhileLoops {
    public static void main(String[] args) {
        double choice = 0.01;
        double guess = 0.99;

        while (guess > choice){
            guess = Math.random();
            System.out.println(guess);
        }

        
    }
}

// Use for loops when you know how many times a code should run
// Use a while loop if it is not clear how many times a code should run
