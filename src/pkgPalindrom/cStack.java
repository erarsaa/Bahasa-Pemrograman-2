package pkgPalindrom;
public class cStack {
    cElemen top,bottom;
    cStack(){
        top=bottom=null;
        System.out.println("Objek stack dibuat...");
    }
    public void push(cElemen baru){
        if(top==null){
            top=bottom=baru;
        }
        else{
            //tumpukan sudah ada isinya
            baru.next = top;
            top = baru;
        }
        System.out.println("Push "+baru.getKata()+" sukses...");
    }
    public String pop(){
        if(top==null){
            System.out.println("Tumpukkan kosong!");
            return null;
        }
        else if(top.next==null){
            cElemen t = top;
            top=bottom=null;
            System.out.println("Pop "+t.getKata()+" sukses...");
            return t.getKata();
        }
        else{
            //tumpukan lebih dari satu
            cElemen t = top;
            top = top.next;
            t.next = null;
            System.out.println("Pop "+t.getKata()+" sukses...");
            return t.getKata();
        }
    }
}
