package pkgLinkedList_2;
//Single linked list->simpulnya hanya punya satu link
public class cLinkedList {
    cSimpul head,tail;
    cLinkedList(){
        head=tail=null; //tidak merujuk kemana-mana
    }
    public void tambahBelakang(cSimpul baru){
        if(tail==null){
            head=tail=baru;
        }
        else{
            //penambahan simpul itu selalu di depan
            tail.next = baru; //sambungkan linked list
            tail = baru; //update posisi tail
        }
        System.out.println("Penambahan sukses...");
    }
    public void bacaLinkedList(){
        System.out.print("Isi Linked List: ");
        for (cSimpul t = head;  t!=null; t=t.next) {
            System.out.print("["+t.getData()+"]");
        }
        System.out.println("");
    }
    public void hapusDepan(){
        if(head==null){
            System.out.println("Linked List kosong!");
        }
        else if (head.next==null){ //linked list tinggal 1 simpul
            cSimpul t = head;
            System.out.println("["+t.getData()+"] dihapus...");
            head=tail=null; //reset
        }
        else{ //linked list berisi >=2 simpul
            cSimpul t = head;
            System.out.println("["+t.getData()+"] dihapus...");
            head=head.next;
            t=null;
        }
    }
}
