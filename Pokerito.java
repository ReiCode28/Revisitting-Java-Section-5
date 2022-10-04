import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Want to play Pokerito? \nType yes or no ");
        String ready = scan.nextLine();
        if (ready.equals("yes")) {
            System.out.println("\nGreat! Here are the rules: \n");
            instructions();
            scan.nextLine();
        } else if (ready.equals("no")){
            System.out.println("Okay, maybe next time.");
        } else {
            System.out.println("Invalid option, try again!");
        }
        
        String yourCard = randomCard();
        String computerCard = randomCard();

        System.out.println("\nHere's your card: ");
        System.out.println(yourCard);
        System.out.println("\nHere's the computer's card: ");
        System.out.println(computerCard);
        

        int yourMatches = 0;
        int computerMatches =0;

        System.out.println("\nNow the dealer will draw five cards. Press enter to continue");
        
        for (int i = 1; i <= 5; i++){
            scan.nextLine();
            String draw = randomCard();
            System.out.println("Card: " + i);
            System.out.println(draw);

            if (yourCard == draw){
                yourMatches++;
            } else if(computerCard == draw) {
                computerMatches++;
            }
        }
        System.out.println("Your number of matches is: " + yourMatches);
        System.out.println("The computer's number of matches is: " + computerMatches);

        if (yourMatches > computerMatches){
            System.out.println("You win!");
        } else if (computerMatches > yourMatches){
            System.out.println("The computer wins!");
        } else if (yourMatches == computerMatches){
            System.out.println("Everyone Wins!");
        }

        
        /** Task 5 - Get the winner
         * 
         * • Count your number of matches.
         * • Count the computer's number of matches.
         * • print: Your number of matches: <yourMatches>
         * • print: Computer number of matches:  <computerMatches>
         * 
         * • If you have more matches, print: You win!. 
         * • If the computer has more matches, print: The computer wins! 
         * • If the matches are equal, print: everyone wins!.
         */

         scan.close();
    }

    /** Task 1
     * 
     * Function name – randomCard
     * @return (String)
     * 
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card that matches the random number (get the String values from cards.text).   
     */
    public static String randomCard(){
        double randomNumber = Math.random() * 13;
        randomNumber = randomNumber + 1;
        int randomInt = (int)randomNumber;

        switch (randomInt){
        case 1: return 
                   "   _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n";
          
        case 2: return 
               
                    "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
                  
        case 3: return
                  "   _____\n" +
                  "  |3    |\n"+
                  "  | o o |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____E|\n";

        case 4: return
                   "   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";

        case 5: return
                    "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";

        case 6: return
                    "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";

        case 7: return
                    "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
          
        case 8: return
                    "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
             
        case 9: return
                    "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";

        case 10: return
                    "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
            
        case 11: return
                    "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
            
        case 12: return
                    "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
              
        case 13: return
                    "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
        default: return "This shouldn't get called";
        }
    }

     public static void instructions(){
        System.out.println("""
            It's like Poker, but a lot simpler.
            - There are two players, you and the computer.
            - The dealer will give each player one card.
            - Then, the dealer will draw five cards (the river)
            - The player with the most river matches wins!
            - If the matches are equal, everyone's a winner!
            - Ready? Press Enter to continue.
                """);
     }

}
