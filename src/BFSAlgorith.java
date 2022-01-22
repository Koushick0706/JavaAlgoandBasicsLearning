import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class BFSAlgorith {

    private class Person{

        String name;
        List<Person> calls ;
    
        private Person(String name){
            this.name = name;
            calls = new ArrayList<>();
            
        }

        public void addneighbours(Person addper)
        {
          this.calls.add(addper);
        }

        public List<Person> getCalls() {
            return calls;
        }

        public void setCalls(List<Person> calls) {
            this.calls = calls;
        }
    }

    public static void main(String[] args) {
        BFSAlgorith obj = new BFSAlgorith();
        Person p1 = obj. new Person("Koushick");
        Person p2 = obj. new Person("Arun");
        Person p3 = obj. new Person("Subbu");
        Person p4 = obj. new Person("Danny");
        Person p5 = obj. new Person("Kowslya");
        Person p6 = obj. new Person("Mike");

        p1.addneighbours(p2);
        p1.addneighbours(p3);
        p2.addneighbours(p3);
        p3.addneighbours(p4);
        p4.addneighbours(p5);
        p6.addneighbours(p6);

        boolean result = obj.CheckingtheBFS(p1, p4);

        System.out.println("The Result is : " + result);
    }
    


public boolean CheckingtheBFS(Person p1,Person p2){
  LinkedList<Person> nexttoAsk = new LinkedList<>();
  Set<Person> asked = new HashSet<>();

  nexttoAsk.add(p1);
  asked.add(p1);

  while(!nexttoAsk.isEmpty()){

    Person checkhim = nexttoAsk.remove();
    
    if(checkhim == p2){
        System.out.println("P1 meets -->" + checkhim.name);
        return true;
    }

    asked.add(checkhim);


    for(Person callandCheck : checkhim.getCalls()){
        if(!asked.contains(callandCheck)){
            nexttoAsk.add(callandCheck);
        }
    }
    System.out.println("-->" + checkhim.name);
  }


    return false;
}
}
