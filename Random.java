package Homework;

public class Random {

    static void RandomWords(){

        //variables 
        int HowManyWords = 30; //Amount of words RandomWords() will return
        int LetterCount;
        int MAXCharacters = 5; //MAXIMUM characters per word
        int MINCharacters = 2; //MINUMUM characters per word 
        String RandomWord = "";


        for(int i = 0; i<HowManyWords; i++){
            LetterCount = MINCharacters+ (int) (Math.random() * ((MAXCharacters)) -1);
  
            for(int j = 0; j<LetterCount; j++){
 
            //from 97 to 122
            int RandomDigit = 97 + (int) (Math.random() * ((122 - 97)+1));
            char RandomChar = (char) RandomDigit;

            RandomWord = RandomWord +  Character.toString(RandomChar);
            }

            System.out.print(RandomWord + ", ");

            RandomWord = "";//flush down

        }
        
    }


    static void ZeroToOneRatio(){

        double OneCount = 0; //keep it 0
        double HowMany = 30; //define how many 0 and 1 digits do you want to be generated and counted

        for (int i = 0; i<HowMany; i++){
            int RandomDigit = (int) Math.round( Math.random() );
 
            if (RandomDigit == 1){
                OneCount+= 1;
            }

            RandomDigit = 0; //flush down
        }
        int Percentage = (int) (OneCount/HowMany*100);
        int FinalOneCount = (int) OneCount;
        int FinalZeroCount = (int) HowMany-FinalOneCount;
        
        System.out.println(Percentage);
        System.out.println("Ones-" + FinalOneCount + "; " + Percentage + "%");
        System.out.println("Zeros-" + FinalZeroCount + "; " + (100-Percentage) + "%");

    }


    static void FallingSnowflake() throws InterruptedException{

        String star = "*";
        int spaces = 0; //keep it zero
        int MAXspaces = 6; //define the MAXIMUM amount of empty spaces
        int lines = 5; //define how many lines do you want to be printed
        
        for (int i = 0; i<lines; i++){

            System.out.println(""); //make sure a new line is formed

            spaces = (int) (Math.random() * ((MAXspaces)+1));
 
            for(int j = 0; j<spaces; j++){
                System.out.print(" ");
            }
            
            Thread.sleep(1000);//delay creates an animation effect
            System.out.print(star);
        }


    }

    public static void main(String[] args) throws InterruptedException{

        RandomWords();
        
        ZeroToOneRatio();

        FallingSnowflake();

    }
}
