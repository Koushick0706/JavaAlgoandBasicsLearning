import java.util.Arrays;

public class Binaryser {
    
    public static void main(String[] args) {

        int[] myarr = {6,7,21,8,46,22,78,66,72,15,16,58};
        Binaryser obj = new Binaryser();
        int result = obj.binarySearch(myarr, 21);

        System.out.println("The Result is : " + result);
    }


    public int binarySearch(int[] data, int mypoint){
       //divide and conquer method
       //first sort the data
        Arrays.sort(data);
       
        //the first variable is set to "0" since the starting point index is 0
        int first =0;
        // the last variable is set length (if length is 10 --> 10-1 -->0-9)
        int last = data.length-1;
        //checking in while loop (first variable < last)
        while(first<last){
               int pointer = (first+last)/2; // finding the middle value 

               if(data[pointer]== mypoint){
                   return pointer; // if the middle value is equal to our pointer return true
               }
               else if(data[pointer]<mypoint){
                   first = pointer+1; // if middle value is less than our pointer , 
                                         //shift the middle value = mid value +1
               }
               else{
                   last = pointer-1;  // if middle value is grater than our pointer,
                                        // shift the middle value = middle -1
               }
        }
        return -1;
    }
}
