import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffleArray(array, 3)));
    }

    public static int[] shuffleArray(int[] nums, int n) {
        int[] shuffledArray = new int[2 * n];

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0 ) {
                shuffledArray[i] = nums[i / 2];
            } else {
                shuffledArray[i] = nums[n++];
            }
        }
        return shuffledArray;
    }
}

// 0 2 4 [i]
// 0 1 2 [i / 2]

