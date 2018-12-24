class node
{

    node Next;
    int data;

    //constructors
    node(int newData){
        data = newData;
        Next = null;
    }

    node(int newData,node newNext){
        data = newData;
        Next = newNext;
    }

    //getters and setters

    public int getdata()
    {
        return data;
    }
    public node getnext()
    {
        return next;
    }
    public void setData(int newData){
        data = newData;
    }
    public void setNext(node newNode){
        Next = newNode;
    }
}

public class linkList_Complex{

    node head;
    int count;

    //constructor
    linkList_Complex(){
        head = null;
        count = 0;
    }
    linkList_Complex(node newHead){
        head = newHead;
        count = 1;
    }

    //Methodes

    //add in linklist
    public void add(int newData){
        node temp = new node(newData);
        node current = head;
        while(current.getnext() != null){
            current = current.getnext(); //increment the search in linklist for getting the last node;
        }
        current.setNext(temp);
        count ++;
    }

    //get data
    public int get(int index){
        if(index <= 0){
            return -1;
        }
        node current = head;
        for(int i=1;i<index;i++){
            current= current.getnext();
        }
        return current.getdata();
    }

    //size of linklist
    public int size(){
        return count;
    }

    //isEmpty linklist
    public boolean isEmpty()
    {
        return head == null; //head is the start of link list 
    }

    //remove
    public void remove(){
        node current = head;
        while(current.getnext().getnext() != null)
        {
            current = current.getnext();
        }
        current.setNext(null);
        count --;
    }




    public static void main(String[] args) {
        
    }
}