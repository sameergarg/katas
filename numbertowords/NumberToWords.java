package numbertowords;

/**
 * User: sameer
 * Date: 07/05/2013
 * Time: 09:42
 */
public class NumberToWords {

    public String toWords(int i) {

        if(i==1){
            return "one";
        } else if(i==2){
            return "two";
        }

        return "";
    }
}
