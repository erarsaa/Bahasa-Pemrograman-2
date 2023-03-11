package pkgStack;  //simpul/node
public class cItem {
    private String nama;
    cItem next, prev;
    cItem(String n){
        nama=n;
        System.out.println("Item "+n+" dibuat...");
    }
    public String getNama(){
        return nama;
    }
}
