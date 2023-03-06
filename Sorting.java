


public class Sorting {
   
    public static void GenerateAndSort(){

        //defintions      
        int size = 10;
        int OriginalArr [] = new int[size];
        int smaller;

        for(int k = 0; k<OriginalArr.length; k++){
            OriginalArr[k] = (int) (Math.random()*10);
        }

        System.out.print("This is the ORIGINAL array: ");
        for(int l = 0; l<OriginalArr.length; l++){
            System.out.print(OriginalArr[l] + " ");
        }
        System.out.println("");

        //traverse array
        for(int i = 0; i<OriginalArr.length - 1; i++){ 
 
        //comparing current index 
        for(int j = i+1; j<OriginalArr.length; j++){
            if(OriginalArr[j] < OriginalArr[i]){
                smaller = OriginalArr[j];
                OriginalArr[j] = OriginalArr[i];
                OriginalArr[i] = smaller;
            }
        }

        }

        System.out.print("This is the SORTED array: ");
        for(int l = 0; l<OriginalArr.length; l++){
            System.out.print(OriginalArr[l] + " ");
        }
       
    }

    public static void main(String[] args) {
        
        GenerateAndSort();

    }


}
