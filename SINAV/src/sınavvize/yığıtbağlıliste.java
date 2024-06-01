package sınavvize;
// bağlı liste ile yığıt stack
class bağlıyıgıt{
int data;
bağlıyıgıt ileri;
    public bağlıyıgıt(int x) {
      data=x;
        ileri=null;
    }
}
class yıgıtkod{
bağlıyıgıt üst;

    public yıgıtkod() {
        this.üst = üst;
        üst=null;
    }
boolean boşmu(){
if(üst==null) return true;
else 
    return false;
}
void ekle(bağlıyıgıt data){
if(boşmu()){ üst=data;}
else{data.ileri=üst;
       üst=data;}
}
bağlıyıgıt sil(){
bağlıyıgıt e=üst;
if(!boşmu()){
üst.ileri=üst;
return e;
}
else return null;

}

void yazdır(){
bağlıyıgıt tmp=üst;
while(tmp!=null){
    System.out.println(tmp.data);
    tmp=tmp.ileri;
}

}

}


public class yığıtbağlıliste {
     public static void main(String[] args) {
        bağlıyıgıt n=new bağlıyıgıt(10);
        bağlıyıgıt n1=new bağlıyıgıt(12);
        yıgıtkod m=new yıgıtkod();
        m.ekle(n);
        m.ekle(n1);
        m.yazdır();
    }
}
