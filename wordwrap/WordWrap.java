package wordwrap;

/**
 * Wraps the word for the specified position
 */
public class WordWrap {

    public static String wrap(String toWrap, int wrapPosition) {
        if (wrapPosition < toWrap.length()) {
            int firstWrapPosition;
            if(wrapWord(toWrap, wrapPosition).contains(" ")){
                firstWrapPosition= wrapWord(toWrap, wrapPosition).lastIndexOf(' ');
            }else {
                firstWrapPosition = wrapPosition;
            }

            return wrapWord(toWrap, firstWrapPosition).trim()+"/n" + WordWrap.wrap(residualWord(toWrap, firstWrapPosition).trim(), wrapPosition);
        } else {
            return toWrap;
        }
    }

    public static String wrap2(String toWrap, int wrapPosition) {
        if(toWrap.length()<=wrapPosition){
            return toWrap;
        }else{
            String wrappedWord = wrapWord(toWrap, wrapPosition);
            String residualWord = wrap2(residualWord(toWrap, wrappedWord.length()), wrapPosition);
            return wrappedWord +"/n"+ residualWord;
        }
    }

    private static String wrapWord(String toWrap, int wrapPosition) {

        String wrappedWord  = toWrap.substring(0, wrapPosition);

        if(wrappedWord.contains(" ") && toWrap.indexOf(" ")<wrapPosition-1){
            return toWrap.substring(0,toWrap.lastIndexOf(" "));
        }else{
            return toWrap.substring(0, wrapPosition);
        }

    }

    private static String residualWord(String toWrap, int startPosition) {
        return toWrap.substring(startPosition,toWrap.length()).trim();
    }
}
