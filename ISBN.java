package Homework;

public class ISBN {

    static void ISBNnumbers() {

        // declarations
        String FinalDigits = "";
        String Adding = "";
        int Count = 0;
        String LastDigit = "";
 
        for (int i = 1; i < 10; i++) {
            int RandomDigit = (int) (Math.random() * ((10)+1));
 
            // transform 10 to 'X'
            if (RandomDigit == 10) {
                Adding = "X";
            } else {
                Adding = Integer.toString(RandomDigit);
            }

            FinalDigits += Adding;
            Count += RandomDigit;
        }

        // to make sure it adds up to eleven
        int Remainder = 11 - Count % 11;

        if (Remainder == 11) {
            Remainder = 0;
        }

        LastDigit = Integer.toString(Remainder);

        if (Remainder == 10) {
            LastDigit = "X";
        } else {
            LastDigit = Integer.toString(Remainder);
        }

        FinalDigits += LastDigit;

        // return the final String
        System.out.println(FinalDigits);
    }

    public static void main(String[] args) {
        
        ISBNnumbers();
        
    }
}

 