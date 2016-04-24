/**
 * Converting numbers to their text version
 */
public class NumbersToText {

    public static String toText(int number) {


        int thousands = number / 1000;
        String thousandsAsText = "";

        /*if number is 3 digits 'return hundredsAsText + " hundred " + tensAsText.
        Else if return tensAsText + onesAsText*/
        if ((number <= 999999) && (number > 999)) {
            thousandsAsText = hundredsToText(thousands) + "thousands ";
            number = number % 1000;
        }
        return thousandsAsText + hundredsToText(number);
    }


    public static String hundredsToText(int number){
        int hundreds = number / 100;
        String hundredsAsText = "";

        if ((number <= 999) && (number > 99)) {
            hundredsAsText = zeroToNineteen(hundreds) + " hundred ";
            number = number % 100;
        }

        String tensAsText = "";

        if ((number <= 99) && (number >= 20)) {
            tensAsText = twentyToNinetyNine(number);
        } else if ((number <= 19) && (number >= 0)) {
            tensAsText = zeroToNineteen(number);
        }

        return hundredsAsText + tensAsText;
    }

    public static String zeroToNineteen(int number){
        String onesAsText;
        switch (number) {
            case 0:
                onesAsText = "zero ";
                break;
            case 1:
                onesAsText = "one ";
                break;
            case 2:
                onesAsText = "two ";
                break;
            case 3:
                onesAsText = "three ";
                break;
            case 4:
                onesAsText = "four ";
                break;
            case 5:
                onesAsText = "five ";
                break;
            case 6:
                onesAsText = "six ";
                break;
            case 7:
                onesAsText = "seven ";
                break;
            case 8:
                onesAsText = "eight ";
                break;
            case 9:
                onesAsText = "nine ";
                break;
            case 10:
                onesAsText = "ten ";
                break;
            case 11:
                onesAsText = "eleven ";
                break;
            case 12:
                onesAsText = "twelve ";
                break;
            case 13:
                onesAsText = "thirteen ";
                break;
            case 14:
                onesAsText = "fourteen ";
                break;
            case 15:
                onesAsText = "fifteen ";
                break;
            case 16:
                onesAsText = "sixteen ";
                break;
            case 17:
                onesAsText = "seventeen ";
                break;
            case 18:
                onesAsText = "eighteen ";
                break;
            case 19:
                onesAsText = "nineteen ";
                break;
            default:
                onesAsText = "";
                break;
        }
        return onesAsText;

    }


    public static String twentyToNinetyNine(int number) {
        int tens = number / 10;
        int ones = number % 10;
        String tensAsText;
        String onesAsText;

        switch (tens) {
            case 2:
                tensAsText = "twenty ";
                break;
            case 3:
                tensAsText = "thirty ";
                break;
            case 4:
                tensAsText = "forty ";
                break;
            case 5:
                tensAsText = "fifty ";
                break;
            case 6:
                tensAsText = "sixty ";
                break;
            case 7:
                tensAsText = "seventy ";
                break;
            case 8:
                tensAsText = "eighty ";
                break;
            case 9:
                tensAsText = "ninety ";
                break;
            default:
                tensAsText = "";
                break;
        }

        switch (ones) {

            case 1:
                onesAsText = "one ";
                break;
            case 2:
                onesAsText = "two ";
                break;
            case 3:
                onesAsText = "three ";
                break;
            case 4:
                onesAsText = "four ";
                break;
            case 5:
                onesAsText = "five ";
                break;
            case 6:
                onesAsText = "six ";
                break;
            case 7:
                onesAsText = "seven ";
                break;
            case 8:
                onesAsText = "eight ";
                break;
            case 9:
                onesAsText = "nine ";
                break;
            default:
                onesAsText = "";
                break;
        }
        return tensAsText + "" + onesAsText;
    }

}
