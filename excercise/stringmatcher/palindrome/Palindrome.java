package stringmatcher.palindrome;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 10/07/2012
 * Time: 17:44
 * To change this template use File | Settings | File Templates.
 */
public class Palindrome {

    public boolean isPalindrome(String toCheck) {
        if(toCheck==null){
            throw new IllegalArgumentException("palindrome can't be checked on null string");
        }

        for(int i=0;i< toCheck.length()/2;i++){
           if(toCheck.charAt(i)!=toCheck.charAt((toCheck.length()-1)-i)){
               return false;
           }
        }
        return true;
    }
}
