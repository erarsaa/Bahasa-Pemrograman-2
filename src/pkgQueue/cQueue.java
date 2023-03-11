package pkgQueue; //single linkedlist
public class cQueue {
    cNode front,rear;
    int jumlah; //jumlah item yang tersimpan
    cQueue(){
        front=rear=null;
        jumlah=0;
    }
    public void enqueue(cNode baru){
        //penambahan data baru selalu diujung belakang
        //identik dengan tambah belakang pada linked list
        if(rear==null){
            rear=front=baru;
        }
        else{ //antrian sudah ada isinya
            rear.next=baru;
            rear=baru;
        }
        System.out.println("Enqueue sukses...");
    }
    public cNode dequeue(){ //mengeluarkan dari antrian
        cNode temp=front;
        if(temp==null){
            System.out.println("Queue kosong!");
        }
        else if(front.next==null){ //mengosongkan antrian
            front=rear=null;
            temp.next=null;
        }
        else{ //antrian berisi >1 simpul
            front=front.next;
            temp.next=null;
        }
        return temp;
    }
    public void viewQueue(){
        System.out.print("Isi Antrian: ");
        for (cNode t = front; t!=null; t=t.next) {
            System.out.print("["+t.getBarang()+"]");
        }
        System.out.println("");
    }
}
