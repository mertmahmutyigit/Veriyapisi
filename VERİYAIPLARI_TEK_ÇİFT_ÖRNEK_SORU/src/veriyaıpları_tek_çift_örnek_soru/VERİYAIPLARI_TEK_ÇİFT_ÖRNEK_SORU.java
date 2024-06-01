package veriyaıpları_tek_çift_örnek_soru;

public class VERİYAIPLARI_TEK_ÇİFT_ÖRNEK_SORU {

    public static void main(String[] args) {
    tekbağlı a=new tekbağlı(5);
     tekbağlı a1=new tekbağlı(10);
     tekbağlı a2=new tekbağlı(15);
     tekbağlı a3=new tekbağlı(20);
     tekbağlı a4=new tekbağlı(25);
     tekbağlı a5=new tekbağlı(30);
     tekbağlı a6=new tekbağlı(35);
    listey b=new listey();
    b.başaekle(a);
    b.sonaekle(a6);
    b.başaekle(a2);
    b.başaekle(a3);
    b.sonaekle(a4);
    b.yazdır();
    //b.arayaekle(a6, a6);
    b.baştansil();
        System.out.println("");
    b.yazdır();
   // b.sondansil();
        System.out.println("");
        b.aradansil(a6);
        b.yazdır();
    }
    
}

//TEK BAĞLI VERİ YPILARI BAŞA SONA ORTAYA EKLEME BAŞTAN ORTADAN SONDAN SİLME İŞLEMLERİ
class tekbağlı{
int data;
tekbağlı ileri;
tekbağlı geri;

    public tekbağlı(int data) {
        this.data = data;
        ileri=null;
        geri=null;
    }
}

class listey{
tekbağlı bas=null;
tekbağlı son=null;
void başaekle(tekbağlı eleman){
if(bas==null){bas=eleman; son=eleman;}
else{
eleman.ileri=bas;
bas=eleman; } }

void sonaekle(tekbağlı eleman){

if(bas==null){
bas=eleman;
son=eleman;
}
else{ // tekbağlı tmp=bas;
 
//while(tmp!=null){
son.ileri=eleman;
son=eleman;}}

void arayaekle(tekbağlı yeni ,tekbağlı once){
yeni.ileri=once.ileri;
once.ileri=yeni;

}

void baştansil(){
    
if(bas==null){ son=null;}
else{ 
    bas=bas.ileri;
    
} }

void sondansil(){
if(bas==null){son=null;}
else{
tekbağlı tmp=bas;
tekbağlı tmp1=bas;
while(tmp.ileri!=null){
tmp1=tmp;
tmp=tmp.ileri;

}
tmp1.ileri=null;
son=tmp1;}
}
 
void aradansil(tekbağlı s){
tekbağlı tmp,once;
tmp=bas;
once=null;
while(tmp!=s){
once=tmp;
tmp=tmp.ileri;


}once.ileri=s.ileri;
}

void yazdır(){
tekbağlı tmp=bas;
while(tmp!=null){
    System.out.print(tmp.data +"->");
    tmp=tmp.ileri;} }
}




















