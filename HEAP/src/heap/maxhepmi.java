
package heap;

public class maxhepmi {
    boolean mi=true;
      boolean maxheapmi(int d[], int n){
          
  for(int i=0;i<=(n-2)/2;i++){
  if(d[2*i+1]>d[i]){mi=false;}
  if(2*i+2<n && d[2*i+2]>d[i]) mi=false;
  }
  
 return mi;   }




    public static void main(String[] args) {
       int d[]=new int [10];
      d[0]=109;
      d[1]=10;
      d[2]=14;
      d[3]=15;
      d[4]=8;
      d[5]=6;
      d[6]=3;
      d[7]=1;
      int n=d.length;
      maxhepmi m=new maxhepmi();
        System.out.println(m.maxheapmi(d, n));
}
}