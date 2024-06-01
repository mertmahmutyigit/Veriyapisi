package QUADRATİC;

public class QUADRATİC {
     int tablo[]=new int[10];
   int hash(int eleman){
   
       return eleman%10;
   }
   void ekle(int data){
   int indis=hash(data);
   int yenindis=indis; int artış=0;
       while (tablo[indis]!=0) {
          yenindis=(indis+artış*artış)%10; artış++;
            }
       tablo[yenindis]=data; }
   
   int ara(int eleman){
   int indis=hash(eleman);
   int yenids=indis; int artış=0;
   if(tablo[yenids]==eleman) return yenids;
   else{
   
       while (tablo[yenids]!=0) {
        yenids=(indis+artış*artış)%10; artış++;
        if(tablo[yenids]==eleman) return yenids;
           
       }
   } return -1;
   }
   
   void sil(int eleman){
   int indis=ara(eleman);
   if(indis!=-1 && tablo[indis]!=0){
   
   tablo[indis]=-1;
   }
       
}}
