
public class Grids{
    static int[][] grid;

    public static void findPeak(){
        grid = new int[10][10];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                grid[i][j]=(int)(Math.random()*10);
                System.out.print(grid[i][j] + "  ");
            }
            System.out.println();
        }
        
        for(int i = 1; i < grid.length-1; i++){
            for(int j = 1; j < grid.length-1; j++){
                int current = grid[i][j];
                int bellow = grid[i+1][j];
                int above = grid[i-1][j];
                int left = grid[i][j-1];
                int right = grid[i][j+1];
                int lct = grid[i-1][j-1];
                int lcb = grid[i+1][j-1];
                int rct = grid[i-1][j+1];
                int rcb = grid[i+1][j+1];

                if(current>bellow & current>above & current>left & current>right & current>lct & current>lcb & current>rct & current>rcb ){
                   System.out.println(j + ":" + i);
                }
            }
        }
    }

    
    public static void findSequence(){
        boolean found = false;
        int count = 0;
        int current;

        //this keeps running if we did not find a combination yet
        while(found == false){    
            grid = new int[10][10];
            for(int i = 0; i < grid.length; i++){
                for(int j = 0; j < grid.length; j++){
                    grid[i][j]=(int)(Math.random()*10);
                }
            }

            //traversing trough the array
            for(int i = 0; i < grid.length; i++){
                for(int j = 0; j < grid.length; j++){
                    current = grid[j][i];

                    //to see if we can check right
                    if(j<grid.length-3){

                        //checking the next three spots on the right side
                        if(current-1 == grid[j+1][i] & current-2 == grid[j+2][i] & current-3 == grid[j+3][i]){
                            System.out.println("Sequence starts at " + j + ":" + i + ", and continues on the right. It took " + count + " different grid(s) to generate.");
                            found = true;
                            break;
                        }
                    }


                    //to see if we can check diagonal
                    if(j<grid.length-3 & i<grid.length-3){

                        //checking the next three spots on the diagonal
                        if(current-1 == grid[j+1][i+1] & current-2 == grid[j+2][i+2] & current-3 == grid[j+3][i+3]){
                            System.out.println("Sequence starts at " + j + ":" + i + ", and continues diagonally. It took " + count + " different grid(s) to generate.");
                            found = true;
                            break;
                        }
                    }

                    //to see if we can check bellow
                    if(i<grid.length-3){

                        //checking the next three spots bellow
                        if(current-1 == grid[j][i+1] & current-2 == grid[j][i+2] & current-3 == grid[j][i+3]){
                            System.out.println("Sequence starts at " + j + ":" + i + ", and continues bellow. It took " + count + " different grid(s) to generate.");
                            found = true;
                            break;
                        }
                    }

                }
            }
            //adds one at the end of every loop
            count++;
        }
        //printing the correct board
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                System.out.print(grid[j][i] + "  ");
            }
            System.out.println();
        }
    
    }   

    public static void main(String[] args) {

        findPeak();
        findSequence();
    }
}











































 