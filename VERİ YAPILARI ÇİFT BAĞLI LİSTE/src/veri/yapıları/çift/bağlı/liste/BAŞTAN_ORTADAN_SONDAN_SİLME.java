
package veri.yapıları.çift.bağlı.liste;
public class BAŞTAN_ORTADAN_SONDAN_SİLME {
    int içerik;
 BAŞTAN_ORTADAN_SONDAN_SİLME ileri;
 BAŞTAN_ORTADAN_SONDAN_SİLME geri;
 public BAŞTAN_ORTADAN_SONDAN_SİLME(int içerik ){
 this.içerik=içerik;
 ileri=null;
 geri=null;
 
 }}

 class LİSTEBAŞINA_EKLEMEe {
  BAŞTAN_ORTADAN_SONDAN_SİLME bas;
 BAŞTAN_ORTADAN_SONDAN_SİLME son;

    public LİSTEBAŞINA_EKLEMEe() {
        bas=null;
        son=null;
    }
   
void basaekle(BAŞTAN_ORTADAN_SONDAN_SİLME yeni){
if(bas==null) { bas=yeni; son=yeni;}
else{
yeni.ileri=bas;
bas.geri=yeni;
bas=yeni;
}
}

    
    
    
void sonaekle(BAŞTAN_ORTADAN_SONDAN_SİLME yeni){
if(bas==null){System.out.println("liste boş");}
else{
son.ileri=yeni;
yeni.geri=son;
son=yeni;

}

}


void yazdır(){
if(bas==null)System.out.println("liste boş");
else{ BAŞTAN_ORTADAN_SONDAN_SİLME tmp=bas;
while(tmp!=null){
    System.out.print(tmp.içerik+" --> ");
   tmp=tmp.ileri;
}
}
}

 void başsil(){
 bas=bas.ileri;
 if(bas==null) {son=null;}
 else 
     bas.geri=null;
 }
 
void sondansil(){
son=son.geri;
if(bas==null){bas=null;}
else{
    son.ileri=null;}
}
 
void ortadansil(BAŞTAN_ORTADAN_SONDAN_SİLME eleman){
eleman.ileri.geri=eleman.geri;
eleman.geri.ileri=eleman.ileri;

}



 }
class E{
    public static void main(String[] args) {
    BAŞTAN_ORTADAN_SONDAN_SİLME n=new BAŞTAN_ORTADAN_SONDAN_SİLME(10);
   BAŞTAN_ORTADAN_SONDAN_SİLME n1=new BAŞTAN_ORTADAN_SONDAN_SİLME(11);
      BAŞTAN_ORTADAN_SONDAN_SİLME n2=new BAŞTAN_ORTADAN_SONDAN_SİLME(12);
     BAŞTAN_ORTADAN_SONDAN_SİLME n4=new BAŞTAN_ORTADAN_SONDAN_SİLME(18);
//BAŞTAN_ORTADAN_SONDAN_SİLME n3=new BAŞTAN_ORTADAN_SONDAN_SİLME(11);
      LİSTEBAŞINA_EKLEMEe l=new LİSTEBAŞINA_EKLEMEe();
      //l.basaekle(n);
      l.basaekle(n1);
      l.basaekle(n2);
      l.sonaekle(n);
     // l.başsil();
     //l.sondansil();
    // l.ortadansil(n1);
     //l.sonaekle2(n4);
      l.yazdır();
    }



}

