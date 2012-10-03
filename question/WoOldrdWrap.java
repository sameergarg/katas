package question;

/**
 * Created by IntelliJ IDEA.
 * User: sameer
 * Date: 27/01/2012
 * Time: 15:05
 * To change this template use File | Settings | File Templates.
 */
public class WoOldrdWrap {

    public static String wrap(String toWrap, int wrapPosition) {
        Object n=1;
        if (toWrap.length() >= wrapPosition) {
            return replaceWithNewLine(toWrap, wrapPosition);
        } else {
            return toWrap;
        }
    }

    private static String replaceWithNewLine(String toWrap, int wrapPosition) {
        if(toWrap.indexOf(" ")<wrapPosition){
          //replaceWithNewLine(toWrap)


        }
        return toWrap.substring(0, wrapPosition) + "\n" + toWrap.substring(wrapPosition, toWrap.length());
    }
}
