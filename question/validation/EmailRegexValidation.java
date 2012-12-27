package question.validation;


public class EmailRegexValidation {
    private static final String REGEX_EMAIL_ADDRESS="[A-Za-z0-9._]+@[A-Za-z0-9_.]+\\.[A-Za-z]{2,4}";
    
    public boolean validate(String emailAddress) {
        return emailAddress.matches(REGEX_EMAIL_ADDRESS);
    }
}
