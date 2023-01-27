import java.util.ArrayList;

//from  Zoey

public class Towel {
    public String Name = "Towel";
    public int SoftnessLevel = 0;

    public Towel(int y, String x) {
        SoftnessLevel = y;
        Name = x;
    }

    public String toString(){
        return Name + " " + SoftnessLevel + "\n";
    }
     

    
    public static void main(String[] args){

        ArrayList<Towel> list = new ArrayList<Towel>();
        String[] arr = {"Filip", "Magda", "Beno", "Stevka", "Dorka"};

        for(int i = 0; i<10; i++){
            int random = (int)(Math.random()*5);
            String randomName = arr[random];

            list.add(new Towel(random, randomName));
        }

        System.out.println(list);


       /* Towel forMom = new Towel(5);

        System.out.println(forMom.toString());
        forMom.setScent("Vanila");
        System.out.println(forMom.getScent()); */
    }
}