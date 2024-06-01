package graf;
class eleman{
eleman ileri;
int içerik;

    public eleman( int içerik) {
        ileri = null;
        this.içerik = içerik;
    }


}
public class komşuLİSTESİ {
    eleman bas,son=null;
    
   class liste{
   komşuLİSTESİ [] kenar;
   int n;

        public liste( int n) {
           
            this.n = n;
            kenar=new komşuLİSTESİ[n];
            for (int i = 0; i < n; i++) {
                kenar[i]=new komşuLİSTESİ();
            }
        }
   void kenarekle(int başlangıç, int bitiş){
   
   
   }
   void listeyeekle(int eleman){
   eleman e=new eleman(eleman);
   if(bas==null){bas=e;son=e;}
   else {
   son.ileri=e;
   son=e;
   }
   } 
   void kenargöster(){
       for (int i = 0; i < n; i++) {
           System.out.println(i+ " >> ");
           for (int j = 0; j <n; j++) {
               
           }
           System.out.println("");}
   }
   void listegöster(){
   
   }
   } 
    
    
    
}
