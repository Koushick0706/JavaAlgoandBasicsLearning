import java.util.Arrays;

public class selectionsorted {
    
  public static void main(String[] args) {
      
    int[] myselection = {8,7,3,5,9,2,4,1};
    selectionsorted obj = new selectionsorted();
    obj.findselectionsort(myselection);

    /*
  -----------------Output-------------------
--> [1, 7, 3, 5, 9, 2, 4, 8] ==> 1 is smaller, so no swapping
--> [1, 2, 3, 5, 9, 7, 4, 8] ==> 7 is not smaller than 2 so 2 and 7 are swapped
--> [1, 2, 3, 5, 9, 7, 4, 8] ==> 3 is smaller than all values , so no swapping
--> [1, 2, 3, 4, 9, 7, 5, 8] ==> 9 is not smaller than 5, So, 5 and 9 are swapped
--> [1, 2, 3, 4, 5, 7, 9, 8] ==> 7 is smaller than 9 and 8, so no swapping
--> [1, 2, 3, 4, 5, 7, 9, 8] ==> 9 is not smaller than 8. so swapping done for 9 and 8
--> [1, 2, 3, 4, 5, 7, 8, 9] ==> Final Sorted List
    
    */
  }

    public void findselectionsort(int[] selection){

        for(int i=0;i<selection.length-1;i++){

           int min = i;

           for(int j=i+1;j<selection.length;j++){

            if(selection[j]<selection[min]){
                min = j;
            }
           }

           if(min != i){
            swapdata(selection,i, min);
           }

           System.out.println("--> " + Arrays.toString(selection));
        }
    }


    private void swapdata(int[] selection, int poistion1, int postion2) {
        int temp = selection[poistion1];
        selection[poistion1] = selection[postion2];
        selection[postion2] = temp;
    }
}
