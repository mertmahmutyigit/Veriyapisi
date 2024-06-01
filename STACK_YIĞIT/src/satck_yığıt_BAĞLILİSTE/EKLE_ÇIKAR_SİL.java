
package satck_yığıt_BAĞLILİSTE;

class dgm{
dgm ileri;
int içerik;

    public dgm( int içerik) {
        ileri = null;
        this.içerik = içerik;
    }



}
public class EKLE_ÇIKAR_SİL {
  dgm üst=null;
 
    boolean boşmu(){
    return üst==null;
    
    }
    void ekle(dgm eleman){
    if(boşmu()){
    üst=eleman;}
    else{
    eleman.ileri=üst;
    üst=eleman;
    }  }
    
    dgm sil(){
        dgm tmp=üst;
    if(!boşmu()){
    üst=üst.ileri;}
    else System.out.println("silinecek dugum yok");
    return tmp;
    }
    
    void yazdır(){dgm tmp=üst;
        while (tmp!=null) {
            System.out.print(" ->"+ tmp.içerik   );            
            tmp=tmp.ileri;}
}
}
class m2{

    public static void main(String[] args) {
        dgm d=new dgm(45);
        dgm d1=new dgm(480);
        dgm d2=new dgm(68);
        EKLE_ÇIKAR_SİL e=new EKLE_ÇIKAR_SİL();
        e.ekle(d2);
        e.ekle(d1);
        e.ekle(d);
        e.yazdır();
        e.sil();
        System.out.println(" ");
        e.yazdır();
    }


}

























