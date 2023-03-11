package pkgTumpukan;
public class cTumpukan {
    //head dan tail;
    cElemen top, bottom;
    int jumlah;
    cTumpukan(){
        top=bottom=null;
        jumlah=0;
        System.out.println("Object tumpukan created...");
    }
    public void push(cElemen baru){
        if(top==null){
            top=bottom=baru;
        }
        else{
            //tumpukkan sudah ada isinya
            baru.next = top;
            top = baru;
        }
        System.out.println("Push Ok...");
    }
    public cElemen pop(){
        if(top==null){
            System.out.println("Tumpukkan kosong!");
            return null;
        }
        else if(top.next==null){
            cElemen t = top;
            top=bottom=null;
            System.out.println("Pop Ok...");
            return t;
        }
        else{
            //tumpukan >1 elemen
            cElemen t = top;
            top=top.next;
            t.next = null;
            System.out.println("Pop Ok...");
            return t;
        }
    }
    public void print(){
        System.out.print("Isi Stack: ");
        for (cElemen t = top; t != null; t=t.next) {
            System.out.print(t.getNama()+" ");
        }
        System.out.println(" ");
    }
}
