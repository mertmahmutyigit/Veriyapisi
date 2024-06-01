
package sınavvize;
//dizi ile yıgıt
class yıgıt{

 int dizi[];
 int N;
 int üst;


    public yıgıt(int N) {
        this.N=N;
        dizi=new int[N];
        üst=-1;
    }
   
    boolean dolumu(){
    if(üst==N-1) return true;
    else 
        return false;
    }
    boolean boşmu(){
    if(üst==-1)return true;
    else return false;
    
    }

    void ekle(int eleman){
     if(!dolumu()){ üst++; 
     dizi[üst]=eleman;}
     
    }
   int cıkar(){
       if(!boşmu()){üst--;
       return dizi[üst+1];}
       else 
           return 0;
      
       
}
void yazdır(){
int tmp=üst;
while(tmp!=-1){
    System.out.println(dizi[tmp] + "  ");
    tmp--;
}

}
    
}









public class SINAVVİZE {

 
    public static void main(String[] args) {
        yıgıt a=new yıgıt(10);
        a.ekle(1);
        a.ekle(5);
        a.ekle(17);
        a.ekle(45);
        a.cıkar();
        a.yazdır();
    }
    
}
