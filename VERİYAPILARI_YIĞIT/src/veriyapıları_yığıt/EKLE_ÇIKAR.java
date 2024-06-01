package veriyapıları_yığıt;

public class EKLE_ÇIKAR {
int dizi[];    
int size;
int indis;

    public EKLE_ÇIKAR( int size) {
        
        this.size = size;
        dizi=new int[size];
        indis = -1;
        
    }
boolean dolumu(){return indis==size-1;}
boolean boşmu(){return indis==-1;}
void ekle(int data){
if(!dolumu()){
indis++;
dizi[indis]=data;
    System.out.println("eklenen = "+ dizi[indis]);
}}
int çıkar(){
if(!boşmu()) 
{return dizi[indis--];}
return -1;}



}
class main{

    public static void main(String[] args) {
        EKLE_ÇIKAR k=new EKLE_ÇIKAR(5);
        k.ekle(4);
        k.ekle(8);
        k.ekle(7);
        k.ekle(9);
        k.ekle(2);
        System.out.println(k.çıkar());
        k.ekle(5);
    }
}

