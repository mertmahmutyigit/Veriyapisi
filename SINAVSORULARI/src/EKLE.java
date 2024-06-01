class dugum{
int içerik;
dugum ileri; dugum   bas,bas1=null;
      dugum  son,son1=null;
    public dugum(int içerik) {
        this.içerik = içerik;
     ileri=null;
        
    }
}


public class EKLE {
 dugum bas1;
 dugum son1;
     dugum bas;
 dugum son;
   void basaekle(dugum eleman,dugum eleman2){
      
   if(bas==null){bas=eleman;son=eleman;}
   
   else
   {eleman.ileri=bas;
      bas=eleman; }
   if(bas1==null){bas1=eleman2;son1=eleman2;}
   
   else
   {eleman2.ileri=bas1;
      bas1=eleman2; }
   }

void yazdır(){
dugum tmp=bas;
    while (tmp!=null) {
        System.out.print(tmp.içerik + "-->");
        tmp=tmp.ileri;
        
    }
    dugum tmp2=bas1; 
    System.out.println(" ");
 while (tmp2!=null) {
        System.out.print(tmp2.içerik + "-->");
        tmp2=tmp2.ileri;
        
    }

}
 
 void listebirleş(){
 dugum tmp=bas;
 dugum tmp2=bas1;
 dugum tmp3=null;
     while (tmp!=null) {         
         if(tmp.içerik<tmp2.içerik)
         if(tmp3==null){tmp3.bas=tmp; tmp3.son=tmp2;}
         else 
             tmp3.son=tmp;
             tmp3.son.ileri=tmp2;
            
             
             
             }
     tmp.ileri=bas1;
    
 
 
   
     }
 } 






}





class m{
    public static void main(String[] args) {
        dugum d=new dugum(15); 
        dugum d1=new dugum(25);
        dugum d2=new dugum(35);
        dugum d3=new dugum(30);
        EKLE e=new EKLE(); 
        dugum r=new dugum(10); 
        dugum r2=new dugum(20);
        dugum r3=new dugum(40);
        dugum r4=new dugum(41);
        e.basaekle(d3,r);
        e.basaekle(d2,r2);
        e.basaekle(d1,r3);
        
              e.yazdır();
        System.out.println("");
       e.listebirleş();
        
    }


}