package task4;

import java.util.Map;

public class Translate {
    private Map<String, String> dictionary;

    public Translate() {
        this.dictionary = dictionary;
    }
    public void addTrans (String english, String russian){
        dictionary.put(english, russian);
    }
    public void findTrans (String english){
        dictionary.getOrDefault(english, "Not found");
    }

}
