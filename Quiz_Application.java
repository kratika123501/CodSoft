import java.util.Scanner;

public class Quiz_Application {
        String[] questions = {
                "What is the capital of Madhya Pradesh?" ,
                "Which language is used for Android Development?" ,
                "What is 8 + 9?" ,
                "What is the color of sea water?"
        };

        String [][] options = {
                {"a) Bhopal", "b) Delhi", "c) Chandigarh", "d) Mumbai" },
                {"a) Java", "b) Swift", "c) Python", "d) C#" },
                {"a) 25", "b) 19", "c) 17", "d) 17" },
                {"a) Red", "b) Blue", "c) Green", "d) Yellow" }
        };

        char[] answers = {'b', 'a', 'd', 'b'};

        int score = 0;
        Scanner scanner = new Scanner(System.in);

        public void startQuiz(){
            for (int i = 0; i < questions.length; i++){
                QuizQuestions(i);
            }
            displayResult();
        }

        private void QuizQuestions(int questionIndex){
            System.out.println(questions[questionIndex]);
            for (String option : options[questionIndex]){
                System.out.println(option);
            }

            long startTime = System.currentTimeMillis();
            System.out.println("Your answer (a/b/c/d) : ");
            char userAnswer = scanner.next().charAt(0);

            if (System.currentTimeMillis() - startTime > 10000){
                System.out.println("Time is up! Moving to the next question");
                return;
            }

            if (userAnswer == answers[questionIndex]){
                score++;
            }
        }

        private void displayResult(){
            System.out.println("Quiz Finished!");
            System.out.println("Your Score is : " + score + "/" + questions.length);

            for (int i = 0; i< questions.length; i++){
                System.out.println(questions[i]);
                System.out.println("Correct Answer: " + answers[i]);
            }
        }

    public static void main(String[] args) {
        Quiz_Application quiz = new Quiz_Application();
        quiz.startQuiz();
    }
}