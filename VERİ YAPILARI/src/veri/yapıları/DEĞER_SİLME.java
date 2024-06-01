
package veri.yapıları;


public class DEĞER_SİLME {
    
 
int[] diz={1,2,3,4,5,6,7,8,9,10};
void dizidensil(int [] dizi, int k){
int i;


    for (int j = k; j < dizi.length-1; j++) {
        dizi[j]=dizi[j+1];
    }
    for (int j = 0; j < dizi.length-1; j++) {
        System.out.println(dizi[j]); 
    }
}
  
    public static void main(String[] args) {
     DEĞER_SİLME k=new DEĞER_SİLME();
   
    k.dizidensil(k.diz,5);
    }
}
  
