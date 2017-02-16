package labWork_2_15_6;

import java.util.HashMap;

/**
 * Created by Bulik on 25.08.2016.
 */
public class MyTranslator {
    private HashMap<String, String> dictionary;

    public MyTranslator() {
        this.dictionary = new HashMap<>();
    }
    public void addNewWord(String en, String ru){
        dictionary.put(en, ru);
    }
    public String translate(String en){
        return dictionary.get(en);
    }

    public HashMap<String, String> getDictionary() {
        return dictionary;
    }
}
