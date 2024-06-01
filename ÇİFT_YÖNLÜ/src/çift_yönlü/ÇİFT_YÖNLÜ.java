// DAİRESEL BAĞLI LİSTE
package çift_yönlü;
class dugum{
int içerik;
dugum ileri;
dugum geri;
    public dugum(int içerik) {
        this.içerik = içerik;
        ileri=null;
        geri=null;
    }

}

public class ÇİFT_YÖNLÜ {
 
    dugum bas=null;
    void ekle(dugum eleman){
    if(bas==null){eleman.ileri=eleman; eleman.geri=eleman;}
    else {
    eleman.ileri=bas;
    eleman.geri=bas.geri;
    bas.geri.ileri=eleman;
    bas.geri=eleman;
    }
    }
    
    
    public static void main(String[] args) {
    }
    
}
