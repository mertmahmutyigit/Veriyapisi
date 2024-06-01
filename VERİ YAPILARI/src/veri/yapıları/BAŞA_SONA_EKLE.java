package veri.yapıları;

import com.sun.swing.internal.plaf.basic.resources.basic;

public class BAŞA_SONA_EKLE {
    int data;
    BAŞA_SONA_EKLE ileri;

    public BAŞA_SONA_EKLE(int data) {
   this.data=data; }
 
}
class a{
    public static void main(String[] args) {
        BAŞA_SONA_EKLE b=new BAŞA_SONA_EKLE(10);
        BAŞA_SONA_EKLE b1=new BAŞA_SONA_EKLE(15);
        BAŞA_SONA_EKLE b3=new BAŞA_SONA_EKLE(25);
        BAŞA_SONA_EKLE b4=new BAŞA_SONA_EKLE(48);
        lst k=new lst();
        k.başaekle(b);//15 10 15
        k.başaekle(b3);
        k.sonaekle(b4);
        k.sonaekle(b1);
        System.out.println(k.listele());
        k.yazdır();
    }
}
class lst{
BAŞA_SONA_EKLE baş=null;
BAŞA_SONA_EKLE son=null;

void başaekle(BAŞA_SONA_EKLE eleman){

if(baş==null){baş=eleman;
son=eleman; }
else{
eleman.ileri=baş;
baş=eleman;
}

}
void yazdır(){
BAŞA_SONA_EKLE tmp=baş;

if(baş==null){System.out.println("listede eleman yok");}
while(tmp!=null){
    System.out.print(tmp.data +"  ");
tmp=tmp.ileri;
}
}

void sonaekle(BAŞA_SONA_EKLE eleman){
    
if(baş==null){baş=eleman; son=eleman;}
else{son.ileri=eleman;son=eleman;

   }
}

String listele(){
BAŞA_SONA_EKLE tmp=baş;
String S="";
while(tmp!=null){S=S+"  "+tmp.data; tmp=tmp.ileri;}
return S;}
}












