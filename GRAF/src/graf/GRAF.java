package graf;

import com.sun.javafx.font.FontConstants;

public class GRAF {
 boolean matris[][];
 int num;

    public GRAF(int num) {
        this.num=num;
        matris= new boolean[num][num];
     //  grafa matdir ekleme işlemleri yapılrken bakılması gerekne  nsjarn  a
     
    }
    // komşuluk matrisi oluşturacak 
    
 public void kenarekle(int i, int j){
     matris[i][j]=true;
     matris[j][i]=true;}
 public void kenarçıkar(int i, int j){
  matris[i][j]=false;
  matris[j][i]=false;}
 
 
 // matrisin çıktını ekrana vercek 
 public String tostring(){
 String s="";
 for(int i=0;i<num;i++){
s=s+i+"";
 for(boolean j: matris[i]){
if(j) s=s+" "+1;
else s=s+" "+0;
}s=s+"\n";
 }
 return s;
 }
 
 
 
    public static void main(String[] args) {
   GRAF g= new GRAF(4);
   g.kenarekle(0, 1);
   g.kenarekle(0,2);
   g.kenarekle(1,2);
   g.kenarekle(2,0);
   g.kenarekle(2,3);
   g.kenarçıkar(0, 1);
        System.out.println(g.tostring());
    
    }
    
}
