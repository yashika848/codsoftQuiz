import java.util.Scanner;

public class Quizapplication {
    public static void main(String[] args) {
        String[] questions = {
            "What is the capital of india ?",
            "Which state is also known as the 'fruit bowl' of india ?",
            "Which is the national sport of india ?",
            "Which state is also known as 'land of rising sun ?",
            "name the national bird of india ?"
        };
          String[][] options={{"pune","New delhi","jaipur","srinagar"},{"Himachal pradesh","uttar pradesh","Tamil nadu","west bengal"},
          {"kho kho","cricket","Hockey","football"},{"uttarakhand","Arunachal pradesh","Assam","Goa"},{"peacock","crow","sparrow",
         " kingfisher"}
          };

       int[] answers = {1,0,2,1,0};

        int score = 0;
        int correctAnswers = 0;
        int incorrectAnswers = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for(int j=0; j< options[i].length; j++){
                System.out.println((j+1)+"."+options[i][j]);
            }

            long startTime = System.currentTimeMillis();
            int userAnswer = scanner.nextInt()-1;
            long endTime = System.currentTimeMillis();
            long timeTaken = endTime - startTime;

            if (timeTaken >= 20000) { 
                System.out.println("YOUR TIMER IS OVER! Quiz ended.");
                break;
            } else if (userAnswer==answers[i]) {
                System.out.println("Correct!");
                score++;
                correctAnswers++;
            } else {
                System.out.println("Incorrect. The correct answer is " +options[i][answers[i]]);
                incorrectAnswers++;
            }
        }

        System.out.println("Your final score is " + score + "/" + questions.length);
        System.out.println("Correct answers: " + correctAnswers);
        System.out.println("Incorrect answers: " + incorrectAnswers);
    }
}