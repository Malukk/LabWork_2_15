package labWork_2_15_2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Bulik on 23.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<String > list = new LinkedList<>();
        //Random random = new Random()
        for ( int i = 0; i<10; i++){
            int index = (int)(Math.random() * (list.size()+1)) ;
            list.add(index, "num_" + i);

        }
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
