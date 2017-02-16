package labWork_2_15_4and5;

import java.util.*;

/**
 * Created by Bulik on 25.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyNumGenerator myNumGenerator =new MyNumGenerator(12, 10);///1 > 2

        // LabWork 2 15 4
        List list = myNumGenerator.generate();
        System.out.println(list);
        System.out.println("********************************************");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("********************************************");
        Collections.sort(list, new Comparator<Integer>() {// Для сортіровки по уменшенню
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2){
                    return -1;
                }
                if (o1< o2){
                    return 1;
                }
                return 0;
            }
        });
        System.out.println(list);
        //LabWork 2_15_5
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        Set set = myNumGenerator.generateDistinct();
        System.out.println(set);

    }
}
