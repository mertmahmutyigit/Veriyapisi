package veri.yapıları.çift.bağlı.liste;
 public class EKLEBASA {

 int içerik;
 EKLEBASA ileri;
 EKLEBASA geri;
 public EKLEBASA(int içerik ){
 this.içerik=içerik;
 ileri=null;
 geri=null;
 
 }}

 class LİSTEBAŞINA_EKLEME {
  EKLEBASA bas;
EKLEBASA son;

    public LİSTEBAŞINA_EKLEME() {
        bas=null;
        son=null;
    }
void basaekle(EKLEBASA yeni){
if(bas==null) { bas=yeni; son=yeni;}
else{
yeni.ileri=bas;
bas.geri=yeni;
bas=yeni;
}
}

void sonaekle(EKLEBASA yeni){
if(bas==null){System.out.println("liste boş");}
else{
son.ileri=yeni;
yeni.geri=son;
son=yeni;

}

}

void ortayaekle(EKLEBASA yeni, EKLEBASA once){
yeni.ileri=once.ileri;
yeni.geri=once;
once.ileri.geri=yeni;
once.ileri=yeni;



}




void yazdır(){
if(bas==null)System.out.println("liste boş");
else{ EKLEBASA tmp=bas;
while(tmp!=null){
    System.out.println(tmp.içerik+"  ");
   tmp=tmp.ileri;
}
}
}
}
class d{
    public static void main(String[] args) {
    EKLEBASA n=new EKLEBASA(10);
     EKLEBASA n1=new EKLEBASA(11);
      EKLEBASA n2=new EKLEBASA(12);
      EKLEBASA n3=new EKLEBASA(18);
      LİSTEBAŞINA_EKLEME l=new LİSTEBAŞINA_EKLEME();
      //l.basaekle(n);
      l.basaekle(n1);
      l.basaekle(n2);
      l.sonaekle(n);
      l.ortayaekle(n3, n2);
      l.yazdır();
    }



}