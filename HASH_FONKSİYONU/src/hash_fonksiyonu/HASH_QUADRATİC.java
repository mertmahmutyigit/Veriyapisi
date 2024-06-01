package hash_fonksiyonu;

public class HASH_QUADRATİC {
    int tablo[]=new int[10];
    int mod(int anahtar){
    return anahtar%10;
    
    }
    
    void ekle(int anahtar){
    int indis=mod(anahtar);
    int indis2=indis; int artış=0;
    while(tablo[indis2]!=0){indis2=(indis+artış*artış)%10;artış++;}
                        tablo[indis2]=anahtar;}
    
   int ara(int anahtar){
   int indis=mod(anahtar);
   if(tablo[indis]==anahtar)return indis;
   else{int indis2=indis;int artış=1;
   while(tablo[indis2]!=0){
       indis2=(indis+artış*artış)%10;artış++;
      if(tablo[indis2]==anahtar)return indis2;
   }}
   return -1;
   }
   void sil(int anahtar){
   int indis=ara(anahtar);
   if(indis!=-1&& tablo[indis]!=0){
   
   tablo[indis]=-1;
   }
   
   
   }
   void listele(){
       for (int i = 0; i < 10; i++) {
           System.out.println(tablo[i]+ " ");
       }
   }

    public static void main(String[] args) {
        HASH_QUADRATİC h=new HASH_QUADRATİC();
        h.ekle(45);
        h.ekle(74);
        h.ekle(87);
      h.ekle(4);
      h.ekle(14);
    h.ekle(7);
    h.sil(4);
    h.sil(115);
      h.listele();
    
    }


}
