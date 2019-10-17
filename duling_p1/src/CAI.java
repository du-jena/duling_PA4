import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Random;

public class CAI {
    public static void main (String[] args){
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();

        double answer;
        double userAnswer;

        int difficulty;
        int problem;

        int comment;
        int i;

        int numCorrect = 0;
        int numFalse = 0;
        double avg;

        String session;

        do {
            System.out.println("Welcome to CAI!");
            session = "start";

            difficulty = difficultyLevel();
            problem = problemType();

            for (i = 0; i < 10; ++i) {
                answer = mathProblem(difficulty, problem);
                userAnswer = scnr.nextDouble();

                if (userAnswer == answer) {
                    numCorrect = numCorrect + 1;
                    comment = rand.nextInt(5 - 1) + 1;
                    switch (comment) {
                        case 1:
                            System.out.println("Very good!");
                            break;
                        case 2:
                            System.out.println("Excellent!");
                            break;
                        case 3:
                            System.out.println("Nice Work!");
                            break;
                        case 4:
                            System.out.println("Keep up the good work!");
                            break;
                        default:
                            break;
                    }
                }
                else {
                    numFalse = numFalse + 1;
                    comment = rand.nextInt(5 - 1) + 1;
                    switch (comment) {
                        case 1:
                            System.out.println("No. Please try again.");
                            break;
                        case 2:
                            System.out.println("Wrong. Try once more.");
                            break;
                        case 3:
                            System.out.println("Don't give up!");
                            break;
                        case 4:
                            System.out.println("No. Keep trying.");
                            break;
                        default:
                            break;
                    }
                }
            }

            avg = (numCorrect / 10.0) * 100;

            if (avg < 75) {
                System.out.println("Number correct: " + numCorrect);
                System.out.println("Number incorrect: " + numFalse);
                System.out.println("Please ask your teacher for extra help.");
                System.out.println();
            }
            else {
                System.out.println("Number correct: " + numCorrect);
                System.out.println("Number incorrect: " + numFalse);
                System.out.println("Congratulations, you are ready to go to the next level!");
                System.out.println();
            }

            numCorrect = 0;
            numFalse = 0;

            while (!session.equals("yes")){
                System.out.println("Would you like to begin a new session? yes/no");
                session = scnr.next();
                if (session.equals("no")){
                    System.out.println("Thank you for playing!");
                    break;
                }
            }

        } while (session.equals("yes"));

    }

    private static double mathProblem(int difficulty, int problem) {
        SecureRandom secRan = new SecureRandom();
        Random rand = new Random();

        int num1 = 0;
        int num2 = 0;
        double solution = 0;
        int randType;

        if (difficulty == 1){
            num1 = secRan.nextInt(10 - 1) + 1;
            num2 = secRan.nextInt(10 - 1) + 1;
        }
        else if (difficulty == 2){
            num1 = secRan.nextInt(100 - 1) + 1;
            num2 = secRan.nextInt(100 - 1) + 1;
        }
        else if (difficulty == 3){
            num1 = secRan.nextInt(1000 - 1) + 1;
            num2 = secRan.nextInt(1000 - 1) + 1;
        }
        else if (difficulty == 4){
            num1 = secRan.nextInt(10000 - 1) + 1;
            num2 = secRan.nextInt(10000 - 1) + 1;
        }


        if (problem == 1){
            solution = num1 + num2;
            System.out.println("How much is " + num1 + " plus " + num2 + "?");
        }
        else if (problem == 2){
            solution = num1 * num2;
            System.out.println("How much is " + num1 + " times " + num2 + "?");
        }
        else if (problem == 3){
            solution = num1 - num2;
            System.out.println("How much is " + num1 + " subtracted by " + num2 + "?");
        }
        else if (problem == 4){
            solution = ((double) num1) / num2;
            System.out.println("How much is " + num1 + " divided by " + num2 + "?");
        }
        else if (problem == 5){
            randType = rand.nextInt(5 - 1) + 1;
            switch (randType) {
                case 1:
                    solution = num1 + num2;
                    System.out.println("How much is " + num1 + " plus " + num2 + "?");
                    break;
                case 2:
                    solution = num1 * num2;
                    System.out.println("How much is " + num1 + " times " + num2 + "?");
                    break;
                case 3:
                    solution = num1 - num2;
                    System.out.println("How much is " + num1 + " subtracted by " + num2 + "?");
                    break;
                case 4:
                    solution = ((double) num1) / num2;
                    System.out.println("How much is " + num1 + " divided by " + num2 + "?");
                    break;
                default:
                    break;
            }
        }

        return solution;
    }

    private static int difficultyLevel(){
        Scanner scnr = new Scanner(System.in);
        int difficultyNum = 0;

        System.out.println("What would you like the difficulty level to be?");
        System.out.println("1 - Single Digit Numbers");
        System.out.println("2 - Two Digit Numbers");
        System.out.println("3 - Three Digit Numbers");
        System.out.println("4 - Four Digit Numbers");
        System.out.println();

        while (difficultyNum < 1 || difficultyNum > 4){
            System.out.println("Please enter a number between 1-4:");
            difficultyNum = scnr.nextInt();
            System.out.println();
        }

        return difficultyNum;
    }

    private static int problemType(){
        Scanner scnr = new Scanner(System.in);
        int problemNum = 0;

        System.out.println("What type of problems would you like to solve?");
        System.out.println("1 - Addition only");
        System.out.println("2 - Multiplication only");
        System.out.println("3 - Subtraction only");
        System.out.println("4 - Division only");
        System.out.println("5 - Random");
        System.out.println();

        while (problemNum < 1 || problemNum > 5){
            System.out.println("Please enter a number between 1-5:");
            problemNum = scnr.nextInt();
            System.out.println();
        }

        return problemNum;
    }
}
