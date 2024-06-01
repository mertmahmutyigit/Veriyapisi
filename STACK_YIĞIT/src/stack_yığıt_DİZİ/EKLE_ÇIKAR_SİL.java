
package stack_yığıt_DİZİ;

class yıgıt{
int içerik;

    public yıgıt(int içerik) {
        this.içerik = içerik;
    }


}
public class EKLE_ÇIKAR_SİL {
    yıgıt dizi[];
    int üst;
    int N;
    public EKLE_ÇIKAR_SİL( int N) {
        
        this.N = N;
        dizi=new yıgıt[N];
        üst=-1;
    }
    
    boolean boşmu(){
    return üst==-1;
    }
    boolean dolumu(){
    return üst==N-1;
    }
    void ekle(yıgıt eleman){
    
        if(!dolumu()) {
        üst++;
        dizi[üst]=eleman;
        } 
       
    }
    yıgıt sil(){
    if(!boşmu()){
    
     üst--;
    return dizi[üst+1];
    }return null;
    }
    void yazdır(){
      int sayaç=üst;
        while (sayaç>=0) {
            System.out.print(dizi[sayaç].içerik+ " -->");           
            sayaç--;
        }
    
    
    }
    public static void main(String[] args) {
        yıgıt y=new yıgıt(15);
        yıgıt y1=new yıgıt(78);
        yıgıt y2=new yıgıt(45);
        yıgıt y3=new yıgıt(98);
        yıgıt y4=new yıgıt(61);
        yıgıt y5=new yıgıt(21);
        EKLE_ÇIKAR_SİL e=new EKLE_ÇIKAR_SİL(10);
        e.ekle(y5);
        e.ekle(y4);
        e.ekle(y3);
        e.ekle(y2);
        e.ekle(y1);
        e.ekle(y);
        e.yazdır();
        System.out.println(" ");
        e.sil();
        e.yazdır();
    }
}
