package liner_probing;
public class liner {
   int tablo[]=new int[10];
   int hash(int eleman){
   
       return eleman%10;
   }
   void ekle(int data){
   int indis=hash(data);
   
       while (tablo[indis]!=0) {
          indis=(indis+1)%10;
            }
       tablo[indis]=data; }
   
   int ara(int eleman){
   int indis=hash(eleman);
   if(tablo[indis]==eleman) return indis;
   else{
   
       while (tablo[indis]!=0) {
        indis=(indis+1)%10;
        if(tablo[indis]==eleman) return indis;
           
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
