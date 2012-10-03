package question.validation;

/**
 * Created by IntelliJ IDEA.
 * User: sameer
 * Date: 26/01/2012
 * Time: 14:57
 * To change this template use File | Settings | File Templates.
 */
public class EmailRegexValidation {
    private static final String REGEX_EMAIL_ADDRESS="[A-Za-z0-9._]+@[A-Za-z0-9_.]+\\.[A-Za-z]{2,4}";
    
    public boolean validate(String emailAddress) {
        return emailAddress.matches(REGEX_EMAIL_ADDRESS);
    }
}
