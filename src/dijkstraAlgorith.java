import java.util.Arrays;

public class dijkstraAlgorith {
    

    public int[] DIEjstra(int[][] map, int me){

        int vertices = map.length;

        int[] distance = new int[vertices];
        boolean[] visited = new boolean[vertices];

        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(visited, false);

        distance[me] = 0;

        for(int i=0;i<vertices-1;i++){
          
            int p = getMinIndex(distance, visited);
            visited[p] = true;

            for(int j=0;j<vertices;j++){
                //1.!visited[j] --> We haven't visted the house Yet
                //2. map[p][j] !=0 --> the house in the loop(j) is different than the curremt house (P)
                //3.distance[p] != Integer.MAX_VALUE --> Checking our shortest path is different than Inifinity
                //4. distance[p] + map[p][j] < distance[j] --> checking the sum of our shortest path of current house plus adding the dis is less than the shortest path

                if(!visited[j] && map[p][j] !=0 && distance[p] != Integer.MAX_VALUE
                && distance[p] + map[p][j] < distance[j]){
                    distance[j] = distance[p] + map[p][j];
                }
            }
        }

        return distance;
    }


    public int getMinIndex(int[] distance, boolean[] visited){
        int vertices = distance.length;

        int mindis = Integer.MAX_VALUE;
        int minindex = -1;

        for(int i=0;i<vertices;i++){
            if(!visited[i]&& distance[i] <= mindis){
                mindis = distance[i];
                minindex = i;
            }
        }

        return minindex;
    }



    public static void main(String[] args) {

        int[][] myarr = new int[4][4];
        myarr[0][0] =0;
        myarr[0][1] =6;
        myarr[0][2] =12;
        myarr[0][3] =Integer.MAX_VALUE;

        myarr[1][0] =Integer.MAX_VALUE;
        myarr[1][1] =0;
        myarr[1][2] =3;
        myarr[1][3] =Integer.MAX_VALUE;

        myarr[2][0] =Integer.MAX_VALUE;
        myarr[2][1] =2;
        myarr[2][2] =0;
        myarr[2][3] =7;

        myarr[3][0] =9;
        myarr[3][1] =Integer.MAX_VALUE;
        myarr[3][2] =20;
        myarr[3][3] =0;

     

        
        dijkstraAlgorith obj = new dijkstraAlgorith();
        int [] data = obj.DIEjstra(myarr, 3);

        for(int i=0;i<data.length;i++){
            System.out.println("The Shortest path : " + data[i]);
        }
        

    }
}
