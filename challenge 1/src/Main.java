import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        String question = "What color is the sky?";
        String choiceOne = "green";
        String choiceTwo = "dark green";
        String choiceThree = "blue";

        String correctAnswer = choiceThree;

        System.out.println(question);
        System.out.println("Option 1: " + choiceOne);
        System.out.println("Option 2: " + choiceTwo);
        System.out.println("Option 3: " + choiceThree);
        System.out.println("Your answer: ");

        Scanner input = new Scanner(System.in);
        String userInput = input.next();

        // toLowerCase() converts any input to lower case
        // it doesn't matter how the answer is entered: blue, BLUE, BlUe, etc.
        if (correctAnswer.equals(userInput.toLowerCase())) {
            System.out.println("Congrats, you got the right answer!");
        }
        else {
            System.out.println("Nope, wrong, ya weirdo." + " The correct answer is: " + choiceThree);
        }
    }
}
