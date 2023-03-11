package pkgPalindrom2;
public class cStack {
    cElemen top,bottom;
    cStack(){
        top=bottom=null;
        System.out.println("Object stack dibuat...");
    }
    public void push(cElemen baru){
        if(top==null){
            top=bottom=baru;
        }
        else{
            baru.next = top;
            top.prev = baru;
            top = baru;
        }
        System.out.println("Push "+baru.getKata()+" sukses...");
    }
    public String pop(){
        if(top==null){
            System.out.println("Stack kosong!");
            return null;
        }
        else if(top.next==null){
            cElemen t = top;
            top=bottom=null;
            t.next=null;
            t.prev=null;
            System.out.println("Pop sukses");
            return t.getKata();
        }
        else{
            cElemen t = top;
            top = top.next;
            top.prev = null;
            t.next = null;
            t.prev = null;
            System.out.println("Pop sukses...");
            return t.getKata();
        }
    }
}
