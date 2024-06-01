// stringi tersten yazdır dizi ile
package sınavvize;

import javax.xml.datatype.DatatypeFactory;

class yıgıtters{
int n;
char [] str;
int indis;

    public yıgıtters(int n) {
   this.n=n;
   str=new char[n];
   indis=-1;
    
    }

    boolean boşmu(){
    if(indis==-1) return true;
    else return  false;
    
    }
    boolean dolumu(){
    if(indis==n-1)return  true;
    else 
        return false;
    }
    void ekle(char data){
    if(!dolumu()){
    indis++;
    str[indis]=data;
    }
    else{System.out.println("yığıt dolu");};
    
    }
    char cıkar(){
     //char el=str[indis];
    if(!boşmu())return str[indis--];
    return 0;
    }
}
public class STACK_tersyazdır {
    public static void main(String[] args) {
        String k="merhaba";
        char dizi[]=new char[k.length()];
        yıgıtters ters=new yıgıtters(100);
        for(int i=0;i<k.length();i++){
        dizi[i]=k.charAt(i);
        }
        for(int i=0;i<k.length();i++){
        ters.ekle(dizi[i]);
        
        }
        while(ters.boşmu()==false)
        System.out.print(ters.cıkar());
    }
 
}
