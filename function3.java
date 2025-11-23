public class function3 {
    public static boolean Truee (int[] array) {
        if (array == null || array.length < 2) {
            return false;
        }

        for (int i = 0; i < array.length -1; i++) {
            if (array[i] == 0 && array[i+1] == 0) {
                return true;
            }
        }
        return false;
    }
    
    public static void main (String[] args) {
        int[] array1 = {0, 1, 0, 0, 2};
        int[] array2 = {1, 2, 0, 3, 0};
        int[] array3 = null;

        System.out.println ("[0, 1, 0, 0, 2]: " + Truee(array1));
        System.out.println ("[1, 2, 0, 3, 0]: " + Truee(array2));
        System.out.println ("null: " + Truee(array3));
    }  
}
