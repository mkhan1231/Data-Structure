package knowRandom;

import java.util.Random;

public class DemoRandom1 {
    public static void main(String[] args) {
        Random rand1 = new Random();
        System.out.println(rand1.nextInt(40));		//will only pick a random number from 0 to 39 inclusively.
        System.out.println(rand1.getClass().getName());

        Random rand2 = new Random();
        int pickedNumber1 = rand2.nextInt(40) + 1;	//will pick number between 1 to 40 inclusively
        System.out.println(pickedNumber1);


        Random rand3 = new Random();
        int pickedNumber2 = rand3.nextInt(31) + 5;	//will pick a number from 5 to 35 inclusively
        System.out.println(pickedNumber2);			//the upper limit number will be 35-5+1=31 and 5 needs to be added to the result

        Random ran4 = new Random();					//Will generate and print 10 random numbers from 0 to 99
        for (int i = 0; i< 10; i++){
            int pickedNumber3 = ran4.nextInt(100);
            System.out.println("Random No : " + pickedNumber3);
        }

    }
}
