import java.util.Scanner;

public class BinarySearch {
    
    public static void MathAkinator(){
        //defintions
        int dimension = 1000;
        int answer = (int)(Math.random()*dimension);
        int i = 0;

        //test - only used for checking
        //System.out.println(answer);

        //loop to check the answer
        while(i == 0){

            System.out.println("");
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the number you think I am thinking of: ");
    
            // This method reads the number provided using keyboard
            int guess = scan.nextInt();

            if(guess < answer){
                System.out.println("Sorry! The real number is higher.");
            }
            else if(guess > answer){
                System.out.println("Sorry! The real number is lower.");
            }
            else{
                i++;
            }
        }
        System.out.println("Congrats, you have guessed the correct number!");
    }







    public static void AiAkinator(){

        //defintions (what needs to retain its value even in a new loop)
        int loops = 10;
        int Bguess = 10;
        int Wguess = 0;
        for(int j = 0; j<loops; j++){   

            //definitions (need to be reset every loop)
            int dimension = 1000;
            int answer = (int)(Math.random()*dimension);
            int guess = 0;
            int i = 0;
            int UpperB = 1000;
            int LowerB = 0;
            int count = 0;

            //test - only used for checking
            //System.out.println(answer);

            //loop to check the answer
            while(i == 0){

                count++;
                guess = (UpperB + LowerB)/2;

                if(guess < answer){
                    LowerB = guess;
                }
                else if(guess > answer){
                    UpperB = guess;
                }
                else{
                    i++;
                }

            }
           //System.out.println("Congrats, your computer guessed the correct number: " + guess + " And it took only  " + count + " tries.");
        
        
            if(count < Bguess){
                Bguess = count;
            }
            else if(count > Wguess){
                Wguess = count;
            }
        }
        //System.out.println("");
        System.out.println("This was the best guess: " + Bguess + " , and this was the worst guess: " + Wguess);
} 






    public static void main(String[] args) {
        //MathAkinator();

        AiAkinator();
    }
}