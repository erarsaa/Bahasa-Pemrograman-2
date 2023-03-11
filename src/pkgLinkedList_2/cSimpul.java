package pkgLinkedList_2;
public class cSimpul {
    cBarang brg; //data
    cSimpul next;//pointer; link
    cSimpul(cBarang b){
        brg=b;
    }
    public String getData(){
        return brg.getNama();
    }
    
}
