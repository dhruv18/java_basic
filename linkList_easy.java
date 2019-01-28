class node{
    int data;
    node next;
}
class linklistimplement{
    node head;
    public void insert(int data){
        node n = new node();
        n.data=data;
        n.next=null;
        
         if(head==null){
             head = n;
         }
         else{
             node TEMP = head;
             while(TEMP.next!=null){
                TEMP = TEMP.next;
             }
             TEMP.next = n;
         }
    }
    public void insertAtstart(int data){
        node n = new node();
        n.data = data;
        n.next= null;
        n.next = head;

        head = n;
    }

    public void insertAtindex(int index,int data){
        node n = new node();
        n.data = data;
        n.next = null;

        node nl = head;
        for( int i=0;i<index-1;i++){
            nl = nl.next;
        }
        n.next = nl.next;
        nl.next = n;
        
        
    }
    public void show(){
        node n = head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
   
}
public class linkList_easy{
     public static void main(String[] args) {
        
         linklistimplement ls = new linklistimplement();
         ls.insert(5);
         ls.insert(6);
        // ls.insertAtstart(18);
         ls.insert(9);
         ls.insertAtindex(2, 28);
         ls.show();
     }
}
