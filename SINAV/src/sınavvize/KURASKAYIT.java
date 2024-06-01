
package sınavvize;
class bilgi{ 
          int tc; 
          String ad,soyad,mezunol;
            bilgi ileri;

    public bilgi(int tc, String ad, String soyad, String mezunol) {
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.mezunol = mezunol;
        ileri = null;
    }}
    class kod{
    bilgi üst;

        public kod() {
       üst=null; }
    
    boolean boşmu(){
        if(üst==null) return true;
        else 
            return false;}
    void ekle(bilgi eleman){
    eleman.ileri=üst;
        üst=eleman;
   
    }
    bilgi sil(){
        bilgi tmp=üst;
    if(!boşmu()){üst.ileri=üst; }
    return tmp; }
    void yaz(){
    bilgi tmp1=üst;
    while(boşmu()==false){
        System.out.println(üst.ad + " "+ üst.soyad + " "+ üst.tc + " "+ üst.mezunol);
        üst=üst.ileri;
    }
    
    
    } 
    
    
    
    
     int büyük(){ 
         int enb=üst.tc;
     while(boşmu()==false){
      
     if(enb<üst.ileri.tc){enb=üst.ileri.tc;}
     üst=üst.ileri;
         
     }
        return enb;
     
     } 
                                                                                
                                                                                
                     
                 }

public class KURASKAYIT {
    public static void main(String[] args) {
     bilgi b=new bilgi(45565,"mert","yiğit", "bm");
     bilgi b1=new bilgi(456,"irem", "öztaş", "mat");
     kod k= new kod();
     k.ekle(b);
     k.ekle(b1);
     k.yaz();
     System.out.println();
    }
}
                











