package veri.yapıları;

public class SIRALI_DİZİDE_İKİLİ_ARAMA {
int dizideara(int [] dizi, int k){
int sol =0;
int sag=dizi.length-1;
int orta;
orta=(sol+sag)/2;
    while (sol<=sag) {
if(k<dizi[orta])        
     sag=orta-1;
else
    if(k>dizi[orta])
        sol=orta+1;
    else 
        sol=sag;
 
 
        }
 return orta;} 
    public static void main(String[] args) {
        SIRALI_DİZİDE_İKİLİ_ARAMA m=new SIRALI_DİZİDE_İKİLİ_ARAMA();
       int[] diz={1,2,3,4,5,6,7,8,9,10};
     int h=   m.dizideara(diz, 2);
       System.out.println(h); 
    }
}
