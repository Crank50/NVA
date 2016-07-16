package Game.Util;

import java.util.Random;

/**
 * Created by Justin on 7/11/16.
 */
public class RandInt {


    // a public method returning an int and receving a max and min int
    public static int randomInt(int min, int max) {
        // my constructors
        Random random = new Random(System.currentTimeMillis());
        int randomNumber = random.nextInt((max - min) + 1) + min;
        return randomNumber;
    }
}

    //public static void main(String[] args) {

     //   System.out.println(randomInt(1, 100));
    //}





    /*}
    public static int randomInt2 (int max, int min) {
        Random random = new Random(System.currentTimeMillis());
        int randomNumber = random.nextInt((max - min) + 1) + min;
        if (randomNumber < 0) ;
        return randomInt(0,0);
    } else
        return randomInt2(1, 200);


}*/







