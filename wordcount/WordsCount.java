package wordcount;

import java.util.LinkedList;
import java.util.List;

/**
 * Counts the words in list of string
 */
public class WordsCount {

    private String line;

    public WordsCount(String line) {
        this.line = line;
    }

    public int countWord(){
        if(line.trim().equals("")){
            return 0;
        }
        return line.split("(\\s|\\p{Punct})+").length;
    }
}

