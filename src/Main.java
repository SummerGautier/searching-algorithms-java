import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args){
        int[] unsorted = {1,3,2,5,4};
        int[] expected = {1,2,3,4,5};

        List<Sorter> sorters = new ArrayList<>();
        sorters.add(new SelectionSorter());
        for(Sorter sorter : sorters) {
            System.out.println(String.format(" %s VALID? : %b", sorter.name(), assertSort(expected, unsorted,sorter)));
        }
    }
    public static boolean assertSort(int[] expected, int[] unsorted, Sorter sorter){
        int[] sorted = sorter.sort(unsorted);
        return Arrays.equals(expected, sorted);
    }
}