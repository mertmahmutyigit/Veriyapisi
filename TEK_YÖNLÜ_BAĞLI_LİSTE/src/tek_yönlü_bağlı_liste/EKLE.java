package tek_yönlü_bağlı_liste;

import com.sun.swing.internal.plaf.basic.resources.basic;

class dugum{
int içerik;
dugum ileri;
    public dugum(int içerik) {
        this.içerik = içerik;
     ileri=null;
        
    }
}


public class EKLE {
 
     dugum   bas=null;
      dugum  son=null;
   void basaekle(dugum eleman){
      
   if(bas==null){bas=eleman;son=eleman;}
   
   else
   {eleman.ileri=bas;
      bas=eleman; }
   }

   void sonaekle(dugum eleman){
   if(bas==null){bas=eleman;son=eleman;}
   else 
       son.ileri=eleman;
       son=eleman;
       son.ileri=null;
   }
  
   void arayaekle(dugum yeni,dugum önce){
    yeni.ileri=önce.ileri;
    önce.ileri=yeni;
   }
void yazdır(){
dugum tmp=bas;
    while (tmp!=null) {
        System.out.print(tmp.içerik + "-->");
        tmp=tmp.ileri;
        
    }

}
  void aradansil(dugum hangisi){
   dugum tmp=bas;
   dugum tmp2=bas;
       while (tmp!=hangisi) {           
           tmp2=tmp;
           tmp=tmp.ileri;
       }
   tmp2.ileri=tmp.ileri;
   
   }
}
class m{
    public static void main(String[] args) {
        dugum d=new dugum(15); 
        dugum d1=new dugum(25);
        dugum d2=new dugum(35);
        dugum d3=new dugum(30);
        EKLE e=new EKLE();
        e.basaekle(d3);
        e.basaekle(d2);
        e.basaekle(d1);
        e.arayaekle(d,d1);
        e.aradansil(d2);
        e.yazdır();
    }


}