package question;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: sameer
 * Date: 25/01/2012
 * Time: 22:27
 * To change this template use File | Settings | File Templates.
 */
public final class ImmutableEmployee {
    
    private final String name;
    
    private final Date dateOfBirth;
    
    private int age;

    public ImmutableEmployee(String name, Date dateOfBirth, int age) {
        this.name = name;
        this.dateOfBirth = new Date(dateOfBirth.getTime());
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return age;
    }
}
