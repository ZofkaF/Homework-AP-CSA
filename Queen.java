public class Queen {
    private static char[][] Table = {{'*', '*', '*', '*', '*', '*', '*', '*'}, {'*', '*', '*', '*', '*', '*', '*', '*'}, {'*', '*', '*', '*', '*', '*', '*', '*'}, {'*', '*', '*', '*', '*', '*', '*', '*'}, {'*', '*', '*', '*', '*', '*', '*', '*'}, {'*', '*', '*', '*', '*', '*', '*', '*'}, {'*', '*', '*', '*', '*', '*', '*', '*'}, {'*', '*', '*', '*', '*', '*', '*', '*'}};


    public static int count;

    public static void printTable() {

    //generate the initial position
    int xPosition = (int)(Math.random()*Table.length); 
    int yPosition = (int)(Math.random()*Table.length);
    Table[xPosition][yPosition] = 'Q';

    //generating random 7 positions
    int xPosition2 = (int)(Math.random()*Table.length); 
    int yPosition2 = (int)(Math.random()*Table.length);

    int xPosition3 = (int)(Math.random()*Table.length); 
    int yPosition3 = (int)(Math.random()*Table.length);

    int xPosition4 = (int)(Math.random()*Table.length); 
    int yPosition4 = (int)(Math.random()*Table.length);

    int xPosition5 = (int)(Math.random()*Table.length); 
    int yPosition5 = (int)(Math.random()*Table.length);

    int xPosition6 = (int)(Math.random()*Table.length); 
    int yPosition6 = (int)(Math.random()*Table.length);

    int xPosition7 = (int)(Math.random()*Table.length); 
    int yPosition7 = (int)(Math.random()*Table.length);

    int xPosition8 = (int)(Math.random()*Table.length); 
    int yPosition8 = (int)(Math.random()*Table.length);

    //comparing if they fit
    count = 0;
    int k = 0;
    while(k<1){ 
    if((xPosition == xPosition2 || xPosition == xPosition3 ||  xPosition == xPosition4 ||  xPosition == xPosition5 ||  xPosition == xPosition6 ||  xPosition == xPosition7 ||  xPosition == xPosition8 || 
    xPosition2 == xPosition3 || xPosition2 == xPosition4 || xPosition2 == xPosition5 || xPosition2 == xPosition6 || xPosition2 == xPosition7 || xPosition2 == xPosition8 || 
    xPosition3 == xPosition4 || xPosition3 == xPosition5 || xPosition3 == xPosition6 || xPosition3 == xPosition7 || xPosition3 == xPosition8 ||
    xPosition4 == xPosition5 || xPosition4 == xPosition6 || xPosition4 == xPosition7 || xPosition4 == xPosition8 || 
    xPosition5 == xPosition6 || xPosition5 == xPosition7 || xPosition5 == xPosition8 || xPosition6 == xPosition7 || xPosition6 == xPosition8 || xPosition7 == xPosition8 || yPosition == yPosition2 || yPosition == yPosition3 ||  yPosition == yPosition4 ||  yPosition == yPosition5 ||  yPosition == yPosition6 ||  yPosition == yPosition7 ||  yPosition == yPosition8 || 
    yPosition2 == yPosition3 || yPosition2 == yPosition4 || yPosition2 == yPosition5 || yPosition2 == yPosition6 || yPosition2 == yPosition7 || yPosition2 == yPosition8 || 
    yPosition3 == yPosition4 || yPosition3 == yPosition5 || yPosition3 == yPosition6 || yPosition3 == yPosition7 || yPosition3 == yPosition8 ||
    yPosition4 == yPosition5 || yPosition4 == yPosition6 || yPosition4 == yPosition7 || yPosition4 == yPosition8 || 
    yPosition5 == yPosition6 || yPosition5 == yPosition7 || yPosition5 == yPosition8 || yPosition6 == yPosition7 || yPosition6 == yPosition8 || yPosition7 == yPosition8)){

        xPosition2 = (int)(Math.random()*Table.length); 
        yPosition2 = (int)(Math.random()*Table.length);

        xPosition3 = (int)(Math.random()*Table.length); 
        yPosition3 = (int)(Math.random()*Table.length);

        xPosition4 = (int)(Math.random()*Table.length); 
        yPosition4 = (int)(Math.random()*Table.length);

        xPosition5 = (int)(Math.random()*Table.length); 
        yPosition5 = (int)(Math.random()*Table.length);

        xPosition6 = (int)(Math.random()*Table.length); 
        yPosition6 = (int)(Math.random()*Table.length);

        xPosition7 = (int)(Math.random()*Table.length); 
        yPosition7 = (int)(Math.random()*Table.length);

        xPosition8 = (int)(Math.random()*Table.length); 
        yPosition8 = (int)(Math.random()*Table.length);

        count++;
    }

    else{

       Table[xPosition2][yPosition2] = 'Q';
       Table[xPosition3][yPosition3] = 'Q';
       Table[xPosition4][yPosition4] = 'Q';
       Table[xPosition5][yPosition5] = 'Q';
       Table[xPosition6][yPosition6] = 'Q';
       Table[xPosition7][yPosition7] = 'Q';
       Table[xPosition8][yPosition8] = 'Q';

       k++; 
    }

    
    }
    //printing Table
    for (int i = 0; i < Table.length; i++) {
        for (int j = 0; j < Table[i].length; j++) {
            System.out.print(Table[i][j] + " ");
        }
        System.out.println(" ");
    }

    }

    public static void main(String args[]) {
        printTable();
        System.out.println("It took " + count + " loops to achieve this position.");
    }

}

