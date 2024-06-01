
package uygulamaörnek;
public class u{ 
    private String a;

public void sett(String isim){
a=isim;
}
public String get(){
    
return a;
}



}
class a{
    public static void main(String[] args) {
        u u1=new u();
        System.out.println(u1.get());
      u1.sett("sena");
      
        System.out.println(u1.get());
    }

}





