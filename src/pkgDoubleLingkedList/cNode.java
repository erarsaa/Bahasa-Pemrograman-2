package pkgDoubleLingkedList;
public class cNode {
    private String nama;
    cNode prev,next;
    cNode(String n){
        nama=n;
        prev=next;
        System.out.println("Object simpul "+n+" dibuat...");
    }
    public String getNama(){
        return nama;
    }
}
