
public class Main {

    public static int maximumAmountRobbed(int[] array){
        int amount_1 = 0, amount_2 = 0;
        for(int iterator = 0 ; iterator < array.length ; iterator++){
            amount_1 += (iterator % 2 == 0) ? array[iterator] : 0;
            amount_2 += (iterator % 2 != 0) ? array[iterator] : 0;
        }
        return Math.max(amount_1, amount_2);
    }

    public static void main(String[] args) {
        System.out.println(maximumAmountRobbed(new int[]{2,7,9,3,1}));
    }
}