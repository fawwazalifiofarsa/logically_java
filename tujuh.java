package Logically;
public class tujuh {
    public static String duplicate(int [] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]){
                    return "TIDAK ADA";
                }
            }
        }
        return "ADA";
    }

    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 4};        
        System.out.println(duplicate(array));
    }
}
