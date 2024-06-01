
package BAĞLI_LİSTE_CHAİNNG;
class dugm{
int içerik;
dugm ileri;

    public dugm(int içerik) {
        this.içerik = içerik;
        ileri = null;
    }


}

public class zincir {
   dugm dizi[]=new dugm[10];
   
   int hash(int içerik){
   return içerik%10; }
   
   void ekle(int içerik){
   dugm yeni=new dugm(içerik);
   int indis=hash(içerik);
   if(dizi[indis]==null) dizi[içerik]=yeni;
   else{ 
       dugm tmp=dizi[indis];
       
       while (tmp.ileri!=null) {           
           tmp=tmp.ileri;
       } tmp.ileri=yeni;
   
   }
   
   
   }
   
   
}
