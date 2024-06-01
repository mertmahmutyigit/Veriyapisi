package veri.yapıları;

public class bağlıliste {
dugum bas;
public bağlıliste(){
bas=null;
}
    
 void basaekle(dugum yeni){
 if(bas==null){bas=yeni;}
 else{yeni.ileri=bas;bas=yeni;}
 }   
    
 void sonaekle(dugum yeni){
 if(bas==null){bas=yeni;}
 else{dugum tmp=bas;// else if 2 değer olduğunda
 while(tmp.ileri!=null)
     tmp=tmp.ileri;
     tmp.ileri=yeni;
   // tmp.ileri=yeni;
   // tmp=yeni;
    
 }
    
    
 }   
 void sıralıekle(dugum yeni){
     
 dugum tmp=null;
 if(bas==null || bas.no>=yeni.no){
    yeni.ileri=bas;bas=yeni;}
 else{tmp=bas;
 while(tmp.ileri!=null&& tmp.ileri.no<yeni.no)
 tmp=tmp.ileri;
 yeni.ileri=tmp.ileri;tmp.ileri=yeni;
 }
 } 
 void bastansil(){
 if(bas!=null)bas=bas.ileri;
 
 }
 void sil(int no){
 dugum tmp=bas;
 dugum once=null;
 if(tmp!=null && tmp.no==no){
 bas=bas.ileri;
 return;
 }
 while(tmp!=null && tmp.no!=no){
 once=tmp;
 tmp=tmp.ileri;
 
 
 }
 if(tmp==null)return;
 once.ileri=tmp.ileri;
 }        
  
 
   String listele(){
   String S="";
   dugum tmp=bas;
   while(tmp!=null){
   S=S+tmp.no+" -"+ tmp.isim+" -<";
   tmp=tmp.ileri;
   }
   return S;
   }
 
    public static void main(String[] args) {
        bağlıliste b=new bağlıliste();
          dugum l=new dugum(62,"yakup"); dugum h=new dugum(61,"denno");
          dugum k=new dugum(55,"mert");
          dugum d=new dugum(60,"kelo");
         
        
          b.basaekle(k);  b.sonaekle(l); b.sıralıekle(h);
          b.basaekle(d);
          
          b.sonaekle(d);
         
        // b.sil(60);
         
         System.out.println(b.listele());
         
    }
}
class dugum{
int no;
String isim;
dugum ileri;
public dugum(int no, String isim){
this.no=no;
this.isim=isim;
ileri=null;
}
}