package pkgAntrian;
public class cQueue {
    cObject front, rear;
    int size;
    cQueue(){
        front = rear = null;
        size = 0;
        System.out.println("Object Antrian dibuat...");
    }
    public void enqueue(cObject baru){
        if(rear==null){
            front = rear = baru;
        }
        else{
            rear.next = baru;
            baru.prev = rear;
            rear = baru;
        }
        System.out.println("Nomor Antrian ke -"+(size+1));
        size++;
        System.out.println("Tambah Antrian sukses...");
    }
    public cObject dequeue(){
        if(rear==null){
            System.out.println("Antrian Kosong!");
            return null;
        }
        else if(front.next==null){
            //queue tinggal satu
            cObject t = front;
            front = rear = null;
            System.out.println("Antrian berhasil diproses...");
            size--;
            return (t);
        }
        else{
            //queue berisi lebih dari satu
            cObject t = front.next;
            cObject t2 = front;
            t2.next = null;
            front = t;
            front.prev = null;
            System.out.println("Antrian berhasil diproses...");
            size--;
            return (t2);
        }
    }
    public void print(){
        int count = 1;
        System.out.println("\n--------------------------------");
        System.out.println("       Total Antrian : "+size+"       ");
        System.out.println("--------------------------------");
        System.out.println("         DAFTAR ANTRIAN         ");
        System.out.println("--------------------------------");
        for (cObject t = front; t != null; t=t.next) {
            System.out.println(count+"."+t.getNama()+" ");
            count++;
        }
        if(size==0){
            System.out.println("Tidak Ada Antrian!");
        }
    }
}
