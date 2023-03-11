package pkgTumpukan;
public class cElemen {
    private String nama;
    cElemen next; //single linked list
    cElemen(String n){
        nama=n;
        System.out.println("Object "+n+" created...");
    }
    public String getNama(){
        return nama;
    }
}
