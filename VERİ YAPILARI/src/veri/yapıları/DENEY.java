package veri.yapıları;

import sun.net.www.content.audio.x_aiff;

public class DENEY {
   int data;
   DENEY ileri;
  
    public DENEY(int x) {
        data=x;
    }

   
   
    public static void main(String[] args) {
        DENEY d=new DENEY(10);
       DENEY s=new DENEY(15);
        DENEY g=new DENEY(13);DENEY h=new DENEY(21);
      dugm k=new dugm(); 
       
       
        k.basaekle(d);
       
   k.basaekle(s);
   k.basaekle(g);
 k.sonaekle(g); 
        //k.baştansil();
      
        k.yazdır();
    }
}
class dugm{

DENEY bas=null;
DENEY son=null;

void basaekle(DENEY eleman){
if(son==null) {bas=eleman; son=eleman; System.out.println("ilk elaman eklendi " + eleman.data);}
else{
    eleman.ileri=bas;
    bas=eleman;
    
    System.out.println("başa eklendi "+ eleman.data);}
}

void sonaekle(DENEY eleman){
if(bas==null){
bas=eleman;son=eleman;}
else{
    son.ileri=eleman;
     son=eleman;
    }
}
void yazdır(){
if(bas==null)System.out.println("liste boş");
else{
     DENEY tmp=bas;
while(tmp!=null){
    System.out.print(tmp.data +"---" );
  tmp=tmp.ileri;
}
    System.out.println("son");
}
}
void baştansil(){
    
bas=bas.ileri;
    System.out.println("baştaki elamı sildik");
}
void sondansil(){
DENEY tmp=bas;
if(bas==null){System.out.println("silinecek elamn yok");}
else{
      while(tmp!=null){
      tmp=tmp.ileri;
      
      }


}

}




}




















