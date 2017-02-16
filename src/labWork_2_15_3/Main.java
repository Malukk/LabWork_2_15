package labWork_2_15_3;

import java.util.*;

/**
 * Created by Bulik on 23.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list_1 =new ArrayList<>();
        List<String> list_2 =new LinkedList<>();

        for (int i =0; i<=10; i++){
            list_1.add("num_" + i);
            list_2.add("num_" + i + "X");

        }

        printElements(list_1);
        printElements(list_2);

        Random random = new Random();

        Iterator<String> iterator = list_1.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            int pos = random.nextInt(list_2.size()+1);
            list_2.add(pos, str);
        }
        System.out.println("*******************************************************");
        System.out.println(list_2);

        ListIterator<String> iterList = list_1.listIterator(list_1.size());
        while (iterList.hasPrevious()){
            list_2.add(iterList.previous());

        }
        System.out.println("***********************************************************");
        System.out.println(list_2);


    }
    public static void printElements(List<String> list){
        System.out.println(list);
    }
}
