package Logically;
public class empat {
    public static void main(String[] args) {
        int i, penutup;
        int [] array = {8, 10, 3, 2, 9};
        penutup = array.length - 1;
        
        System.out.print("[");
        for (i = 0; i < array.length; i++){
            System.out.print(array [i]);
            if (i < penutup){
                System.out.print(", ");
            }else{
                System.out.print("] \n");
            }
        }
        
        System.out.print("[");
        for (i = 0; i < array.length; i++){
            if (array [i] % 2 == 0) {
                System.out.print("Genap");
                if (i < penutup){
                    System.out.print(", ");
                }else{
                    System.out.print("] \n");
                }
            }
            if (array [i] % 2!= 0){
                System.out.print("Ganjil");
                if (i < penutup){
                    System.out.print(", ");
                }else{
                    System.out.print("] \n");
                }
            }
        } 
    }
}

    
