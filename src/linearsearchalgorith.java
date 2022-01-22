public class linearsearchalgorith {
    
public static void main(String[] args) {
    int [] mylinear = {62,18,25,33,21,33,45,65,72};
    linearsearchalgorith obj = new linearsearchalgorith();
    obj.linearsearch(mylinear, 22);
}

    public void linearsearch(int[] data,int datatofind){

        int founddata = 0;

        for(int i=0;i<data.length;i++){

            if(data[i]==datatofind){
                System.out.println("Element found at position : " + i + " the data is : " + datatofind);
                founddata = 1;
                break;
            }
        }
        if(founddata == 0){
            System.out.println("data not found !! ");
        }
    }
}
