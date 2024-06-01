package sınavvize;
class kuyruk{
int bas,son,esay,n;
int dizi[];

    public kuyruk(int s) {
        n=s;
        dizi=new int[n];
        bas=0;
        son=-1;
    }
 void ekle(int x){
  if(son==n-1) son=-1;
  dizi[++son]=x;
  esay++;}
 int sil(){
     int tmp=dizi[bas++];
 if(bas==n)bas=0;
 esay--;
 return tmp;
 
 }
boolean boşmu(){
if(esay==0)return true;
else return false;

}
boolean dolumu(){
if(esay==n)return true;
else return false;}



}
public class KUYRUKDİZİ {
    public static void main(String[] args) {
        kuyruk k=new kuyruk(4);
        k.ekle(1);
        k.ekle(6);k.ekle(78);k.ekle(89);
        
        k.sil();
        int l=k.bas;
        //while(!k.boşmu()){System.out.println(k.dizi[l++]);k.esay--;}
        
       k.ekle(7);k.ekle(726); k.ekle(l);
        //System.out.println(k.sil());
       // System.out.println(k.sil());
        System.out.println(k.esay);
    }
}
