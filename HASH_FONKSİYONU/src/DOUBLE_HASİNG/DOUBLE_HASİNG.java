
package DOUBLE_HASİNG;

public class DOUBLE_HASİNG {
       int tablo[]=new int[11];
   int hash(int eleman){
   
       return eleman%11;
   }
   int hash2(int eleman ){
   return ((eleman%7)*3)%11;
   
   }
   void ekle(int data){
   int indis=hash(data);
   int indis2=indis; int artış=0;
       while (tablo[indis2]!=0) {
          indis2=(indis+artış*hash2(data))%11; artış++;
            }
       tablo[indis2]=data; }
   
   int ara(int eleman){
   int indis=hash(eleman);
   if(tablo[indis]==eleman) return indis;
   else{
      int yeniindis=indis; int artış=0;
       while (tablo[yeniindis]!=0) {
        yeniindis=(indis+artış*hash2(eleman))%11; artış++;
        if(tablo[yeniindis]==eleman) return indis;
           
       }
   } return -1;
   }
   
   void sil(int eleman){
   int indis=ara(eleman);
   if(indis!=-1 && tablo[indis]!=0){
   
   tablo[indis]=-1;
   }
       
   
   }
}
