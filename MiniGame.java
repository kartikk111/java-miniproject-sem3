//Java Program for Rock, Paper, Scissors and Coinflip

import java.util.*;
import java.lang.*;



    public class MiniGame {
        public static String generateComputerChoice(Random random) {

            int wordNumber = (random.nextInt(3) + 1);
            String computerChoice;


            if (wordNumber == 1) {
                computerChoice = "rock";
            } else if (wordNumber == 2) {
                computerChoice = "paper";
            } else
            {
                computerChoice = "scissors";
            }

            System.out.println("\nThe Computer has already made it's choice.");
            return computerChoice;

        }


        static String obtainUserChoice(Scanner sc) {
            String userWordChoice;
            System.out.println("Options to choose from:\n1.Rock\n2.Paper\n3.Scissors\n");
            userWordChoice = sc.nextLine();

            return userWordChoice;

        }


        static String chooseWinner(String computerChoice, String userChoice) {

            String winner = "No Winner";
            String customMessage = "Both choose same";
            String finalMessage;

            String rockMessage = "The rock destroys the scissor";
            String scissorsMessage = "Scissors cuts paper";
            String paperMessage = "Paper wraps rock";

            //Game logic

            if (computerChoice.equals("rock") && userChoice.equalsIgnoreCase("scissors")) {
                winner = "Computer";
                customMessage = rockMessage;
            } else if (userChoice.equalsIgnoreCase("rock") && computerChoice.equals("scissors")) {
                winner = "User";
                customMessage = rockMessage;
            }

            if (computerChoice.equals("scissors") && userChoice.equalsIgnoreCase("paper")) {
                winner = "Computer";
                customMessage = scissorsMessage;
            } else if (userChoice.equalsIgnoreCase("scissors") && computerChoice.equals("paper")) {
                winner = "User";
                customMessage = scissorsMessage;
            }

            if (computerChoice.equals("paper") && userChoice.equalsIgnoreCase("rock")) {
                winner = "Computer";
                customMessage = scissorsMessage;
            } else if (userChoice.equalsIgnoreCase("paper") && computerChoice.equals("rock")) {
                winner = "User";
                customMessage = paperMessage;
            }

            //Winner Logic for the game ends
            finalMessage = winner + " won ( " + customMessage + " )";

            return finalMessage;

        }

        public static void main( String [] args )
        {

            Random random = new Random();
            Scanner sc = new Scanner(System.in);
            String computerChoice;
            String userChoice;
            String winner;

            System.out.println("Enter 1 for coinflip and 2 for Rock-Paper-Scissors\n");
            int ch = sc.nextInt();

            switch(ch)
            {
                case 1: coinflip c1 = new coinflip();
                        c1.toss();
                        break;

                case 2: obtainUserChoice(sc);
                        computerChoice = generateComputerChoice(random);
                        userChoice = obtainUserChoice(sc);
                        winner = chooseWinner(computerChoice, userChoice );

                        System.out.println( "\nYou choose : " + userChoice + "\nComputer choose : " +computerChoice );
                        System.out.println(winner);
                        break;

                default:System.out.println("Invalid input");
                        break;

            }
        }
    }