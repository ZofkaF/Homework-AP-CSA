package Homework.Interfaces;

public class Hulk extends aSuperhero implements iSuperStrength {
    
    public String SuperPower(){
        return "This superhero has superstrenght.";
    }
    public static void main(String[] args) {
        Hulk myHulk = new Hulk();   
        System.out.println(myHulk.SuperPower());
    }
}
