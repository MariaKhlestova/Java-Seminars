public class function1 {
public static int countEvens (int[] array) {
    int count = 0;
    for (int i=0; i < array.length; i++) {
        if (array[i] % 2 == 0){
            count++;
        }
    }
    return count;
}
    public static void main (String [] atgs) {
        int[] array1 = {2, 1, 2, 3, 4};
        int[] array2 = {2, 2, 0};
        int[] array3 = {1, 3, 5};

        System.out.println ("countEvens([2, 1, 2, 3, 4]) → " + countEvens(array1));
        System.out.println ("countEvens([2, 2, 0]) → " + countEvens(array2));
        System.out.println ("countEvens([1, 3, 5]) → " + countEvens(array3));
    }
}