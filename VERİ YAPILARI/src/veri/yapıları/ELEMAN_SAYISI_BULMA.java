package veri.yapıları;

import com.sun.swing.internal.plaf.basic.resources.basic;

class bul{
int data;
bul ileri;


}
class terçevir{
bul bas,son;
int elemanSayısı(){
int sayaç=0;
bul tmp;
tmp=bas;
while(tmp!=null){
tmp=tmp.ileri;
sayaç++;
}
return sayaç;
}

}




public class ELEMAN_SAYISI_BULMA {
    
}
