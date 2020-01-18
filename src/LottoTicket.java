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

/*
import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args){

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers(){

        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for(int i=0; i< LENGTH; i++){
            int randomNumber;

            /*
            Generate random number then search to make sure it doesn't
            already exist in the array. If it does, regenerate and search again.
             */
      /*      do{
        randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
    }while(search(ticket, randomNumber));

    //Number is unique if we get here. Add it to the array.
    ticket[i] = randomNumber;
}

        return ticket;
                }

public static boolean search(int[] array, int numberToSearchFor){

        /*This is called an enhanced loop.
          It iterates through 'array' and
          each time assigns the current element to 'value'
         */
  /*      for(int value : array){
        if(value == numberToSearchFor){
        return true;
        }
        }

        /*If we've reached this point, then the entire array was searched
          and the value was not found
         */
   /*     return false;
        }

public static boolean binarySearch(int[] array, int numberToSearchFor){

        //Array must be sorted first
        Arrays.sort(array);

        int index = Arrays.binarySearch(array, numberToSearchFor);
        if(index >= 0){
        return true;
        }
        else return false;

        }

public static void printTicket(int ticket[]){
        for(int i=0; i<LENGTH; i++){
        System.out.print(ticket[i] + " | ");
        }
        }
        }
        */
