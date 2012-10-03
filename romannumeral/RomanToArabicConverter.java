package romannumeral;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 10/07/2012
 * Time: 12:25
 * To change this template use File | Settings | File Templates.
 */
public class RomanToArabicConverter {
    private enum Roman {I(1),IV(4),V(5),IX(9),X(10),XL(40),L(50),XC(90),C(100);
        private int arabic;

        private Roman(int i) {
            this.arabic = i;
        }

        public static Roman romanForArabic(int arabic){
            Roman match = null;
            for(Roman roman:values()){
                if(roman.getArabic()==arabic){
                    match = roman;
                    break;
                }
            }

            if(match!=null){
                return match;
            } else{
                throw new IllegalArgumentException("no roman defined for "+arabic);
            }
        }

        public int getArabic() {
            return arabic;
        }
    };

    public int convertToRoman(String roman) {
        int arabic = 0;
        while(roman.length()>0){
            boolean match = false;
            for(Roman romanEnum:Roman.values()){
                if(roman.endsWith(romanEnum.name())){
                    arabic +=romanEnum.getArabic();
                    roman=roman.substring(0,roman.lastIndexOf(romanEnum.name()));
                    match = true;
                    break;
                }
            }
            if(!match){
                throw new IllegalArgumentException("pattern not a valid roman or is not supported");

            }

        }
        return arabic;
    }
}
