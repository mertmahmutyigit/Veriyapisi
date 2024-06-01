package DİZİ;

public class örnek {
    örnek dizi[];
    int bas;
    int son;
    int n;
    int sayaç;

    public örnek(int n) {
        bas=0;
        son=-1;
        this.n=n;
        sayaç=0;
        dizi=new örnek[n];
    }
    boolean dolumu(){
    return sayaç==n;
    
    }
    boolean bosmu(){
    return sayaç==0;
    }
    void ekle(örnek içerik){
    if(!dolumu()){
        
    dizi[son++]=içerik;
    sayaç++;
    } }
    örnek sil(){
    örnek tmp=dizi[bas];
    if(!bosmu()){
    bas++;
    }
    return tmp;
    }
    void yazdır(){
    
   int tmp=bas;
    while (tmp<sayaç) {
        System.out.print(dizi[tmp]+ " ->");        
        tmp++;
    }        
            
        }
    
    }
 class E {


    public static void main(String[] args) {
    
    dugum d=new dugum(10);
   d.ekle(15);
    d.ekle(25);
    d.ekle(68);
    d.yazdır();
        System.out.println(" ");
    d.sil();
    d.yazdır();
    }
    
}








