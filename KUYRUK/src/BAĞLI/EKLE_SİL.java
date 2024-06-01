package BAĞLI;
class dugum{
int içerik;
dugum ileri;

    public dugum(int içerik) {
        this.içerik = içerik;
       ileri = null;
    }


}



public class EKLE_SİL {
 dugum bas=null;
 dugum son=null;
 boolean boşmu(){
 return  bas==null;
 
 }
 void ekle(dugum eleman){
 if(boşmu()){
 bas=eleman;son=eleman; }
 else 
     son.ileri=eleman;
 son=eleman;
           
 }
 dugum sil(){
 dugum tmp=bas;
 if(!boşmu()){
 bas=bas.ileri;
 }
 return  tmp;
 }
 void yazdır(){
    dugum tmp=bas;  
 if(!boşmu()){

     while (tmp!=null) {         
          System.out.println(tmp.içerik);
     tmp=tmp.ileri;
     }
   
 }
 }
}

class d{

    public static void main(String[] args) {
        dugum d=new dugum(15);
        dugum d1=new dugum(20);
        dugum d2=new dugum(56);
        EKLE_SİL e=new EKLE_SİL();
        e.ekle(d);
        e.ekle(d1);
        e.ekle(d2);
        e.yazdır();
        e.sil();
        System.out.println("");
        e.yazdır();
    }
}





