package AĞAÇ_EKLE_ARA_SİL;
class dugum{
dugum ileri;
int veri;
 dugum sağ=null;
   dugum sol=null;
    public dugum(int veri) {
        ileri = null;
        this.veri = veri;
    }


}
public class EKLE {
   dugum kök;
  
    public EKLE() {
        kök =null;
    }
   void ekle(dugum eleman){
   dugum tmp=kök;
   dugum once=null;
   
       while (tmp!=null) {           
           once=tmp;
           if(tmp.veri<eleman.veri){tmp=tmp.sağ;}
           else tmp=tmp.sol;
       }
       if(once==null) kök=eleman;
       else if(eleman.veri<once.veri) once.sol=eleman;
       else once.sağ=eleman;
   
   }
   dugum ara(int no){
   dugum tmp=kök;
       while (tmp!=null) { 
           if(tmp.veri==no) return tmp;  
           else if(no<tmp.veri) tmp=tmp.sol;
           else tmp=tmp.sağ;
           
       }return null;
   }
   
   void inorder(dugum kök){
        if(kök!=null){inorder(kök.sol);
        System.out.println(kök.veri);
        inorder(kök.sağ);
    } 
}}

class m{
    public static void main(String[] args) {
       dugum d=new dugum(10);
       dugum d1=new dugum(20);
       dugum d2=new dugum(5);
       dugum d3=new dugum(30);
       EKLE e=new EKLE();
       e.ekle(d);
       e.ekle(d1);
       e.ekle(d2);
       e.ekle(d3);
        System.out.println(e.ara(20)); 
        e.inorder(d);
    }
}





  