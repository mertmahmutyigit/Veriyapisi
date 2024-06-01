public class Ornek {
    void OrnekMethodu() {
        //işler burada
    }
}
 
class AltOrnekSinifi extends Ornek {
    void AltOrnekSinifiMethodu() {
        super.OrnekMethodu();  // ornek metodu çağırılıyor.
 
        //buraya eklemek istediğiniz işlevleri ekleyebilirsiniz.
    }
 
    //bu işlemi Ornek metodunu override ederekte yapabilirsiniz
 
    void superClassMetodu() {
        //super class metodu ezildi.
 
        super.superClassMetodu();
 
        //buraya eklemek istediğiniz işlevleri ekleyebilirsiniz.
 
    }
}