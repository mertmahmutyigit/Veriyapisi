
package veri.yapıları;


public class EKRANA_YAZDIRMA {
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
