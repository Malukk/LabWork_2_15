package labWork_2_15_6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Bulik on 25.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyTranslator translator = new MyTranslator();
        translator.addNewWord("cat", "кот");
        translator.addNewWord("caught", "поймал");
        translator.addNewWord("mouse", "мышь");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String []words = str.split(" ");
        for (String word : words){
            System.out.print(translator.translate(word) + " ");
            System.out.println();
        }
        System.out.println("***********************************");
        HashMap<String, String> dist = translator.getDictionary();
        System.out.println(dist);

        Iterator<Map.Entry<String, String>> iterator = dist.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> element = iterator.next();
            System.out.println(element.getKey() + " -> " + element.getValue());
        }



    }
}
