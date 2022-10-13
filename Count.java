package Homework;

import javax.swing.JOptionPane;

public class Count {


    static void CountCode(){ //method CountCode is created

        char c = 'c'; 
        char o = 'o';
        char e = 'e';
        int a = 0; //count that keeps the value of how many symbols were correct
        int b = 0; //the amount of cd*e we found in the string
    
        String In = JOptionPane.showInputDialog("Give me a string"); //asking for a string to use
        String[] Array = In.split(""); //convert our string to array so we can go trough every character in the array
    
    
        for (int i = 0; i < Array.length; i++) { //go trough every character in the array
            
            char ch = In.charAt(i);
     
            if(ch == c){ //is character with index i 'c'? 
                a++; 
                char ch2 = In.charAt(i+1); 
                
                if(ch2 == o){ //is character with index i+1 'o'?
                    a++;
                    char ch4 = In.charAt(i+3);
    
                    if(ch4 == e) //is character with index i+3 'e'?
                    a++;
                }
            }
            if(a == 3){ //if all three conditions are met then add one to b
                b++;
            }
            
            a = 0; //flush down a
        }
        System.out.println(b); //print how many times our conditions were met
    }

    public static void main(String[] args){

        CountCode(); //calls for the method

    }
    
}
