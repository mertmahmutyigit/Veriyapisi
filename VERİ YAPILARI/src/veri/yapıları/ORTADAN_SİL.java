package veri.yapıları;

public class ORTADAN_SİL {
    int data;
    public ORTADAN_SİL ileri;

    public ORTADAN_SİL(int x) {
        data=x;
    }
    
    
    
    public static void main(String[] args) {
        ORTADAN_SİL k=new ORTADAN_SİL(10);
          ORTADAN_SİL a=new ORTADAN_SİL(15);
            ORTADAN_SİL s=new ORTADAN_SİL(20);
              ORTADAN_SİL d=new ORTADAN_SİL(25);
        list l=new list();
       l.ekle(k);
       l.ekle(a);
       l.ekle(s);
       l.ekle(d);
       l.yazdır();
       l.ortadansil(s);
       l.yazdır();
    }
    
}
class list{
ORTADAN_SİL bas=null;
ORTADAN_SİL son=null;
void ekle(ORTADAN_SİL eleman){// basşa ekleme yaptık
ORTADAN_SİL tmp=null;
if(bas==null){
bas=eleman;
}
else{ 
  eleman.ileri=bas;
  bas=eleman;
  }

}
void ortadansil(ORTADAN_SİL s){//ortadan silme yaptık
ORTADAN_SİL tmpe,once;
tmpe=bas;
once=null;
while(tmpe!=s){
once=tmpe;
tmpe=tmpe.ileri;
}
once.ileri=s.ileri;
}

void yazdır(){// yazdırma işlemi yaptık
if(bas==null)System.out.println("liste boş");
else{
     ORTADAN_SİL tmpr=bas;
while(tmpr!=null){
    System.out.print(tmpr.data +"---" );
  tmpr=tmpr.ileri;
}
    System.out.println("son");
}
}


}

