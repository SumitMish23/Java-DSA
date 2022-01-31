public class rotationCount {
    public static void main(String[] args) {
        int arr[] = { 81, 2, 3, 4, 5 };
        int start, end;
        start = 0;
        end = arr.length - 1;
        int rotationCount = Count(arr, start, end);
        System.out.println("The Arrays is Rotated " + rotationCount + " times");

    }

    public static int Count(int arr[], int start, int end) {

        while (start < end) {
            int mid = (start + end) / 2;

            if (arr[mid] > arr[mid + 1]) {
                return mid + 1;
            } else if (arr[mid] < arr[mid + 1] && arr[mid] < arr[start]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1] && arr[mid] >= arr[start]) {
                start = mid + 1;
            }
        }
        return 0;

    }
}
