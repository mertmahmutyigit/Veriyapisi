package AĞAÇ_GEZİNTİLERİ;
// kök sol sağ
public class preorder {
    void preorder(){
        System.out.println(kök.veri);
        preorder(kök.sol);
        preorder(kök.sağ);
    }
}
