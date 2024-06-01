
package BAĞLI_LİSTE_CHAİNNG;

class dugum{
 dugum ileri;
 int veri;

    public dugum(int veri) {
        this.veri=veri;
        ileri=null;
    }
 



}
public class ZİNCİR {
    dugum tablo[]=new dugum[10];
    int has(int eleman){
    return eleman%10;
    }
    void ekle(int eleman){
    int indis=has(eleman);
    if(tablo[indis]==null) tablo[indis].veri=eleman;
    else { 
        dugum tmp=tablo[indis];
        while (tmp.ileri!=null) {  
            tmp=tmp.ileri;
           }  tmp.veri=eleman;
    }
    
    }
    
    void sil(int eleman){
    
    int indis=has(eleman);
    
    if(tablo[indis].veri==eleman){ tablo[indis]=tablo[indis].ileri;} 
    else {
       dugum tmp=tablo[indis];
        while (tmp.ileri!=null) { 
                   if(tmp.ileri.veri==eleman){tmp.ileri=tmp.ileri.ileri;}
            tmp=tmp.ileri;
        } 
    
    }
    
    }
    
    
}









 