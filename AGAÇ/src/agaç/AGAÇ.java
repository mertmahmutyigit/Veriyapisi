package agaç;
class dugum{
int içerik;
dugum sol; dugum sağ;

    public dugum(int içerik) {
        this.içerik = içerik;
        this.sol =null;
        this.sağ =null;
    }}



public class AGAÇ {
dugum kok;

    public AGAÇ() {
        kok=null;
    }

    void ekle(dugum eleman){
    dugum once=null;
    dugum tmp=kok;
    
    while(tmp!=null){
    once=tmp;
    if(eleman.içerik<tmp.içerik)tmp=tmp.sol;
    else  tmp=tmp.sağ;
   }
    if(once==null){kok=eleman; System.out.println(eleman.içerik+ " köke eklendi");}
    else if(eleman.içerik<once.içerik){once.sol=eleman;   System.out.println(eleman.içerik +"  eklendi");  }
    else {once.sağ=eleman; System.out.println(eleman.içerik+"  eklendi ");} }
    
    
    dugum ara(int no){
    dugum tmp=kok;
    while(tmp!=null){
    if(no==tmp.içerik) return tmp;
    else if(tmp.içerik>no)tmp=tmp.sol;
    else tmp=tmp.sağ;
    } return null; }
    
    
    void gezintipreorder(dugum kok){//kok-sol-sağ
        if(kok!=null){
            System.out.print(kok.içerik +" ");
            gezintipreorder(kok.sol);
            gezintipreorder(kok.sağ);
            
        }
    
    }
    void inorder(dugum kok){//sol-kok-sağ
    
    if(kok!=null){
        inorder(kok.sol);
        System.out.print(kok.içerik+ " ");
        inorder(kok.sağ);
    }
    
    
    }
    void postorder(dugum kok){
    if(kok!=null){
        postorder(kok.sol);
        postorder(kok.sağ);
        System.out.print(kok.içerik+" ");
    
    }
    
    }
    
    public static void main(String[] args) {
    dugum d=new dugum(10);
    dugum d1=new dugum(8);
    dugum d2=new dugum(15);
    dugum d3=new dugum(2);
    dugum d4=new dugum(1);
    dugum d5=new dugum(6);
    dugum d6=new dugum(14);
    dugum d7=new dugum(16);
    dugum d8=new dugum(9);
    
    AGAÇ k=new AGAÇ();
    k.ekle(d);
    k.ekle(d1);
    k.ekle(d2);
    k.ekle(d3);
            k.ekle(d4);
            k.ekle(d5);
            k.ekle(d6);
            k.ekle(d7);
            k.ekle(d8);
            dugum z=k.ara(15);
        System.out.println(z.içerik);
    k.gezintipreorder(d); System.out.println("");
    k.inorder(d);
        System.out.println("");
    
    k.postorder(d);
    
    
    
    }
    
}
