package question.validation;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class EmailValidationTest {

    EmailRegexValidation emailValidation;

    @Before
    public void setup(){
        emailValidation = new EmailRegexValidation();
    }

    @Test
    public void shouldPassAsValidEmailAddress(){
        Assert.assertTrue(emailValidation.validate("garg.sameer@gmail.com"));
        MatcherAssert.assertThat(emailValidation.validate("sameer@yahoo.co.in"), Matchers.is(true));
        MatcherAssert.assertThat(emailValidation.validate("sameer_@yahoo.co.in"), Matchers.is(true));

    }

    @Test
    public void shouldDetectInvalidValidEmailAddress(){
        Assert.assertFalse(emailValidation.validate("garg.sameer@gmail.c"));
        Assert.assertFalse(emailValidation.validate("sameer@yahoo.co.indddj"));
        MatcherAssert.assertThat(emailValidation.validate("sameer@yahoo.co.inddd"), Matchers.equalTo(false));
    }
}
