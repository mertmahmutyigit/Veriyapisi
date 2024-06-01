package graf;

public class MATRİSGRAF {
  int [][]kenar;
  int tersmatris[][];
int n;

    public MATRİSGRAF(int n) {
        this.n=n;
        kenar= new int [n][n];
    for(int i=0; i<kenar.length;i++){
     
    for(int j=0;j<kenar.length;j++) {
    kenar[i][j]=0;
    
    }
    }  
    
    }
 void matrisgöster(int kenar[][]){
 for(int i=0;i<kenar.length;i++){System.out.print(i + " > ");
 for(int j=0;j<kenar.length;j++){
     System.out.print(kenar[i][j] + " ");
     
 }System.out.println();
 
 }
 
 
 
 }
void kenarekle(int başlangıç, int bitiş){
    kenar[başlangıç][bitiş]=1;
    } 
void kenargöster(int kenar[][]){
for(int i=0;i< kenar.length;i++){
    System.out.print(i + "==>");
for(int j=0;j<kenar.length;j++){
if(kenar[i][j]==1)System.out.print(j+"  ");
}
    System.out.println("");
}

}
void tresgraf(){

 tersmatris=new int[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <n; j++) {
            tersmatris[i][j]=0;
        }
       
    }
    for (int i = 0; i <kenar.length; i++) {
        for (int j = 0; j <kenar.length; j++) {
            if(kenar[i][j]==1)tersmatris[j][i]=1;
        }
    }
}
    public static void main(String[] args) {
        MATRİSGRAF m=new MATRİSGRAF(4);
        m.kenarekle(3, 1);
        m.kenarekle(3,2);
        m.kenargöster(m.kenar);
        m.matrisgöster(m.kenar);
        m.tresgraf();
        System.out.println("  ");
        m.matrisgöster(m.tersmatris);
    }
}
