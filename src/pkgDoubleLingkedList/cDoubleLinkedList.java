package pkgDoubleLingkedList;
public class cDoubleLinkedList {
    cNode head,tail;
    int jNode;
    cDoubleLinkedList(){
        head=tail=null;
        jNode=0;
        System.out.println("Object double linked list dibuat...");
    }
    public void addFront(cNode baru){//tambah depan
        if(head==null){
            head=tail=baru;
        }
        else{
            baru.next=head;
            head.prev=baru;
            head=baru;
        }
        System.out.println("Penambahan sukses...");
    }
    public void delFront(){
        if(head==null){
            System.out.println("Linked List Kosong!");
        }
        else if(head.next==null){
            head=tail=null;//reset
            System.out.println("Penghapusan sukses...");
        }
        else{
            cNode t = head.next;
            head.next=null;
            //t.prev=null;
            head = t;
            head.prev=null;
            System.out.println("Penghapusan sukses...");
        }
    }
    public void print(){
        System.out.println("Isi Double Linked List");
        System.out.print("Mundur: ");
        for (cNode t=head;  t!=null; t=t.next) {
            System.out.print(t.getNama()+" ");
        }
        System.out.print("\nMaju: ");
        for (cNode t=tail;  t!=null; t=t.prev) {
            System.out.print(t.getNama()+" ");
        }
        System.out.println("");
    }
}
