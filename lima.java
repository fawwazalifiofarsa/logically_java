package Logically;
public class lima {
    public static void main(String[] args){
        int i, indexTerbesar, penutup;
        int [] array = {7, 6, 2, 4, 9};
        penutup = array.length - 1;
        indexTerbesar = array[0];
        
        System.out.print("[");
        for (i = 0; i < array.length; i++){
            System.out.print(array [i]);
            if (i < penutup){
                System.out.print(", ");
            }else{
                System.out.print("] \n");
            }
        }
        
        for(i = 0; i < array.length; i++){
            if(indexTerbesar < array[i]){
                   indexTerbesar = array[i];
           }
        }
        System. out.println("Nilai terbesarnya adalah " + indexTerbesar);
    }
}