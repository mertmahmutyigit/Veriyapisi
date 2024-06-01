package ağaç;

import java.util.Scanner;

class eleman{
    
    int içerik;

    public eleman(int içerik) {
        this.içerik = içerik;
    }
}
class yıgın{
eleman[] dizi;
int adet;

    public yıgın( int N) {
       dizi=new eleman[N];
       adet=0;}
    
 boolean bosmu(){return adet==0;}

void yukarıçık(int no){
int ata=(no-1)/2;
while(ata>=0&&dizi[ata].içerik<dizi[no].içerik){
eleman tmp=dizi[ata];
dizi[ata]=dizi[no];
dizi[no]=tmp;
no=ata;
ata=(no-1)/2;
}}


void ekle(eleman yeni){

dizi[adet]=yeni;
    yukarıçık(adet);
    adet++;
}
boolean maxheapmi(int d[]){ int i=0;
  boolean max=true;
    while (i<=d.length) {        
      if(d[i]>d[2*i+1] && d[i]>d[2*i+2])max=true;
      else {max=false; i=d.length;}
    }

return max;

}
void asagıin(int no){
int altsol=2*no+1,altsag=2*no+2;
while((altsol<adet&&dizi[no].içerik<dizi[altsol].içerik)||(altsag<adet&&dizi[no].içerik<dizi[altsag].içerik)){
if(altsag>=adet|| dizi[altsol].içerik>dizi[altsag].içerik){
eleman tmp=dizi[no];
dizi[no]=dizi[altsol];
dizi[altsol]=tmp;
no=altsol;}

else{
eleman temp=dizi[no];
dizi[no]=dizi[altsag];
dizi[altsag]=temp;
no=altsag;}

altsol=2*no+1;altsag=2*no+2;
}

}

  eleman azamisil(){
  if(!bosmu()){
  
  eleman tmp=dizi[0];
  dizi[0]=dizi[adet-1];
      asagıin(0);
      adet--;
      return tmp;
      
  } else return null;
  
  }// en üsteki elemanı silmeye ayrıyor 
  
  
 void yazdır(){
 
 for(int i=0; i<adet/2; i++){
 
 int sol=2*i+1;
 int sag=2*i+2;
     System.out.println("ata dugum "+ dizi[i].içerik);
     if(sol<adet)
         System.out.println("sol cocuk " + dizi[sol].içerik);
     if(sag<adet)
         System.out.println("sağ cocuk "+ dizi[sag].içerik);
     System.out.println("");
 } } 
  
}

class heapuyg{
    public static void main(String[] args) {
        yıgın y1,y2;
        y1=new yıgın(10);
        y2=new yıgın(10);
        Scanner klavye=new Scanner(System.in);
        System.out.println("Heap-1 sayıları virgul ile gir");
        String h1=klavye.nextLine();
        String[] s1=h1.split(",");
        for(int i=0;i<s1.length;i++)
        y1.ekle(new eleman(Integer.parseInt(s1[i])));
        y1.yazdır();
        System.out.println("heap-2 sayıları virgül ile gir");
        String h2=klavye.nextLine();
        String[]s2=h2.split(",");
        for(int i=0;i<s2.length;i++)
            y2.ekle(new eleman(Integer.parseInt(s2[i])));
        y2.yazdır();  }



}
