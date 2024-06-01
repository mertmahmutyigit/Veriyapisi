package veri.yapıları;

public class BAŞA_EKLE {
    int data;

   BAŞA_EKLE ileri;
}
 
class tekyönlülisteyapısı{

    BAŞA_EKLE baş=null;
    BAŞA_EKLE son=null;
    void başaekle(int x){
    BAŞA_EKLE eleman=new BAŞA_EKLE();
    eleman.data=x;
    eleman.ileri=null;
    if(baş==null){
    eleman.ileri=null;
    baş=eleman;
    son=eleman;
    
    }
   else
    {
        eleman.ileri=baş;
        baş=eleman;
    }
    
    
    
    }
void göster(){
if(baş==null){

    System.out.println("liste yapısı boş");
}
else
{
   BAŞA_EKLE temp=baş;
    System.out.println("baş ==>");
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.ileri;
       
    } System.out.println("son");
}
}
}

class v{
    public static void main(String[] args) {
       tekyönlülisteyapısı list=new tekyönlülisteyapısı();
       list.başaekle(50);
       list.başaekle(30);list.göster();
    }}

    
    
    
    
