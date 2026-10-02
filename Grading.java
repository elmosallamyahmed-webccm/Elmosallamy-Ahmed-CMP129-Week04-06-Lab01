import java.util.Scanner;
public class Grading {
    private static final String[] correctAnswers = {"A","D","B","B","C","B","A","B","C","D","A","C","D","B","D","C","C","A","D","B"};
    private static String[] studentAnswers = new String[20];
    private static String[] incorrectQuestions = new String[20];
    private static int rightAnswers = 0;
    private static int wrongAnswers = 0;
    public static void getCurrentTestGrade()
    {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < studentAnswers.length; i++)
        {
            System.out.print("Enter answer for question " + (i + 1) + ": ");
            String answer = input.next().toUpperCase();
            while(!answer.equals("A") && !answer.equals("B") && !answer.equals("C") && !answer.equals("D"))
            {
                System.out.print("Invalid answer. Enter A, B, C, or D: ");
                answer = input.next().toUpperCase();
            }
            studentAnswers[i] = answer;
        }
        input.close();
    }
    public static void compareTestGrade(){
        for(int i=0;i<studentAnswers.length;i++){
            if(studentAnswers[i].equals(correctAnswers[i]))
            {
                rightAnswers++;
            }
            else
            {
                incorrectQuestions[wrongAnswers] = String.valueOf(i + 1);
                wrongAnswers++;
            }
        }
    }
    public static void displayGrade()
    {
        System.out.println("Grade: " + rightAnswers + "/20");
        System.out.println("Wrong Answers: " + wrongAnswers + "/20");
        if(rightAnswers >= 15)
        {
            System.out.println("Result: PASS");
        }
        else
        {
            System.out.println("Result: FAIL");
        }
        System.out.println("Questions answered incorrectly: ");
        if(wrongAnswers == 0)
        {
            System.out.println("None");
        }
        else
        {
            for(int i = 0; i < wrongAnswers; i++)
            {
                System.out.print("Question #" + incorrectQuestions[i] + "\n");
            }
            System.out.println();      
        }
    }
    public static void gradeTest()
    {
        getCurrentTestGrade();
        compareTestGrade();
        displayGrade();
    }
    public static void main(String[] args) {
        gradeTest();
    }
}

