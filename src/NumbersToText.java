/**
 * Converting numbers to their text version
 */
public class NumbersToText {

    public static String toText(int number){
        int tens = number / 10;
        int ones = number % 10;
        String tensAsText;
        String onesAsText;

        switch (tens) {
            case 2:
                tensAsText = "twenty";
                break;
            case 3:
                tensAsText = "thirty";
                break;
            case 4:
                tensAsText = "forty";
                break;
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                tensAsText = "seventy";
                break;
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "";
        }

        switch (ones){
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                onesAsText = "three";
                break;
            case 4:
                return "four";
            case 5:
                onesAsText = "five";
                break;
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                onesAsText = "eight";
                break;
            case 9:
                onesAsText = "nine";
                break;
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default:
                return "";
        }
        return tensAsText + " " + onesAsText;



    }


}
