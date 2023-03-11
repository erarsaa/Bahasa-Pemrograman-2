package pkgLinkedList_2;
import java.util.Scanner;
public class cCircularLinkedList {
    cSimpul head,tail;
    int jSimpul;
    cCircularLinkedList(){
        head=tail=null;
        jSimpul=0;
        System.out.println("Object circular linked list dibuat...");
    }
    public void tambahSimpul(cSimpul baru){
        //Simpul baru selalu di depan atau head
        if(head==null){
            head=tail=baru;
            tail.next=head;
        }
        else{
            baru.next=head;
            tail.next=baru;
            head=baru;
        }
        System.out.println("Penambahan sukses...");
    }
    public void hapusSimpul(){
        if(head==null){
            System.out.println("Linked List Kosong!");
        }
        else if(head.next==head){
            head=tail=null;
            System.out.println("Penghapusan Sukses...");
        }
        else{
            cSimpul t = head.next;
            head.next=null;
            head = t;
            tail.next=head;
            System.out.println("Penghapusan Sukses...");
        }
    }
    public void print(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Isi Circular Linked List ");
        if(head==null){
            System.out.println("Kosong!");
        }
        else{
            System.out.print("Mulai dari = ");
            String nm = sc.next();
            cSimpul start = null;
            cSimpul t=head;
            do{
                if(t.getData().equalsIgnoreCase(nm)){
                    start = t;
                    break;
                }
            }while(t!=head); 
            
            t = start; //posisi awal
            do{
                System.out.print(t.getData()+" "); //eror disini tapi gatau dimananya
                t=t.next;
            }while(t!=start); //kalo diisi null bisa looping terus
            System.out.println("");
        }
    }
}
