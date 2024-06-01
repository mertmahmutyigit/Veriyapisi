
package veriyapıları_yığıt;

import java.util.Scanner;


public class KURS_KAYIT_OTOMASYON {
    public static void main(String[] args) {
        bilgi b=new bilgi("1545","mert","yiğit","bilgisayar");
        kursStack l=new kursStack(2);
        l.ekle();
        l.ekle();
        l.yazdır();
    }
}
class bilgi{
String tc,ad,soyad,mezunoldugubölüm;
bilgi ileri;

    public bilgi(String tc, String ad, String soyad, String mezunoldugubölüm) {
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.mezunoldugubölüm = mezunoldugubölüm;
        ileri=null;
    } }

class kursStack{
bilgi top;
int kontenjan;
int sayaç;
String tc,ad,soyad,mezunoldugubölüm;
    Scanner kalavye=new Scanner(System.in);
    public kursStack( int kontenjan) {
        top =null;
        this.kontenjan = kontenjan;
        sayaç = 0;
    }
void ekle(){
    System.out.print("tc "); tc=kalavye.nextLine();
    System.out.print("ad "); ad=kalavye.nextLine();
    System.out.print("soyad ");soyad=kalavye.nextLine();
    System.out.print("mezunolduğubölüm ");mezunoldugubölüm=kalavye.nextLine();
    bilgi eleman=new bilgi(tc, ad, soyad, mezunoldugubölüm);
    if(dolumu()){ System.out.println("kurs dolu");}
    else{
    if(boşmu()){top=eleman;System.out.println(top.tc);}
    else{ 
            eleman.ileri=top;
            top=eleman;}
   sayaç++; }

}
    void sil(){
    if(boşmu()){System.out.println("boş");
    }
    else{System.out.println(top.tc + "kişisi silindi");
         top=top.ileri;
         sayaç--;
    }
    }
    

boolean dolumu(){
return sayaç==kontenjan;
}
boolean boşmu(){
return sayaç==0;
}
void yazdır(){
if(boşmu()){System.out.println("boş");}
else{
bilgi tmp=top;
while(tmp!=null){
    System.out.println(tmp.tc +" "+tmp.ad+" "+ tmp.soyad +" "+ tmp.mezunoldugubölüm);
    tmp=tmp.ileri;
}

}
}
}


























