package veri.yapıları;

import javax.xml.datatype.DatatypeFactory;

class düğüm{
int data;
düğüm next;


}

class listeoluştur{
düğüm baş=null;
düğüm son=null;
void düğümekle(int x){
düğüm eleman=new düğüm();
eleman.data=x;
baş=eleman;
baş.next=null;
if(baş==null){
   // System.out.println("düğüm oluşmamıştır");
   baş=eleman;
   son=eleman;
}
else
son.next=eleman;
son=eleman;


}
void yazdır(){
if(baş==null){System.out.println("liste oluşmamıştır");}
else{
    while(baş!=null){
        System.out.println(baş.data);
     baş=baş.next;
    }
}

}


}


public class TEK_YÖNLÜ_BAĞIL_LİSTE1 {
    public static void main(String[] args) {
        listeoluştur liste=new listeoluştur();
        düğüm d=new düğüm();
        
        
        liste.yazdır();
        liste.düğümekle(5);
        liste.yazdır();
    }
}
