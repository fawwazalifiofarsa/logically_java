package Logically;
public class tiga {
    public static void main(String[] args) {
        int bil, i, hasil;
        i = 1;
        hasil = 0;
        bil = 8;
        System.out.println("Bilangan = " + bil);
        System.out.print("Jumlah bilangan = ");
        for(i = 1; i <= bil; i++){
            hasil += i;
            System.out.print(i);
            if(i < bil){
                System.out.print(" + ");
            }else{
                System.out.print(" = ");
            }
        }
        System.out.println(hasil + "\n");
        
        hasil = 0;
        bil = 13;
        System.out.println("Bilangan = " + bil);
        System.out.print("Jumlah bilangan = ");
        for(i = 1; i <= bil; i++){
            hasil += i;
            System.out.print(i);
            if(i < bil){
                System.out.print(" + ");
            }else{
                System.out.print(" = ");
            }
        }
        System.out.println(hasil + "\n");
    }
}
