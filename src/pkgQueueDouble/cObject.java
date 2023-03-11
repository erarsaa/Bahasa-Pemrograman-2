package pkgQueueDouble;
public class cObject {
    private String nama;
    cObject next,prev;
    cObject(String n){
        nama=n;
        next=prev=null;
        System.out.println("Object "+n+" dibuat...");
    }
    public String getNama(){
        return nama;
    }
}
