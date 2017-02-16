package labWork_2_15_4and5;

import java.util.*;

/**
 * Created by Bulik on 25.08.2016.
 */
public class MyNumGenerator {
    private int numOfElm ;
   private int maxNumb ;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }
    public List generate(){
        List list = new ArrayList(numOfElm);
        Random random = new Random();
        for (int i = 0; i<numOfElm; i++){
            list.add(random.nextInt(maxNumb));
        }
        return list;

    }
    public Set generateDistinct(){
        if (maxNumb<numOfElm){
            System.out.println("Invalid parameters! ");
            return null;
        }
        Set set = new HashSet();
        Random random = new Random();

        for (int i = 0; i<numOfElm; i++){
           if( !set.add(random.nextInt(maxNumb))){
               i--;
           }
        }
        return set;
    }


}
