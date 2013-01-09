package stringcalculator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 28/12/2012
 * Time: 14:29
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {

    public static final String DEFAULT_DELIMITERS = "[,\\n]";
    public static final String END_OF_CUSTOM_DELIMITER = "\\n";
    public static final String BEGIN_OF_CUSTOM_DELIMITER = "//";

    public static int sum(String numbersToAdd) {
        int sum = 0;
        if(numbersToAdd.length()==0){
            return sum;
        }

        String delimitersRegex = DEFAULT_DELIMITERS;
        if(differentDelimitersSpecified(numbersToAdd)){
            int delimiterEndIndex = numbersToAdd.indexOf(END_OF_CUSTOM_DELIMITER);
            delimitersRegex = numbersToAdd.substring(BEGIN_OF_CUSTOM_DELIMITER.length(), delimiterEndIndex);
            numbersToAdd = numbersToAdd.substring(delimiterEndIndex+END_OF_CUSTOM_DELIMITER.length(),numbersToAdd.length());
        }

        String[] numbers = numbersToAdd.split(delimitersRegex+"+");

        List<Integer> negativeNumbers = new ArrayList<Integer>();

        for(String numberAsString:numbers){
            int number = Integer.parseInt(numberAsString);
            if(number<0){
                negativeNumbers.add(number);
            }else if (number<=1000){
                sum += number;
            }
        }

        if(negativeNumbers.size()>0){
            throw new IllegalArgumentException("Detected negative numbers "+negativeNumbers+". Negative numbers are not allowed");
        }

        return sum;


    }

    private static boolean differentDelimitersSpecified(String containingDelimitedNumbersToAdd) {
        return containingDelimitedNumbersToAdd.startsWith(BEGIN_OF_CUSTOM_DELIMITER);
    }

    private static List<Integer> filterNegatives(List<String> allNumbers){
        List<Integer> negativeNumbers = new ArrayList<Integer>();
        for(String numberAsString:allNumbers){
            int number = Integer.parseInt(numberAsString);
            if(number<0){
                negativeNumbers.add(number);
            }
        }

        return negativeNumbers;
    }
}
