package selectionsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

    private static <T extends Comparable<T>> List<T> sort(List<T> elements) {
        List<T> copyElements = new ArrayList<>(elements);
        for (int i = 0; i < copyElements.size() - 1; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < copyElements.size(); j++) {
                if (copyElements.get(j).compareTo(copyElements.get(minimumIndex)) < 0) {
                    minimumIndex = j;
                }
            }
            SwapElement.swap(copyElements,i,minimumIndex);
        }
        return copyElements;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23, 10, 14, 67, 4, -4);
        System.out.println(sort(numbers));
        List<String> strings = Arrays.asList("b", "a", "d", "z", "c", "z", "ba");
        System.out.println(sort(strings));
    }
}
