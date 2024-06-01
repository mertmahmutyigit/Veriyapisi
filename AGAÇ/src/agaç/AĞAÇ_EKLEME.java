
package agaç;

class dugumm{
int içerik;
dugumm sol;
dugumm sağ;

    public dugumm(int içerik) {
        this.içerik=içerik;
        sol=null;
        sağ=null;
    }


}
public class AĞAÇ_EKLEME {
  dugumm kök;

    public AĞAÇ_EKLEME(dugumm kök) {
        this.kök = kök;
    }
void ekle(dugumm yeni){
dugumm önce=null;
dugumm tmp=kök;
    while (tmp!=null) {        
        önce=tmp;
        if(tmp.içerik>yeni.içerik){
        tmp=tmp.sol;}
        else 
            tmp=tmp.sağ;
    }
  if(önce==null)kök =yeni;
  else if(yeni.içerik<önce.içerik) önce.sol=yeni;
  else önce.sağ=yeni;
}  
}
