package romannumeral;


public class RomanToArabic {

    public enum Roman {C(100),XC(90),L(50),XL(40),X(10),IX(9),V(5),IV(4),I(1);

        private int arabic;

        Roman(int arabic) {
             this.arabic=arabic;
        }

        public int getArabic() {
            return arabic;
        }
    };

    public int convert(String roman) {

        String residualRoman = roman;
        int arabic = 0;
        while (residualRoman.length()>0){
            boolean match = false;
            for(Roman r:Roman.values()){
                if(residualRoman.startsWith(r.toString())){
                    arabic+=r.getArabic();
                    residualRoman = residualRoman.replaceFirst(r.toString(),"");
                    match=true;
                    break;
                }
            }
            if(!match){
                throw new IllegalArgumentException(roman+" value not supported");
            }
            /*if(residualRoman.startsWith("V")){
                arabic+=5;
                residualRoman = residualRoman.replaceFirst("V","");
            }else if(residualRoman.startsWith("IV")){
                arabic+=4;
                residualRoman = residualRoman.replaceFirst("IV","");
            }else if(residualRoman.startsWith("I")){
                arabic++;
                residualRoman = residualRoman.replaceFirst("I","");
            }else{
                throw new IllegalArgumentException(roman+" value not supported");
            }*/
        }
        return arabic;
    }
}
