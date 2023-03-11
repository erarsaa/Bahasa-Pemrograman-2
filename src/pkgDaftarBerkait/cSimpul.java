package pkgDaftarBerkait;
public class cSimpul {
    private String nama;
    cSimpul next;
    cSimpul (String n){
        nama=n; next=null;
        System.out.println("Object "+n+" dibuat...");
    }
    public String getNama(){
        return nama;
    }
    
}
