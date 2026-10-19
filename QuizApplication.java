
import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "Which language is used for Android development?",
            "Which data structure follows FIFO?",
            "What is the time complexity of binary search?",
            "Which keyword creates an object in Java?",
            "Which collection stores unique elements?"
        };

        String[][] options = {
            {"1. Java", "2. HTML", "3. CSS", "4. SQL"},
            {"1. Stack", "2. Queue", "3. Tree", "4. Graph"},
            {"1. O(n)", "2. O(n^2)", "3. O(log n)", "4. O(1)"},
            {"1. class", "2. void", "3. new", "4. static"},
            {"1. ArrayList", "2. HashSet", "3. Array", "4. String"}
        };

        int[] answers = {1, 2, 3, 3, 2};
        int score = 0;

        System.out.println("===== JAVA QUIZ APPLICATION =====");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\nQ" + (i + 1) + ". " + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (1-4): ");
            int choice = sc.nextInt();

            if (choice == answers[i]) {
                System.out.println("Correct answer!");
                score++;
            } else {
                System.out.println("Wrong answer!");
            }
        }

        System.out.println("\n===== QUIZ RESULT =====");
        System.out.println("Your score: " + score + "/" + questions.length);
        System.out.println("Percentage: "
                + (score * 100.0 / questions.length) + "%");

        sc.close();
    }
}
