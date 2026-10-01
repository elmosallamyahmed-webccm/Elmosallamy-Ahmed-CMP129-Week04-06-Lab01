import java.util.Random;
public class Lottery {
    public static int[] lotteryNum = new int [20];
    
    public static void randomLottery(int[] lotteryNum){
        Random rand = new Random();
        int random;
        for(int i=0; i<lotteryNum.length; i++){;
            random = rand.nextInt(10);
            lotteryNum[i]=random;
        }
    }
    public static void main(String[] args) {
        randomLottery(lotteryNum);
        for(int i=0;i<lotteryNum.length;i++){
            System.out.println(lotteryNum[i]);
        }
    }
}
