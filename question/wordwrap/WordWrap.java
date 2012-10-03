package question.wordwrap;

/**
 * Wraps the word for the specified position
 */
public class WordWrap {

    public static String wrap(String toWrap, int wrapPosition) {
        if (wrapPosition < toWrap.length()) {
            int firstWrapPosition;
            if(toWrap.substring(0, wrapPosition).contains(" ")){
                firstWrapPosition=toWrap.substring(0, wrapPosition).lastIndexOf(' ');
            }else {
                firstWrapPosition = wrapPosition;
            }

            return toWrap.substring(0, firstWrapPosition).trim()+"/n" + WordWrap.wrap(toWrap.substring(firstWrapPosition, toWrap.length()).trim(),wrapPosition);
        } else {
            return toWrap;
        }
    }
}
