package romannumeral;


public class ArabicToRoman {

    private enum Roman {C(100),XC(90),L(50),XL(40),X(10),IX(9),V(5),IV(4),I(1);

        private int numeric;

        private Roman(int i) {
            numeric = i;
        }

        public int toNumeric(){
            return numeric;
        }

    };

    public String fromArabic(int toConvert) {

        StringBuilder arabic=new StringBuilder();
        int residual = toConvert;

        while(residual>0){
            for(Roman roman:Roman.values()){
                if(residual>=roman.toNumeric()){
                    arabic.append(roman);
                    residual-=roman.toNumeric();
                    break;
                }
            }
        }

        return arabic.toString();
    }
}
