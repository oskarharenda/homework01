package oskarharenda;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {
    public static void main(String[] args) {
        int sum =0;
        for (Map.Entry<Integer, Integer> entry : checkRand(500000,10).entrySet()) {
            Integer key= entry.getKey();
            Integer value = entry.getValue();
            sum+=value;
            System.out.println(key+" "+value);
        }
        System.out.println(sum);
    }

    public static Map<Integer, Integer> checkRand(int amount, int interval){
        Map<Integer,Integer> randomNumbers = new HashMap<>();
        Random r = new Random(interval);
        int[] counter = new int [interval];
        for(int i=0; i<counter.length; i++){
            counter[i]=1;
        }
        for(int i=0; i<amount; i++){
            int rand=r.nextInt(interval);
            randomNumbers.put(rand,counter[rand]++);
        }
        return  randomNumbers;
    }
}
