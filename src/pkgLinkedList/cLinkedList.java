package pkgLinkedList;
public class cLinkedList {
    //header = simpul paling depan
    //tail = simpul paling belakang
    cNode header, tail;
    int js; //jumlah simpul
    cLinkedList (cNode h){
        header=h; tail=h;
        js=0;
        System.out.println("Object Linked List dibuat...");
    }
    public void addNote(cNode baru){
        if(header==null){
            header=tail=baru;
        }
        else{
            //penambahan simpul itu selalu di depan
            baru.next = header;
            header = baru;
        }
        System.out.println("Penambahan OK...");
    }
    public void delNode(){
        //selalu menghapus simpul terdepat
        if(header==null){
            System.out.println("Linked List kosong!");
        }
        else{
            cNode t = header.next;
            header = null;
            header = t;
            System.out.println("Penghapusan OK...");
        }
    }
    public void print(){
        System.out.print("Isi LL : ");
        for (cNode t = header;  t!=null; t=t.next) {
            System.out.print(t.getNama()+" ");
        }
        System.out.println("");
    }
}
