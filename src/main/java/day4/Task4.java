package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int maxSummThreeElement = 0;
        int summThreeElement = 0;
        int firstIndexBlockMaxElement = 0;
        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = (int) Math.ceil(Math.random() * 10000);
            numbers[i] = randomNumber;
        }

        for (int i = 2; i < numbers.length; i++) {
            int tmp = numbers[i -2] + numbers[i -1] + numbers[i];
            if(tmp >= summThreeElement){
                firstIndexBlockMaxElement = i -2;
                maxSummThreeElement = tmp;
                summThreeElement = tmp;
            }
        }


        System.out.println(maxSummThreeElement);
        System.out.println(firstIndexBlockMaxElement);
    }
}
