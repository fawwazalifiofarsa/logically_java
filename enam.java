package Logically;
public class enam {
    public static String check(int jumlah, int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if((array[i] + array[j]) == jumlah){
                    return "BISA";
                }
            }
        }
        return "TIDAK BISA";
    }

    public static void main(String[] args){
        int i, penutup;
        int [] array = {3, 4, 5, 9, 5}; 
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
        System.out.println(check(10, array));
    }
}
