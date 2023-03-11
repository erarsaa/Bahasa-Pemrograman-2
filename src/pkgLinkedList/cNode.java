//tempat menyimpan data
//aplikasi linked list data barang
package pkgLinkedList;

public class cNode {
    private String nama;
    cNode next; //deklarasi secara rekursif
    cNode(String n){
        nama=n;
        next=null;
        System.out.println("Object node "+n+" dibuat...");
    }
    public String getNama(){
        return nama;
    }
}
