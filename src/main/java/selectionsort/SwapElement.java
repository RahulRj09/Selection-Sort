package selectionsort;

import java.util.List;

public class SwapElement {
    static <T> List<T> swap(List<T> elements, int a, int b) {
        T indexValue = elements.get(b);
        elements.set(b, elements.get(a));
        elements.set(a, indexValue);
        return elements;
    }
}
