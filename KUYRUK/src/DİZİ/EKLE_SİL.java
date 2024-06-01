
package DİZİ;
class dugum{
int dizi[];
int n;
int içerik;
dugum ileri;
int sayaç;
int bas=0;
int son=-1;

    public dugum( int n) {
        this.n=n;
        dizi=new int[n];
        sayaç=0;
        ileri=null;
    }
    boolean bşmu(){
    return sayaç==0;
    }
    boolean dlmu(){
    return sayaç==n;
    } 
    
void ekle(int eleman){
  if(sayaç<n){
   if(son==n)son=-1;
      son++;
  dizi[son]=eleman;
  sayaç++;
  
  }}

int sil(){
int tmp=dizi[bas];
bas++;
sayaç--;
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

public class EKLE_SİL {


    public static void main(String[] args) {
    
    dugum d=new dugum(4);
   d.ekle(15);
    d.ekle(25);
    d.ekle(68);
    d.ekle(2);
    d.yazdır();
        System.out.println(" ");
   d.sil();
   d.ekle(6);
    d.yazdır();
    }
    
}
