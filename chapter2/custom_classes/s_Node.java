

public class s_Node {
    private s_Node next = null;
    private int data;

    public s_Node(int data){
        this.data = data;
    }

    void append(int d){
        s_Node end = new s_Node(d);
        s_Node current = this;
        while(current.next != null){
            current = current.next;
        }
        current.next = end;
    }

}
