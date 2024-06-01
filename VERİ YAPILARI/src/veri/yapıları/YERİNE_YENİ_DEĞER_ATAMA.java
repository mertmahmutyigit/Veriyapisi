package veri.yapıları;

public class YERİNE_YENİ_DEĞER_ATAMA {

  void diziekle(int [] dizi,int k, int yeni){
  int i;
      for (int j =dizi.length-2; j>=k; j--) {
          dizi[j+1]=dizi[j];
          
      }
  dizi[k]=yeni;
      for (int j = 0; j <dizi.length-1; j++) {
          System.out.println(dizi[j]);
      }
  
  }
  
    public static void main(String[] args) {
        YERİNE_YENİ_DEĞER_ATAMA l=new YERİNE_YENİ_DEĞER_ATAMA();
     int [] diz={2,3,5,6,8,9,7,4,1,0};
        l.diziekle(diz, 6, 85);
    }
  
}
