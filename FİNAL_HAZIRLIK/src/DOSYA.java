// exısts() dosya yoksa 
// isFile() klasör mü
// list() listele
//
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DOSYA {
    public static void main(String[] args) {
        File dosya=new File("rakamlar.txt");
        File dosya2=new File("final.txt");
        try {PrintWriter yaz=new PrintWriter(dosya);
            Scanner oku=new Scanner(dosya2);
            while(oku.hasNext()){  String okunan=oku.next();// next() boşluğa kadar alıyor diğerlerini alt satıra atıyor 
                                      System.out.println(okunan);                          // netline() tüm satırı alıyor
      
      yaz.print(okunan + " ");
      
            }
          
           yaz.close(); 
            
        } catch (Exception e) {
        }
  // dosya.delete() dosyayı siler
    }

}
