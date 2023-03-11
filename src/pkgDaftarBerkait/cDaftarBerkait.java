package pkgDaftarBerkait;
public class cDaftarBerkait {
    cSimpul header; //menyimpan posisi simpul terdepan
    cSimpul tail;   //menyimpan posisi simpul terbelakang
    int jSimpul;    //jumlah simpul
    cDaftarBerkait(cSimpul s){//contructor
        header=tail=s;
        jSimpul=0;
        System.out.println("Object Linked List dibuat...");
    }
    public void tambahSimpul(cSimpul baru){
        if(header==null){ //linked list masih kosong
            header=tail=baru;
        }
        else{ //linked list sudah berisi
            //penambahan simpul selalu di depan
            baru.next=header;
            header = baru;
        }
        System.out.println("Penambahan sukses...");
    }
    public void hapusSimpul(){
        //penghapusan selalu di ujung depan
        if(header==null){
            System.out.println("Linked list kosong!");
        }
        else{
            cSimpul t = header.next; //calon header
            header = null;
            header = t;
            System.out.println("Penghapusan sukses...");
        }
    }
    public void cetak(){
        System.out.print("Isi Linked List : ");
        for (cSimpul t = header;  t!=null; t=t.next) {
            System.out.print(t.getNama()+" ");
        }
        System.out.println("");
    }
}
