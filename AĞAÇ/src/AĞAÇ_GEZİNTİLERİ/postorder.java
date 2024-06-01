package AĞAÇ_GEZİNTİLERİ;
//sol-sağ-kök
public class postorder {
    void postorder(dugum kök){
    
    if(kök!=null){
        postorder(kök.sol);
        postorder(kök.sağ);
        System.out.println(kök.veri);
    
    
    }
    }
}
