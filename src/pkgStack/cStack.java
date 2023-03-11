package pkgStack;
public class cStack {
    //stack berupa double linked list
    cItem top,bottom;
    int jumlah;
    cStack(){
        top=bottom=null;
        jumlah=0;
        System.out.println("Object stack dibuat...");
    }
    public void push(cItem baru){
        if(top==null){
            top=bottom=baru;
        }
        else{
            //penambahan di depan
            baru.next = top;
            top.prev = baru;
            top = baru;
        }
        System.out.println("Push sukses...");
    }
    public cItem pop(){
        if(top==null){
            System.out.println("Stack kosong!");
            return null;
        }
        else if(top.next==null){
            //stack sisa 1 item
            cItem t = top;
            top=bottom=null;
            t.next=null;
            t.prev=null;
            System.out.println("Pop sukses...");
            return t;
        }
        else{
            //stack sisa > 1 item
            cItem t = top;
            top = top.next;
            top.prev=null;
            t.next=null;
            t.prev=null;
            System.out.println("Pop sukses...");
            return t;
        }
    }
    public void print(){
        System.out.print("Isi Stack: ");
        for (cItem t = top; t != null; t=t.next) {
            System.out.print("["+t.getNama()+"] ");
        }
        System.out.println("");
    }
}
