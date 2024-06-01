package veri.yapıları;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import java.util.Scanner;

public class OTOMASYON {
    int numara;
    String ad;
    String soyad;
    int vize;
    double ortalama;
    String durum;
    OTOMASYON ileri;
    int fin;

    public OTOMASYON(int numara, String ad, String soyad, int vize,int fin) {
        this.numara = numara;
        this.ad = ad;
        this.soyad = soyad;
        this.vize = vize;
        this.durum = durum;
        this.ileri = null;
        ortalama=vize*0.4+fin*0.6;
        if(ortalama>=50) durum="geçti";
        else 
            durum="kaldı";
        ileri=null;
    }
    
}
class listte{

OTOMASYON bas;
OTOMASYON son;
int numara;
    String ad;
    String soyad;
    int vize;
    double ortalama;
    
    OTOMASYON ileri;
    int fin;
    Scanner klavye=new Scanner(System.in);
    OTOMASYON tmp=null;
    OTOMASYON tmp2=null;
void ekle(){
    System.out.println("numarayı gir"); numara=klavye.nextInt();
    System.out.println("adı gir"); ad=klavye.nextLine();
    System.out.println("soyadı gir"); soyad=klavye.nextLine();
    System.out.println("vize gir"); vize=klavye.nextInt();
    System.out.println("final gir"); fin=klavye.nextInt();
    OTOMASYON k=new OTOMASYON(numara, ad, soyad, vize, fin);
    if(bas==null){
    bas=k;
    son=k;
    }
   else
        k.ileri=bas;
          bas=k;
          System.out.println("numaralı öğrenci kayıt edildi");
}

void sil(){
if(bas==null){System.out.println("silinecek öğrenci yok");}
else {

    System.out.println("silinecek öğrencinin numarasını gir");
    numara=klavye.nextInt();
    if(bas.ileri==null&& numara==bas.numara){bas=null;son=null;}
    else if(numara==bas.numara&&bas.ileri!=null){bas=bas.ileri;System.out.println(numara+"numaralı öğrenci silindi");}
    else{
    tmp=bas;tmp2=null;
    while(tmp.ileri!=null){
        if(numara==tmp.numara){tmp2=tmp;tmp=tmp.ileri;}
        tmp2=tmp;
    tmp=tmp.ileri;
    }
    }

}



}



}