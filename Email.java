package Homework;

import javax.swing.JOptionPane;

public class Email {
    //definitions
    static int ca = 0;  //condition A
    static int cb = 0;  //condition B 
    static char a = '@';
    static char b = '.';

    static void IsEmailValid(){
        String In = JOptionPane.showInputDialog("Enter your email:");
        String[] Array = In.split(""); //convert our string to array so we can go trough every character in the array

        
        for (int i = 0; i < Array.length; i++) { //go trough every character in the array
            
            char ch = In.charAt(i);
     
            if(i > 0 && ch == a){ //is character with index i '@'?                
                ca++; //count in a 
            }
            if(ch == b){ //is character with index i '.'? 
                cb++; //count
            }
        }

        if (ca > 0 && cb > 0) {
            System.out.println("Valid Email");
        }
        else{
            System.out.println("Invalid Email");;
        }
    }

    public static void main(String[] args) {
        IsEmailValid();
    }

}
