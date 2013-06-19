package stringreverse;

public class RecursiveStringReverse {

    public String reverse(String toReverse) {
        if(toReverse.length()<=1){
            return toReverse;
        }

        char firstCharacter = toReverse.charAt(0);
        String allButStartingCharacter = toReverse.substring(1);
        return reverse(allButStartingCharacter)+ firstCharacter;
    }
}
