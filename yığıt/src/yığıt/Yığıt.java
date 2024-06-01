package yığıt;
// 12 yi ikilik tabana dönüştürme 
public class Yığıt {
eleman ust;
Yığıt(){ust =null;}


   boolean boşmu(){return ust==null;} 
  void ekle(eleman yeni){
  if(ust==null){ust=yeni;}
  else{yeni.ileri=ust;ust=yeni;}
  }
  eleman sil(){
  eleman e=ust;
  if(!boşmu()){
  ust=ust.ileri;
  return e;
  }
  return null;
  }

eleman ustdondur(){
return ust;}

}







class eleman{
char içerik;
eleman ileri;

    public eleman(char içerik) {
        this.içerik=içerik;
        ileri=null;
    }
}

class yıgıtkuyruk{
public static void num2(int sayi){
    Yığıt y=new Yığıt();
        while (sayi>0) {
           int k=sayi%2;
           y.ekle(new eleman(k));
           sayi=sayi%2;}
            System.out.print("ikili sayı= ");
            while(!y.boşmu()){eleman e=y.sil();
                System.out.print(e.içerik+"");}
     
          
    }

    public static void main(String[] args) {
         
    }


}
class Kuyruk{

    eleman bas,son;

    public Kuyruk() {
        bas=null;
        son=null;
    }
boolean bosmu(){return son==null;}
    
void ekle(eleman yeni)  {
if(bosmu()){bas=yeni;son=yeni;}
else{son.ileri=yeni;son=yeni;}
}  
eleman sil(){
eleman sonuç;
if(!bosmu()){
sonuç=bas;
bas=bas.ileri;
if(bas==null)sonuç=null;
return sonuç;}
return null;}

}



































