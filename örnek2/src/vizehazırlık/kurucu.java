package vizehazırlık;
class ogrenci{
    
    String no;
    String isim;
    int vize;

    public ogrenci(String no, String isim, int vize) {
        this.no = no;
        this.isim = isim;
        this.vize = vize;
    }

    public ogrenci() {
   
    this("122","mert ", 555);
    }
    
   
    
    
}
public class kurucu {
    public static void main(String[] args) {
        ogrenci[] ogr=new ogrenci[5];
        ogr[0]=new ogrenci();
        System.out.println(ogr[0]);
    }
}
