package pkgWarung;
public class cWarung {
    private String nama;
    private String alamat;
    cWarung(String n, String a){
        nama=n; alamat=a;
        System.out.println("Objek Warung "+nama+" dibuat..");
    }
    //setter
    public void setAlamat(String a){
        alamat = a;
    }
    //getter
    
    //ToString
    public String ToString(){
        return "Warung "+nama+" ["+alamat+"]";
    }
}
