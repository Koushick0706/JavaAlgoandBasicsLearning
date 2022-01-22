import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DFSAlgorithm {


    private class Person{

        String name;
        ArrayList<Person> meetpePersons ;

        private Person(String name){
            this.name = name;
            meetpePersons = new ArrayList<>();
        }

        public void addneighbours(Person p1){
            this.meetpePersons.add(p1);
        }

        public ArrayList<Person> getMeetpePersons() {
            return meetpePersons;
        }

  
    }


    public boolean checkmyDFS(Person p1,Person p2,Set<Person> asked){
        if(asked.contains(p1)) return false;

        asked.add(p1);
        
        if(p1 == p2) return true;

        for(Person meet : p1.getMeetpePersons()){
            System.out.println("The People asking : " + meet.name);
            if(checkmyDFS(meet,p2,asked)) return true ; 
         
        }

        return false;
    }

    public static void main(String[] args){

        DFSAlgorithm obj = new DFSAlgorithm();

        Person p1 = obj. new Person("Koushick");
        Person p2 = obj. new Person("Dinesh");
        Person p3 = obj. new Person("Subbu");
        Person p4 = obj. new Person("Arun");
        Person p5 = obj. new Person("Kowslya");
        Person p6 = obj. new Person("Monita");
        Person p7 = obj. new Person("Nitty");
        Person p8 = obj. new Person("Meena pooja");
        Person p9 = obj. new Person("Renitha");
        Person p10 = obj. new Person("Mia");

        p1.addneighbours(p2);
        p1.addneighbours(p3);
        p1.addneighbours(p4);
        p1.addneighbours(p5);
        p2.addneighbours(p6);
        p2.addneighbours(p7);
        p3.addneighbours(p8);
        p4.addneighbours(p9);
        p5.addneighbours(p9);
        p8.addneighbours(p10);

        Set<Person> myperson = new HashSet<>();

        boolean status = obj.checkmyDFS(p1, p9, myperson);   
        System.out.println("The Result is : " + status);
        
    }
    
}
