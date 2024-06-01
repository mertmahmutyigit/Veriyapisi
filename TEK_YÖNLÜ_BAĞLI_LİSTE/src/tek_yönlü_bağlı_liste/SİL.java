package tek_yönlü_bağlı_liste;
class dgum{
int içerik;
dgum ileri;

    public dgum(int içerik) {
        this.içerik = içerik;
        ileri =null;
    }



}
public class SİL {
   dgum bas=null;
   dgum son=null;
   void bassil(){
   if(bas==null) System.out.println("silinecek eleman yok");
   else{ 
       dgum tmp=bas;
               
       bas=bas.ileri;}
   
   }
   void sonsil(){
   dgum tmp=bas;
   dgum tmp2=bas;
   while(tmp!=null){
       tmp2=tmp;
       tmp=tmp.ileri;
    
   }
    tmp2.ileri=null;
    son=tmp2;
   }
   void aradansil(dgum hangisi){
   dgum tmp=bas;
   dgum tmp2=bas;
       while (tmp!=hangisi) {           
           tmp2=tmp;
           tmp=tmp.ileri;
       }
   tmp2.ileri=tmp.ileri;
   
   }
}
