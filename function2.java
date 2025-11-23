public class function2 {

    public static int MaxAndMin (int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException ("Массив не может быть пустым");
        }
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max-min;
    }

    public static void main (String[] args) {
        int[] array1 = {5, 3, 8, 1, 9, 2};
        int[] array2 = {10, 2, 5, 15, 7};
        int[] array3 = {5};

        System.out.println ("Разница между max и min в массиве [5, 3, 8, 1, 9, 2]: " + MaxAndMin(array1));
        System.out.println ("Разница между max и min в массиве [10, 2, 5, 15, 7]: " + MaxAndMin(array2));
        System.out.println ("Разница между max и min в массиве [5]: " + MaxAndMin(array3));
    }  
}
