import java.util.Random;
import java.util.Scanner;
public class Lottery {
    public static int[] lotteryNum = new int [5];
    public static int[] userNum = new int [5];
    public static void randomLottery(int[] lotteryNum){
        Random rand = new Random();
        int random;
        for(int i=0; i<lotteryNum.length; i++){;
            random = rand.nextInt(10);
            lotteryNum[i]=random;
        }
    }
    public static void getUser(int[] userNum){
        Scanner hi =new Scanner(System.in);
        for(int i=0; i<userNum.length;i++){
            System.out.print("What is your guess for slot number  "+(i+1)+"?  ");
            userNum[i]=hi.nextInt();
            System.out.println();
        }
        hi.close();
    }
    public static int compare(int[] lotteryNum, int[] userNum){
        int correctGuesses = 0;
        for(int i =0; i<lotteryNum.length; i++){
            if(lotteryNum[i]==userNum[i]){
                correctGuesses++;
            }
        }
        return correctGuesses;
    }
    public static void display(int[] lotteryNum,int[] userNum, int correctGuesses){
        System.out.println("The random lottery numbers are...");
        for(int i=0;i<lotteryNum.length;i++){
            System.out.print(lotteryNum[i]+"    ");
        }
        System.out.println();
        System.out.println("Your gueses are as follows...");
        for(int i=0; i<userNum.length;i++){
            System.out.print(userNum[i]+"   ");
        }
        System.out.println();
        System.out.println("You got " + correctGuesses + " guess(es) correct.");
        if(correctGuesses==lotteryNum.length){
            System.out.println("Congradulations! You win!");
        }else{
            System.out.println("YOU LOSE");
        }
    }
    public static void runSim(){
        randomLottery(lotteryNum);
        for(int i=0;i<lotteryNum.length;i++){
            System.out.print(lotteryNum[i]+"    ");
        }
        System.out.println("This is only to show the lottery to be able to prove when all guesses are correct the user winss");
        System.out.println();
        getUser(userNum);
        int correctGuesses=compare(lotteryNum, userNum);
        display(lotteryNum, userNum, correctGuesses);
    }
    public static void main(String[] args) {
        runSim();
    }
}
