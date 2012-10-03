package romannumeral;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 10/07/2012
 * Time: 08:00
 * To change this template use File | Settings | File Templates.
 */
public class ArabicToRomanConverter {

    private enum Roman {C(100),XC(90),L(50),XL(40),X(10),IX(9),V(5),IV(4),I(1);
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

    public String fromArabic(int toConvert) {
        StringBuilder romanStringBuilder = new StringBuilder();

        while(toConvert>0){
            for(Roman roman:Roman.values()){
                if(toConvert>=roman.getArabic()){
                    romanStringBuilder.append(roman);
                    toConvert-=roman.getArabic();
                    break;
                }
            }
        }

        return romanStringBuilder.toString();
    }
}
