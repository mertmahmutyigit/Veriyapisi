package satck_yığıt_BAĞLILİSTE;
class dugum{
String ad,soyad,mezunolduğubölüm,tc;
dugum ileri;

    public dugum(String ad, String soyad, String mezunolduğubölüm,String tc) {
        this.ad = ad;
        this.tc=tc;
        this.soyad = soyad;
        this.mezunolduğubölüm = mezunolduğubölüm;
        ileri = null;
    }

    
}
public class KURS_KAYIT_UYGULAMASI {
    dugum üst=null;
    int sayaç;
    boolean boşmu(){
    return üst==null;
    }
    void ekle(dugum eleman){
    if(üst==null){üst=eleman;}
    else 
        eleman.ileri=üst;
    üst=eleman;
    }
    
    dugum sil(){ dugum tmp=üst;
    if(!boşmu()){üst=üst.ileri;}
    else 
            System.out.println("silinecek eleman yok");
    return tmp;}
    
    void yazdır(){
    dugum tmp=üst;
        while (tmp!=null) {
            System.out.println(tmp.ad +" "+ tmp.soyad + " "+ tmp.mezunolduğubölüm+" "+ tmp.tc);            
            tmp=tmp.ileri;
        }
    }
}

class m{
    public static void main(String[] args) {
        dugum d=new dugum("mert","yiğit", "bilgisayar müh","14525");
        KURS_KAYIT_UYGULAMASI k=new KURS_KAYIT_UYGULAMASI();
        k.ekle(d);
        k.yazdır();
    }
        
        }