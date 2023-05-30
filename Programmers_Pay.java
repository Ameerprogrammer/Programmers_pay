//Ameer Ahmed

import java.util.ArrayList;

public class Transcription {
    public static int programmers(int one, int two, int three) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);

        int lowest = list.get(0);
        int highest = list.get(0);

        for(Integer looper : list) {
            if(looper > highest) {
                highest = looper;

            }
            if (looper < lowest) {
                lowest = looper;
            }
        }
        return highest - lowest;
    }

    public static void main (String[] args) {
            System.out.println("Output: " + programmers(147,33,526));
    }
}