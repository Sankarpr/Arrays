//We can traverse over an array and search for an element.
public class SearchingElementInArray {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 5, 3};
        int key = -2;
        int ans = findElement(arr, key);
        System.out.println(ans);
    }
    static int findElement(int[] arr, int key) {
        int res = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == key) {
                return key;
            }
        }
        return -1;
    }
}
