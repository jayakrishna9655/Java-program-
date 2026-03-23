package basic_programs;

class sortingData {
    public void sort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {          
            for (int j = 0; j < n - i - 1; j++) {  
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

public class sorting {
    public static void main(String[] args) {
        int arr[] = {5, 3, 1, 4, 2};

        sortingData obj = new sortingData();
        obj.sort(arr);
    }
}
