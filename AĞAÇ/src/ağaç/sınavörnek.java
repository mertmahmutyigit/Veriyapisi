package ağaç;
class dgm{
int içerik;

    public dgm(int içerik) {
        this.içerik = içerik;
    }

}

public class sınavörnek {
    
    boolean maxheapmi(int d[]){ int i=0;
  boolean max=true;
    while (i<(d.length)/2) {   
      if(d[i]>d[2*i+1] && d[i]>d[2*i+2]) {max=true;}
      else {max=false; i=d.length;}
      i++;
    }

return max;

}
    public static void main(String[] args) {
       int d[]=new int [10];
      d[0]=109;
      d[1]=100;
      d[2]=14;
      d[3]=15;
      d[4]=8;
      d[5]=6;
      d[6]=3;
      d[7]=1;
      
              sınavörnek s= new sınavörnek();
        System.out.println(s.maxheapmi(d)); 
     
    }
}
