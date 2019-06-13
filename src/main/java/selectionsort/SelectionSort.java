package selectionsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    private static List<Integer> sort(List<Integer> elements) {
        List<Integer> copyElements = new ArrayList<>(elements);
        for (int i = 0; i < copyElements.size() - 1; i++) {
            int minimumNumberPosition = i;
            for (int j = i + 1; j < copyElements.size(); j++) {
                if (copyElements.get(j) < copyElements.get(minimumNumberPosition)) {
                    minimumNumberPosition = j;
                }
                int temp = copyElements.get(minimumNumberPosition);
                copyElements.set(minimumNumberPosition, copyElements.get(i));
                copyElements.set(i, temp);
            }
        }
        return copyElements;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23, 10, 14, 67, 4, -4);
        System.out.println(sort(numbers));
    }
}
