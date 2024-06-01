package veri.yapıları;

import javax.swing.text.html.HTML;

public class BAŞTAN_SİL {
    int içerik;

    public BAŞTAN_SİL ileri;
}
 class LİSTE{
BAŞTAN_SİL bas=null;
    BAŞTAN_SİL son=null;
    void başsil(){
    if(bas==null){System.out.println("eleman yok");}
    else if(bas.ileri==null){
    bas=null;
    son=null;
        System.out.println("listede kalan son elaman silindi"
                + "");
    }
    else {
        bas=bas.ileri;
        System.out.println("baştaki eleman silindi");
    
    }
    
    }
void eklesil(int eleman){
BAŞTAN_SİL data=new BAŞTAN_SİL();
data.içerik=eleman;
if(bas==null){
bas=data;
son=data;

}
else
    data.ileri=bas;
   bas=data;
}
void sondansil(){
BAŞTAN_SİL temp=bas;
BAŞTAN_SİL temp2=bas;
while(temp.ileri!=null){
temp2=temp;
temp=temp.ileri;


}
temp2.ileri=null;
son=temp2;

}
void yazdır(){
if(bas==null) System.out.println("eleman yok");
else{ 
    BAŞTAN_SİL tmp=bas;
    while(tmp!=null){
        System.out.println(tmp.içerik);
        tmp=tmp.ileri;
    
    }
}
    
}
     public static void main(String[] args) {
         LİSTE list=new LİSTE();
         list.eklesil(50);
         list.eklesil(55);
         list.eklesil(60);
         list.yazdır();
         list.başsil();
         list.yazdır();
         list.sondansil();
         list.yazdır();
     }
}















