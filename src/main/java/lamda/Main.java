package lamda;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        sumOfArray(arr);
    }

    static void sumOfArray(int[] arr){
        System.out.println(Arrays.stream(arr)
                .map(e -> {
                    if (e % 2 == 0)
                        e *= 3;
                    else
                        e *= 5;
                    return e;
                })
                .filter(e -> e > 25)
                .reduce(Integer::sum)
                .getAsInt());
    }
}
