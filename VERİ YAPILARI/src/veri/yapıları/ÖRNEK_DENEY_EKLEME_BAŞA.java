package veri.yapıları;

public class ÖRNEK_DENEY_EKLEME_BAŞA {
    int içerik;

    public ÖRNEK_DENEY_EKLEME_BAŞA ileri;
}
class liste{

ÖRNEK_DENEY_EKLEME_BAŞA bas=null;
ÖRNEK_DENEY_EKLEME_BAŞA son=null;
void başaekle(int x){
ÖRNEK_DENEY_EKLEME_BAŞA k=new ÖRNEK_DENEY_EKLEME_BAŞA();
k.içerik=x;
//k.ileri=null;
if(bas==null){k.ileri=null;
bas=k;
son=k;

}
else
    k.ileri=bas;
    bas=k;
}
}