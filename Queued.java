package sd2;
import java.util.Scanner;//imports
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Queued {
    public Queued next; //variables
    public Queued prev; //uses the previous and next objects as variables
    public Queued head;
    public Queued tail;
    public Object data;

    public Queued(Person data, Queued next, Queued prev) {
        if (head == null) {
            head = this;//Initialize head if it's null
        }
        if (tail == null) {
            tail = this;//Initialize tail if it's null
        }
        this.data = data;
        this.next = next;
        this.prev = prev; 
    }
    public void addNode(Person data){//adds a node to the queue 
        Queued current = new Queued(data, next, prev);
        if (head == null) {
            head = current; 
        }
        current.prev=tail;
        tail.next=current;
   }
   public Object removeNode(Queued cur){//removes a node from the quue
        cur.next.setPrevious(cur.prev);
        return data;
   }
    public void setNext(Queued next){
            this.next=next;
        }
    public void setPrevious (Queued prev){
            this.prev=prev;
        }
    public Queued getNext(){
            return next;
        }
    public Queued getPrevious(){
            return prev;
        }
    public void setData(Person data){
            this.data=data;
        }
    public Object getData(){
            return data;
        }    
    public static void main(String[] args){
        Queued queue = null;//initialization of queue
        Scanner in = new Scanner(System.in);//makes a scanner
        System.out.println("How many people do you want to add to the list?");
        int nump = in.nextInt(); // Get the number of people
        in.nextLine(); // Consume the newline character
        
        for (int i = 0; i < nump; i++) {
            String nam = "";//name to be submitted
            System.out.println("put info for person " + (i+1));//puts in data for 5 people
            System.out.println("First, put in your name");
            String a = in.nextLine();
            System.out.println("Second, put in your age");
            int age = in.nextInt();
            in.nextLine();//consumes a line
            String[] name = {"@","@"};//splits your names on any of the characters
            if (a.contains(";")==true) {
                name = a.split(";");//splits the user's name at the character that it uses
            } else if(a.contains("-")==true){
                name = a.split("-");
            } else if(a.contains("_")==true){
                name = a.split("_");
            } else if(a.contains(" ")==true){
                name = a.split(" ");
            } else if(a.contains(",")==true){
                name = a.split(",");
            } else if(a.contains(".")==true){
                name = a.split(".");
            }
                if (name[1].contains("@") == false) {//split first and last names
                    nam = name[0]+" "+name[1];
                } else{
                    nam = a;
                }
            Person person = new Person(nam, age);//creates a new Person object
            if (queue == null) {
                queue = new Queued(person, null, null);//start the queue
            } else {
                queue.addNode(person);//adds the person to the queue
            }
      name[0]="";
      name[1]="";//clears name for the next input
    }
    in.close();  //closes the scanner
    Queued current = queue; //shows the queue
    for (;current != null;) {
        Person p = (Person) current.getData();//gets the data for the person
        System.out.println("Name: " + p.name + ", Age: " + p.age);
        current = current.getNext(); // Move to the next node
    }

    }
}


