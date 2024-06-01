package sınavvize;

import com.sun.swing.internal.plaf.basic.resources.basic;

class cev{
int dizi[];
int baş,son,n,esay;

    public cev(int n) {
    this.n=n;
    baş=0;
    son=0;
    dizi=new int[n];
    esay=0;
    }
boolean dolumu(){
if(baş==(son+1)%n)return true;
else return false; }
boolean boşmu(){if(baş==son)return true;
else return false;}
void ekle(int x){
if(!dolumu()){
dizi[son]=x; son=(son+1)%n; esay++;

}

}
int sil(){

if(!boşmu()){
    int tmp=dizi[baş];
  baş=(baş+1)%n;return tmp;
}
return 0;
}


}
public class ÇEVRİMSELKUYRUK {
    public static void main(String[] args) {
        cev c=new cev(6);
        c.ekle(10);
        c.ekle(45);
        c.ekle(65);
        c.ekle(12);
        c.ekle(78);
        c.ekle(91);
        while(!c.boşmu()){System.out.println(c.sil());}
    }
   
}
