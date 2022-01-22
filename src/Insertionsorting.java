import java.util.Arrays;

public class Insertionsorting {
    
  public static void main(String[] args) {
      
    int[] arr = {8,2,6,3,9,0,4};
   
    Insertionsorting obj = new Insertionsorting();
    obj.sortdata(arr);

    System.out.println(Arrays.toString(arr));
    

  }

    public void sortdata(int[] fruits){

        for(int i=1;i<fruits.length;i++){

            int selected = fruits[i];
            int j = i-1;

            while(j>=0 && fruits[j]>selected){
                fruits[j+1] = fruits[j];
                j--;
            }

            fruits[j+1]= selected;
            System.out.println(Arrays.toString(fruits));

        }
    }
}
