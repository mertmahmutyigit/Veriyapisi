package veriyapıları_yığıt;
public class VERİYAPILARI_YIĞIT {
int içerik;

    public VERİYAPILARI_YIĞIT(int içerik) {
        this.içerik = içerik;
    }
 


    public static void main(String[] args) {
   VERİYAPILARI_YIĞIT b=new VERİYAPILARI_YIĞIT(10);
   yığıt y=new yığıt(4); 
  y.yıgıtaekle(b);
  
        //System.out.println( y.yıgıtsil());
         
    }
    
   
   
}

class yığıt{
VERİYAPILARI_YIĞIT dizi[];
int üs;
int n;

    public yığıt(int n) {
        
       this.n = n;
       dizi=new VERİYAPILARI_YIĞIT[n];
       üs=-1;
        
    }
    VERİYAPILARI_YIĞIT ust(){return dizi[üs];}

   boolean dolumu(){return üs==n-1;}
   boolean boşmu(){return üs==-1;}
   void yıgıtaekle(VERİYAPILARI_YIĞIT yeni){
   if(dolumu()){System.out.println("yığıt dolu");}
   else {
   üs++;
   dizi[üs]=yeni;
       System.out.println(dizi[üs]);   
   }
   }
 VERİYAPILARI_YIĞIT  yıgıtsil(){
     
   if(boşmu()){System.out.println("yığıt boş");}
   else{ üs--;
   return dizi[üs];
   }
   return null;
   }



}

































