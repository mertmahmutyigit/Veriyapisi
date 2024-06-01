package veri.yapıları;
class node{           //DÜĞÜM OLUŞTURMA
int data;
node next;            // GÖSTERİCİ

}
class listeyapısı{
    
node head=null;   //baş düğüm atama 
node tail=null;   // son düğüm oluşturma 
void ekle(int x){  //DÜĞÜM EKLEME
 node eleman=new node();   // ilk düğüm oluşturma
 eleman.data=x;
 eleman.next=null;
 if(head==null){ // ilk eleman eklenmemiş ise
 head=eleman;
 tail=eleman;
     System.out.println("liste oluştu  düğüm eklendi"); }
 else
     tail.next=eleman;
 tail=eleman;
    System.out.println("listenin sonuna yeni bir eleman eklendi");

}
void yazdır(){
if(head==null){
    System.out.println("liste boş");

}

else{System.out.print("baş -> ");
       while(head!=null) {
           System.out.print(head.data + "->");
           head=head.next;
       }
       
       System.out.println("son");
       }
    


}
   
}






public class TEK_YÖNLÜ_BAĞIL_LİSTE {
    public static void main(String[] args) {
        listeyapısı liste=new listeyapısı();
        liste.ekle(15);
        liste.ekle(16);
        liste.ekle(45);
        liste.ekle(78);
        System.out.println(" ");
        liste.yazdır();
    }
   
}
 