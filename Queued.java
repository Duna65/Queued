package sd2;
import java.util.Scanner;//imports
public class Queued {
    class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    public Queued next; //variables
    public Queued prev; //uses the previous and next objects as variables
    public Queued head;
    public Queued tail;
    public Object data;

    public Queued(Object data, Queued next, Queued prev) {
        head=new Queued(data, next, prev);
        tail=head;
        this.data = data;
        this.next = next;
        this.prev = prev; 
    }
    public void addNode(Object data){

        Queued current = new Queued(data, next, prev);

        current.prev=tail;

        tail.next=current;

   }
   public Object removeNode(Queued cur){

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
    public void setData(Object data){
              this.data=data;
            }
        public Object getData(){
            return data;
        }    
    
    public static void main(String[] args){
        Queued queue;
        Scanner test = new Scanner(System.in);//asks you if you want to use the automatic data set
        System.out.println("Use automatic information? \"y\" for yes, and \"n\" for no");
        String yesorno = test.nextLine();
        
    if(true==yesorno.contains("n")){//tests if you entered yes or no, and if no, it makes new data
          Scanner in = new Scanner(System.in);//user input
          for(int i=1;i<=5;i++){
            String nam = "";//name to be submitted
            System.out.println("put info for person " + i);//puts in data for 5 people
            if (i!=1){//skips a line cuz a bug happens if I don't
                in.nextLine();
            }
            System.out.println("First, put in your first AND last name");
            String a = in.nextLine();
            System.out.println("Second, put in your age");
            int b = in.nextInt();
            String[] name = {};//splits your names on any of the characters
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
            try {
                if (name[1].isEmpty() == false) {//split first and last names
                    nam = name[0]+" "+name[1];
            }
            } catch (Exception ex) {
                System.out.println("Please put in your name right!");//if the name is wrong
            }
            Person persn = new Person(nam, b);
            queue.addNode(person)
      name[0]="";
      name[1]="";//clears name for the next input
    }
    in.close();  //close
    test.close();
        } else{

        }

    }
}


