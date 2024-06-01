package veri.yapıları.çift.bağlı.liste;
//listedeki en büyük elemanı bul 
//
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HAFTA4{

}
class cliste{
celeman bas;
public cliste(){
bas=null;

}
void basaekle(celeman yeni){
if(bas==null){bas=yeni;}
else {
yeni.ileri=bas;
bas.geri=yeni;}}

 void sonaekle(celeman yeni){
if(bas==null)bas=yeni;//liste boş ise
else{
celeman tmp=bas;
while(tmp.ileri!=null){
tmp=tmp.ileri;
tmp.ileri=yeni;
yeni.geri=tmp; } }
}       
void bastansil(){
if(bas!=null){
if(bas.ileri==null)bas=null;
else{bas=bas.ileri;
bas.geri=null;}
}

}
String listele(){
String s="";
celeman tmp=bas;
while(tmp!=null){
s=s+tmp.içerik+"<=>";
tmp=tmp.ileri;
}
return s;}
void sıralıekle(celeman yeni){
if(bas==null)//liste boş ise
    bas=yeni;
else if(bas.içerik>=yeni.içerik){
yeni.ileri=bas;
bas.geri=yeni;
bas=yeni;

}
else{ 
    celeman tmp=bas;
    while(tmp.ileri!=null&& tmp.ileri.içerik<yeni.içerik)
tmp=tmp.ileri;
    yeni.ileri=tmp.ileri;
    if(tmp.ileri!=null)
        yeni.ileri.geri=yeni;
    tmp.ileri=yeni;
    yeni.geri=tmp;
}



}









String sondanlistele(){
if(bas==null)return "";
else if(bas.ileri==null) return bas.içerik+"<->";
else{
celeman tmp=bas;
String S="";
while(tmp.ileri!=null)
    tmp=tmp.ileri;
    while(tmp!=null){
        S=S +tmp.içerik+"<->";
        tmp=tmp.geri;
    
    }return S;

}

}

}

class celeman {
    int içerik;
    celeman ileri;
    celeman geri;

    public celeman(int içerik) {
        this.içerik=içerik;
        ileri=null;
        geri=null;
    }
    
}

 class Hafta4guı extends NewFrame{

cliste l;
public Hafta4guı(){
l=new cliste();
initCompontens();
private void
        int sayi=Integer.parseInt(JTextField1.getText());
        celemen c=new celemen(sayi);
        long.basaekle(c);
        JLabe2.setText(l.listele());
JLabel.setText(sondanlistele);
    private void initCompontens() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }
}



}














