package percabangan;

public class IfElse {
    public static void main(String[] args){
        double totalBelanja = 100000;
        double uangDiDompet = 50000;

        if(uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, kurangi jajan anda");
        }else{
            System.out.println("Uang cukup... selamat menikmati..");
        }
    }
}
