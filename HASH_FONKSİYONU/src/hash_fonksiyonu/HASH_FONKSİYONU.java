package hash_fonksiyonu;
//LİNER PROBİNG
public class HASH_FONKSİYONU {
  
    int tablo[]=new int[5];

     int HASH(int anahtar) {
        return anahtar%5;
    }
    
  void ekle(int anahtar){
  int indis=HASH(anahtar);int artış=0;
  if(tablo[indis]==0)tablo[indis]=anahtar;
  else {while(tablo[indis]!=0){
  indis=(indis+1)%5;
  artış++;
  if(artış>5){System.out.println("ekleyecek yer kalmadı"); System.exit(0);}
  }
  tablo[indis]=anahtar;}
  
  }
  void listele(){
      for (int i = 0; i < 5; i++) {
          System.out.print(tablo[i]+" ");
      }
  
  }
    
  int ara(int anahtar){int sayaç=0;
  int indis=HASH(anahtar);
  if(anahtar==tablo[indis]){
  return indis;}
  else{
  while(tablo[indis]!=0){
  indis=(indis+1)%5; sayaç++;
  if(anahtar==tablo[indis]){return indis;}
  else if(sayaç==6) return 0;// eğer tablo dolu ve aranan elaman yok ise
                             // tüm elemanları gezip bulamazsa while sonsuz dögüye girmesin diye yapılır
  } 
  
  }return -1;
  }  
    
void sil(int anahtar){

int indis=ara(anahtar);
if(indis!=-1&&tablo[indis]!=0){

tablo[indis]=-1;
}

}
    
    public static void main(String[] args) {   
     HASH_FONKSİYONU h=new HASH_FONKSİYONU();
    
      h.ekle(12);
      h.ekle(14);
      h.ekle(29);
      h.ekle(9);
      h.ekle(13);
     
      System.out.println(h.ara(96)); 
      //h.listele();
        //System.out.println(h.ara(7));
   
      h.listele();
        }
    }
    

   

    

