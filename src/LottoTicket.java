import java.util.Arrays;
import java.util.Random;

public class LottoTicket {

    private static final int MAX_NUMBERS = 6;
    private static final int TOTAL_NUMBERS = 49;

    public static void main(String[] args) {

        int[] lottoTicket = generateNumbers();
        Arrays.sort(lottoTicket);
        printLottoTicket(lottoTicket);

    }

    public static int[] generateNumbers(){

        int[] lottoTicket = new int[MAX_NUMBERS];

        Random random = new Random();

        for (int i=0; i<MAX_NUMBERS; i++) {

            int randomNumber;

            do {

                randomNumber = random.nextInt(TOTAL_NUMBERS) +1;

            } while (search(lottoTicket, randomNumber));

            lottoTicket[i] = randomNumber;
        }

        return lottoTicket;
    }

    public static boolean search(int[] array, int numberToSearchFor) {
        for (int value : array) {
            if (value == numberToSearchFor) {
                return true;
            }
        }
        return false;
    }

    public static void printLottoTicket(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " | ");
        }
    }
}