package vizehazırlık;

public class tostring {
double r;

    public tostring() {
    r=1;
        
    }

    public tostring(double r) {
        this.r = r;
    }
    double yaz(){
    return r*r*r;
    }
    
    public String toString(){
    
    return "yarıçap "+ r+"alan"+yaz();
    }
    
    
    public static void main(String[] args) {
        tostring k=new tostring(2.4);
        System.out.println(k);
                
    }
}
