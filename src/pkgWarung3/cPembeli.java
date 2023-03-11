package pkgWarung3;
public class cPembeli {
    private String nama;
    //CONSTRUCTOR kosongan
    cPembeli(){
        nama="";
        System.out.println("Objek pembeli dibuat..");
    }
    //CONSTRUKTOR berparameter
    cPembeli(String n){
        nama=n;
        System.out.println("Objek "+nama+" dibuat..");
    }
    public void setNama(String n){
        nama=n;
    }
    public String getNama(){
        return nama;
    }
    public String ToString(){
        return "pembeli : "+nama;
    }
}
