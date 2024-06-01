package sınavvize;
class dugum{
int içerik;
dugum ileri;
dugum(int içerik){

this.içerik=içerik;
ileri=null;
}
}
public class enbsonaAT {
    dugum bas;
    dugum son;

    public enbsonaAT() {
        this.bas = null;
        this.son = null;
    }
   void ekle(dugum eleman){
   if(bas==null){bas=eleman;
   son=eleman;}
   else{son.ileri=eleman;
   son=eleman;}
   } 
   
   
   void max(dugum l){
   dugum enb=l;
  dugum tmp=bas; dugum tmp2,tmponce;
  while(tmp!=null){
 if(enb.içerik<tmp.içerik) enb=tmp;
  tmp=tmp.ileri;
  }
  tmp2=bas;
  tmponce=null;
 while(tmp2!=enb){
  tmponce=tmp2;
  tmp2=tmp2.ileri;
  } 
 tmponce.ileri=tmp2.ileri;
    son.ileri=tmp2;
   tmp2.ileri=null;
   son=tmp2;
   }
   
   
   
   
   void yazdır(){
   dugum tmp=bas;
   while(tmp!=null){
       System.out.println(tmp.içerik);
       tmp=tmp.ileri;
   }
   
   }
    public static void main(String[] args) {
        dugum d=new dugum(15);
        dugum d1=new dugum(18);
        dugum d3=new dugum(21);
        dugum d4=new dugum(5);
        enbsonaAT at=new enbsonaAT();
        at.ekle(d);
        at.ekle(d1);
        at.ekle(d3);
        at.ekle(d4);
       at.yazdır();
        at.max(d); 
      at.yazdır();
    
    }
}









