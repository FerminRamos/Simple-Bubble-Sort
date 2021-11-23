public class BubbleSort {
    public static void main(String[] args){

        //TODO: Set up a file with unsorted integers (separated by space)?
        //Array of integers for sorting
        int[] unsortedArr = {1, 4, 7, 5, 2};

        //Bubble Sort
        int length = unsortedArr.length;
        for(int anchor = 0; anchor < length - 1; anchor++){
            for(int current = 0; current < length - anchor - 1; current++){

                int next = current + 1;

                if(unsortedArr[current] > unsortedArr[next]){
                    // Swap values
                    int temp = unsortedArr[current];
                    unsortedArr[current] = unsortedArr[next];
                    unsortedArr[next] = temp;
                }
            }
        }


        //Print Final Sorted Array
        System.out.print("Sorted Array: ");
        for(int i = 0; i < length; i++){
            System.out.print(unsortedArr[i] + " ");
        }
        System.out.print("\n");
    }
}
