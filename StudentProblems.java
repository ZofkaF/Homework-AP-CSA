package Homework;

import java.util.IllegalFormatFlagsException;
import java.util.Scanner;

public class StudentProblems {

    //this method told me which of the tasks from the document should I programm
    static void RandomTask(){

        //variables
        int TotalTasks = 8;
        String FinalTasks = "";
 
            
        int Task1 = (int) (Math.random()*TotalTasks) + 1;
            FinalTasks+= Task1 + ", ";

            int Task2 = (int) (Math.random()*TotalTasks) + 1;
            while(Task1 == Task2){
                Task2 = (int) (Math.random()*TotalTasks) + 1;
            }
            FinalTasks+= Task2 + ", ";

            int Task3 = (int) (Math.random()*TotalTasks) + 1;
            while(Task1 == Task3 || Task2 == Task3){
                Task3 = (int) (Math.random()*TotalTasks) + 1;
            }
            FinalTasks+= Task3;
    

        System.out.println(FinalTasks);

    }

    static void LeapYears(){
        int YearsCount = 20; //defined in the problem
        int CurrentYear = 2022;

        for(int i = 0; i<YearsCount;){
            if(CurrentYear%4 == 0){
                System.out.print(CurrentYear + ", ");
                YearsCount-= 1; //substract from the amount, till we get to zero
            } 
            CurrentYear+= 1;//to check next year in the next loop
        }
    }

    static void Attack(){
        String [] Power = {"powered up", "not powered up"};
        String [] Visibility = {"visible", "invisible"};

        int IndexPower = (int) (Math.random()*Power.length);
        int IndexVisibility = (int) (Math.random()*Visibility.length);

        String PlayerPower  = Power[IndexPower];
        String PlayerVisibility  = Visibility[IndexVisibility];


        String Instruction = "Hii, I am the default result. If you see me, something is wrong with your logic :) Fix it!!!";

        if(PlayerVisibility == "invisible"){
            Instruction = "WANDER.";
            System.out.println("The other player is " + PlayerVisibility + ". You should " + Instruction);
        }
        else if(PlayerVisibility == "visible"){

            if(PlayerPower  == "powered up"){
                Instruction = "RUNAWAY.";
            }
            else if(PlayerPower  == "not powered up"){
                Instruction = "ATTACK.";
            }
            System.out.println("The other player is " + PlayerVisibility + " and " + PlayerPower + ". You should " + Instruction);
        }
    }


    static void DecimalToBinary(){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a decimal intiger");

        String Input = myObj.nextLine(); 
        int Decimal = Integer.parseInt(Input);
        int i = Decimal;
        String Converted = "";
        String Result = "";

        while(i > 0){
            int Remainder = i%2;

            Converted = Integer.toString(Remainder);
            Result += Converted;
            i = i/2;
            Converted = "";
        }

        String Reverse = new StringBuilder(Result).reverse().toString(); //reverse remainders order
        System.out.println("Number " + Decimal + " in decimal is " + Reverse + " in binary.");
    }

    static void Akinator(){
        //made for Artem, Ilya, Anfisa, Rebeka, Kaja, Max, Dusan and Zoey

        System.out.println("imagine you are a person in your AP CSA class of you choice. I will attempt to guess who did you pick after asking only 3 yes-or-no questions.");
  

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Are you from Y4?");

        String Input1 = myObj.nextLine(); 

        if(Input1 == "yes"){
            Scanner Question2a = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Do you understand Russian?");
            String Input2a = Question2a.nextLine(); 

            if(Input2a == "yes"){
                Scanner Question3a = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Are you a girl?");
                String Input3a = Question3a.nextLine();
                
                if(Input3a == "yes"){
                    System.out.println("you chose ANFISA");
                }
                else if(Input3a == "no"){
                    System.out.println("you chose ARTEM");
                }
                else{
                    System.out.println("Please input either 'yes' or 'no'.");
                }
            }
            else if(Input2a == "no"){
                Scanner Question3aa = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Do you live on a girl hall?");
                String Input3aa = Question3aa.nextLine();

                if(Input3aa == "yes"){
                    System.out.println("you chose ZOEY");
                }
                else if(Input3aa == "no"){
                    System.out.println("you chose MAX");
                }
                else{
                    System.out.println("Please input either 'yes' or 'no'.");
                }

            }
            else{
                System.out.println("Please input either 'yes' or 'no'.");
            }
        }
        else if (Input1 == "no"){
            Scanner Question2b = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Are you a girl?");
            String Input2b = Question2b.nextLine(); 

            if(Input2b == "yes"){
                Scanner Question3b = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Do you live on Fortes?");
                String Input3b = Question3b.nextLine();
                
                if(Input3b == "yes"){
                    System.out.println("you chose REBEKA");
                }
                else if(Input3b == "no"){
                    System.out.println("you chose KAJA");
                }
                else{
                    System.out.println("Please input either 'yes' or 'no'.");
                }
            }
            else if(Input2b == "no"){
                Scanner Question3bb = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Are you adult?");
                String Input3bb = Question3bb.nextLine();

                if(Input3bb == "yes"){
                    System.out.println("you chose DUSAN");
                }
                else if(Input3bb == "no"){
                    System.out.println("you chose ILYA");
                }
                else{
                    System.out.println("Please input either 'yes' or 'no'.");
                }

            }
            else{
                System.out.println("Please input either 'yes' or 'no'.");
            }

        }
        else{
            System.out.println("Please input either 'yes' or 'no'.");
        }

    }

    public static void main (String[] args){

        //RandomTask(); returned = 18, 6, 5
        //RandomTask();

        //18 - Write a program that prints the next 20 leap years.
        //LeapYears();

        //6 - Dominik: Write a function that will print “Attack” when an enemy player is visible, but not powered up. It will print “Runaway” when the enemy is visible and powered up and it will print “Wander” when the player is not visible. Input (Visible, PoweredUp), Output (print message to screen). Make a random generator of input combinations. 
        //Attack();

        //5 - Terka: Write a function to convert decimal numbers to binary. Input Decimal, Output is Binary form (String). Use String class only (substring, concatenation). Avoid any arrays.  
        //DecimalToBinary();

        //My own random game
        //Akinator();

    }
}
