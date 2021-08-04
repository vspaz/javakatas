package sorting;

import java.util.Comparator;

public class ReverseComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer num_1, Integer num_2) {
        return num_2 - num_1;
    }
}
