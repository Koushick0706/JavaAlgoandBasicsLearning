import java.util.Arrays;

public class QuicksortAlgo {


    public static void main(String[] args) {
        
        int[] myarr = {7,6,10,5,9,2,1,15,7};
        QuicksortAlgo obj = new QuicksortAlgo();
        obj.doquicksort(myarr, myarr[0], myarr[myarr.length]);
    }


    public void doquicksort(int[] data, int lb, int ub){

        if(lb<ub){

            int lock = partation(data, lb, ub);
            doquicksort(data, lb, lock-1);
            doquicksort(data, lock+1, ub);
        }
    }

    public int partation(int[] data, int lb, int ub){

        int pivot = data[lb];
        int start = lb;
        int end = ub;

        while(start<end)
        {
            while(data[start]<=pivot){
                start++;
            }
            while(data[end]> pivot){
                end--;
            }
            if(start<end){
                swapdata(data, start, end);
            }
        }
    
        swapdata(data, lb, end);
        System.out.println("--> " + Arrays.toString(data));
        return end;
    }


    
    private void swapdata(int[] selection, int poistion1, int postion2) {
        int temp = selection[poistion1];
        selection[poistion1] = selection[postion2];
        selection[postion2] = temp;
    }
    
}
